class SadWalker(private val velocity: Int = 5) : IWalker {
    override fun walk() {
        val speed: Speed = Speed(velocity)
        println("I`m a sad walker and my ")
        speed.showSpeedConsole()
    }
}