class SheeshWalker(private val velocity: Int = 5) : IWalker {
    override fun walk() {
        val speed: Speed = Speed(velocity)
        println("I`m a sheesh walker walker and my ")
        speed.showSpeedConsole()
    }
}