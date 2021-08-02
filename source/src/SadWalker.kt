class SadWalker(private val velocity: Int = 5) : IWalker {
    override fun walk(): String {
        return "I`m a sad walker, and my speed is $velocity km/h"
    }
}
