class SadWalker(private val velocity: Int = 5) : IWalker {
    override fun walk(speed: Int) {
        println("I`m a sad walker and my speed is $velocity")
    }
}