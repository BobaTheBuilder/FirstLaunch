class GoodWalker(val velocity: Int) : IWalker {
    override fun walk() {
        val speedOfGoodWalker: Speed = Speed(velocity)
        println("I`m a good walker, and my ")
        speedOfGoodWalker.showSpeedConsole()
    }
}
