
//   class Customer(val name: String, val email: String) //  Customer@1234abcd
data class Customer(val name: String, val email: String) //  Customer("..,..")

fun main(args: Array<String>) {

    val customer = Customer("John Smith", "john.smith@somewhere.com")
    println(customer)

}

