
fun main(args: Array<String>) {
    if (args.size() == 0) {
        println("Provide a name")
        return
    }
    println("Hello, ${args[0]}!")
}

// error: expression 'size' of type 'Int' cannot be invoked as a function. The function 'invoke()' is not found

