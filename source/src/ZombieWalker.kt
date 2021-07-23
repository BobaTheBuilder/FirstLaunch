class ZombieWalker(private val velocity: Int = 1) : IWalker {
    override fun walk() {
        val speedOfZombieWalker: Speed = Speed(velocity)
        println("I`m a zombie walker, and my ")
        speedOfZombieWalker.showSpeedConsole()
    }
}