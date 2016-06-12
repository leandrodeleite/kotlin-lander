
fun main(args: Array<String>) {

    val numbers = arrayListOf(1, 2, 3, 4, 5, 6)
    println(numbers)

    val even = numbers.filter { it % 2 == 0 }

    val odd = numbers.filter { it % 2 == 1 }
 

    println("Even numbers are: $even")
    println("Odd numbers are:  $odd")

    println("Even numbers are: ${even}")
    println("Odd numbers are:  ${odd}")

}

