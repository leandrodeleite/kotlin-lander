
var a = Pair(3, 5)

println(a)
println("a.first " + a.first)
println("a.second " + a.second)

// "unpack", parentheses required

val (x, y) = a

// println(x)
// println(y)
// error: unresolved reference: ...
//
// println($x)
// println($y)
// error: ...

val b = Pair(2, 7.9)

println(b)
println("b.first " + b.first)
println("b.second " + b.second)

// "unpack" works correctly inside functions
fun unpacker(b: Pair<Int, Double>) {
    val (x, y) = b
    println("$b consists of $x and $y")
}

unpacker(b)

