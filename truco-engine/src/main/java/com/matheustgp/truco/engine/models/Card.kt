package com.matheustgp.truco.engine.models

data class Card(
    val value: Value,
    val suit: Suit
) {
    fun render(): List<String> {
        val suitSymbol = when (suit) {
            Suit.PAUS -> "♣"
            Suit.COPAS -> "♥"
            Suit.ESPADAS -> "♠"
            Suit.OURO -> "♦"
        }
        val valueText = when (value) {
            Value.AS -> "A"
            Value.DOIS -> "2"
            Value.TRES -> "3"
            Value.QUATRO -> "4"
            Value.CINCO -> "5"
            Value.SEIS -> "6"
            Value.SETE -> "7"
            Value.VALETE -> "J"
            Value.DAMA -> "Q"
            Value.REIS -> "K"
        }

        return listOf(
            "┌─────────┐",
            "│ $valueText       │",
            "│         │",
            "│    $suitSymbol    │",
            "│         │",
            "│       $valueText │",
            "└─────────┘"
        )
    }
    override fun toString(): String {
        val suitSymbol = when(suit) {
            Suit.PAUS -> "♣"
            Suit.COPAS -> "♥"
            Suit.ESPADAS -> "♠"
            Suit.OURO -> "♦"
        }
        return "${value.name} $suitSymbol"
    }
}

enum class Suit(val power: Int) {
    PAUS(4),
    COPAS(3),
    ESPADAS(2),
    OURO(1),
}

enum class Value(val power: Int) {
    TRES(10), DOIS(9), AS(8),
    DAMA(7), VALETE(6), REIS(5),
    SETE(4), SEIS(3), CINCO(2), QUATRO(1)
}