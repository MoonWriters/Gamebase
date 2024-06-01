package eu.moonwriters.gamebase.phase

interface GamePhase {

    fun run()
    fun doAt(runnable: Runnable, vararg time: Int): Boolean

}