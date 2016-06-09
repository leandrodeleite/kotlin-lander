
import java.util.Random

fun main(args: Array<String>) {
    val random = Random().nextInt(50)
    println(random)

    when (random) {
        in  1..10 -> println("Range from  1 to 10")
        in 11..20 -> println("Range from 11 to 20")
        in 21..30 -> println("Range from 21 to 30")
        in 31..40 -> println("Range from 31 to 40")
        else      -> println("Over 40")             // it gets wrong when random <= 0 

//        random > 40 -> println("Above 40")        // error: incompatible types
//        (> 40) -> println("Over 40")              // error: expecting expression/'->'
    }
}

