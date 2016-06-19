//
// Mastermind game
//

fun createSecret() {
}


// main game
fun main() {
    val secret = createSecret()
    val history = Array<String>(MaxNumGuesses) { "" }
    val current = 0

    println("Welcome to Mastermind!")
    println("I have created a secret combination:")
    println("Four distinct letters from A - F.")
    println("You haba $MaxNumGuesses guesses to find it.")

  
}

main()

