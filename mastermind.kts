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

    while(true) {
        showHistory(history, current, secret)
        if (current == MaxNumGuesses) {
            println("My secreta was $secret, you failed to find it in $current guesses!")
            return
        }
    }

  
}

main()

