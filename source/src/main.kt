fun main(){
    val listOfHumanoids: MutableList<Human> = mutableListOf()
    for (i in (1..10))
        listOfHumanoids.add(HumanFactory.generateNewHuman())

    for (n in listOfHumanoids){
        println("I`m a ${n.gender}. My weight is ${n.weight}kg and my height is ${n.height}cm")
        n.Interface?.walk(n.speed)
    }
}