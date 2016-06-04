
class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun main(args: Array<String>) {
    Greeter(args[0]).greet()
}

/*
    Here we have a
    'class' with a primary contructor and
    a member function

    Note that there's no
    'new' keyword used to create an object

    classes #classes
*/
