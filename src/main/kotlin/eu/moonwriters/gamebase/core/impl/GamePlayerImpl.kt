package eu.moonwriters.gamebase.core.impl

import eu.moonwriters.gamebase.core.GamePlayer
import org.bukkit.entity.Player
import java.util.*

class GamePlayerImpl(
    private val player: Player?
) : GamePlayer {

    override fun uniqueId(): UUID {
        return player!!.uniqueId
    }

    override fun name(): String {
        return player!!.name
    }
}