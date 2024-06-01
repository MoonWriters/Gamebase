package eu.moonwriters.gamebase

import eu.moonwriters.gamebase.core.GamePlayer
import eu.moonwriters.gamebase.core.impl.GamePlayerImpl
import org.bukkit.Bukkit
import org.bukkit.plugin.Plugin
import java.util.UUID

class Gamebase(
    internal val plugin: Plugin
) {

    fun player(uuid: UUID): GamePlayer {
        return GamePlayerImpl(Bukkit.getPlayer(uuid))
    }

    fun allPlayers(): List<GamePlayer> {
        val allPlayers = ArrayList<GamePlayer>()
        for (player in Bukkit.getOnlinePlayers()) {
            allPlayers.add(GamePlayerImpl(player))
        }
        return allPlayers
    }

    fun alivePlayers(): List<GamePlayer> {
        val alivePlayers = ArrayList<GamePlayer>()
        for (player in allPlayers()) {
            // TODO: check if is alive
        }
        return alivePlayers
    }

    fun spectatingPlayers(): List<GamePlayer> {
        val spectatingPlayers = ArrayList<GamePlayer>()
        for (player in allPlayers()) {
            // TODO: check if is spectating
        }
        return spectatingPlayers
    }
}