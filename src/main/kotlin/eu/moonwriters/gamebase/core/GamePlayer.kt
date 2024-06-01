package eu.moonwriters.gamebase.core

import java.util.UUID

interface GamePlayer {

    fun uniqueId(): UUID
    fun name(): String
}