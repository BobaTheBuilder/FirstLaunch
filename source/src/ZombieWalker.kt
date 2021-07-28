class ZombieWalker(private val velocity: Int = 1) : IWalker {
    override fun walk(): String {
        return "I`m a zombie walker, and my speed is $velocity km/h"
    }
}
