
fun main(args: Array<String>) {

    val numbers = arrayListOf(1, 2, 3, 4, 5, 6)
    println(numbers)

    println(numbers.filter { it % 2 == 0 } )

    println(numbers.filter { it % 2 == 1 } )

}

