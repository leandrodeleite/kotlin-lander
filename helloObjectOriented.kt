
class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter(args[0]).greet()
}

/*
    Class with a primary contructor and
    a member function

    Note there's no
    'new' keyword used to create an object

*/
