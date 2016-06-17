
// command-line arguments
// val size = args[0].toInt()
// triangle(size)

// list many arguments // spaces doesn't matter
for (s in args)
    println(s)
// if args is a list of length zero, for loop does nothing

// fail safe 
if (args.size == 1) {
    val size = args[0].toInt()
    triangle(size)
} else {
    println("Usage: ... script.kts <size>")
}



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


