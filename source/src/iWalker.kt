interface iWalker {
    val curSpeed: Int
    fun walk()
    fun stop()
    fun currentSpeed()
    fun printAllInfo()
}

class ZombieWalker(): iWalker {
    override val curSpeed: Int
        get() = 1

    override fun walk() {
        println("BRAINS! BRAINS! BRAINS!")
    }

    override fun stop() {
        println("Grrrrr. Ahhhhhh. Uhhhh.")
    }

    override fun currentSpeed() {
        println("Zombie speed is $curSpeed km/h")
    }

    override fun printAllInfo() {
        this.walk()
        this.currentSpeed()
    }
}
