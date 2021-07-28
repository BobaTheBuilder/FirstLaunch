class GoodWalker(private val velocity: Int = 8) : IWalker {
    override fun walk(): String {
        return "I`m a good walker, and my speed is $velocity km/h"
    }
}
