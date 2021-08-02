open class Human(var speed: Int = 0, var weight: Int = 0, var height: Int = 0, var gender: String = "", var walker: IWalker? = null)

object HumanFactory {
    fun generateNewHuman(): Human {
        val human: Human = Human()
        val randomChoice = (1..2).random()
        if (randomChoice == 1) {
            human.gender = "Male"
            human.weight = (60..200).random()
            human.height = (160..220).random()
            human.speed = (9..15).random()
        } else {
            human.gender = "Female"
            human.weight = (40..60).random()
            human.height = (150..180).random()
            human.speed = (1..10).random()
        }
        when (human.speed) {
            in 1..3 -> {
                human.walker = ZombieWalker(human.speed)
            }
            in 4..6 -> {
                human.walker =
                    SadWalker(human.speed)
            }
            in 7..10 -> {
                human.walker = GoodWalker(human.speed)
            }
            in 11..15 -> {
                human.walker = SheeshWalker(human.speed)
            }
        }
        return human
    }
}
