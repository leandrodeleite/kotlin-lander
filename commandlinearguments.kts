
// triangle

fun triangle(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) print("*")
        println()
    }
}


// fixed size
val fixedsize = 5
triangle(fixedsize)


// command-line arguments
val size = args[0].toInt()
triangle(size)


// list many arguments // spaces doesn't matter
for (s in args)
    println(s)




