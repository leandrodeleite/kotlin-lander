
fun main(args: Array<String>) {

    val msgNo  = "You cannot register."
    val msgYes = "You're good to go!"
    val msgMaybe = "Well, maybe you can register"

    val age3: Int = 20
    println(age3)

    if (age3 < 18) {
        println(msgNo)
    } else if (age3 < 21) {
        println(msgMaybe)
    } else {
        println(msgYes)
    }




    val age2: Int = 18
    println(age2)

    if (age2 < 18) {
        println(msgNo)
    } else {
        println(msgYes)
    }



    val age1: Int = 15
    println(age1)

    if (age1 < 18) {
        println(msgNo)
    }

}

