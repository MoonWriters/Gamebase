package eu.moonwriters.gamebase.listener.impl

import eu.moonwriters.gamebase.core.GamePlayer
import eu.moonwriters.gamebase.listener.GameEvent

class GamePlayerQuitEvent(
    private val player: GamePlayer
) : GameEvent {

    fun player(): GamePlayer {
        return player
    }
}