class GoodWalker(private val velocity: Int = 8) : IWalker {
    override fun walk() {
        val speedOfGoodWalker: Speed = Speed(velocity)
        println("I`m a good walker, and my ")
        speedOfGoodWalker.showSpeedConsole()
    }
}