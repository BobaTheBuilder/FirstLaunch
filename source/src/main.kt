fun main(){
    val listOfHumanoids = listOf(HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman(),
        HumanFactory.generateNewHuman())

    for (n in listOfHumanoids){
        println("I`m a ${n.gender}. My weight is ${n.weight}kg and my height is ${n.height}cm")
        n.walk()
    }
}