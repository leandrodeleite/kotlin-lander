
/*
    Kotlin function definitions
    look very much like
    mathematical function definitions

    f: ZxZ->Z, f(a,b) = a+b

    Indicates type of each parameter of the function as well as the type of the result.
*/

    fun f(a: Int, b:Int): Int = a + b

    println( f(3 , 9) )


/*
    The body of the function is either
    a single expression, or
    it consists of several statements 
    surrounded by curly braces.

    Indentation has no meaning to Kotlin compiler

    Have to write
    'name: type' of each parameter for a Kotlin function
    Result type is actually optional, guessed by the compiler
    but makes easier to read,
    and allows compiler to find errors early
*/

fun g(a: Int, b:Int) : Int {
    val m = a*a - b*b
    val s = a-b
    return m/s
}

    println( g(10,1) )

/*
    Every function returns a value
    Functions that does not need return a value
    will return the value Unit (the only object of the type Unit)
*/

fun greetU(name: String) : Unit {
    println("Hello " + name)
}

greetU("Unit!")


// Or written like

fun greetNo(name: String) {
    println("Hello " + name)
}

greetNo("No!")


