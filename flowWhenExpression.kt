
fun main(args: Array<String>) {


    val mode: Int = 2


    val result = when (mode) {
        1 -> "The mode is lazy."
        2 -> {
            "The mode is two" +
            // warning: the expression is used
            "So the mode is busy."
            // println("from the expression")
            // val i: Int = 3
        }
        3 -> "The mode is super-productive."
        else -> "I don't know that mode."
    }

    println("");
    println(result)
    println("");



    when (mode) {
        1 -> println("The mode is lazy.")
        2 -> {
            println("The mode is two")
            println("So the mode is busy.")
        }
        3 -> println("The mode is super-productive.")
        else -> println("I don't know that mode.")
    }



}

