interface iWalker {
    val curSpeed: Int
    fun walk()
    fun stop()
    fun currentSpeed()
    fun printAllInfo()
}

class GoodWalker(): iWalker {
    override val curSpeed: Int
        get() = 6

    override fun walk() {
        println("Good walker is going!")
    }

    override fun stop() {
        println("Good walker has stopped going!")
    }

    override fun currentSpeed() {
        println("My speed is $curSpeed km/h")
    }

    override fun printAllInfo() {
        this.walk()
        this.currentSpeed()
    }
}

