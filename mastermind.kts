//
// Mastermind game
//

val MaxNumGuesses = 10
val random = java.utils.Random()

// Create secret: four distinct letters from A-F.
fun createSecret(): String {
}

// read a guess from the terminal
fun getGuess(): String {
}

// Compute (pos, let) where pos is the number of correct letters in
// the correct position, and let is the number of correct letters in
// the wrong position.
fun evaluateGuess(secret: String, guess: String,) Pair<Int, Int> {
}

// Show history of guessing
fun showHistory (h: Array<String>, current:Int, secret: String) {
}



// main game
fun main() {
    val secret = createSecret()
    val history = Array<String>(MaxNumGuesses) { "" }
    val current = 0

    println("Welcome to Mastermind!")
    println("I have created a secret combination:")
    println("Four distinct letters from A - F.")
    println("You have $MaxNumGuesses guesses to find it.")

    while(true) {
        showHistory(history, current, secret)
        if (current == MaxNumGuesses) {
            println("My secreta was $secret, you failed to find it in $current guesses!")
            return
        }

        val guess = getGuess()
        history[current] = guess
        current += 1
        val pos = evaluateGuess(secret, guess).first
        if (pos == 4) {
            println("My secret was $secret, you guessed correctly in $current guesses!")
            return
        }

    }
  
}

main()

