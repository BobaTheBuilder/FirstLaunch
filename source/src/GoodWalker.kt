class GoodWalker(private val velocity: Int) : IWalker {
    override fun walk(speed: Int) {
        println("I`m a good walker, and my speed is $velocity")
    }
}
