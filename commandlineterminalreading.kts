
// 
// print out a prompt and let user type in a string

fun readString(prompt: String): String {
    println("Message from " + prompt)
    System.out.flush()
    return readLine() ?: ""
}

readString(args[0])

