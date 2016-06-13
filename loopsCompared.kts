

println("While loop")   // 1 to 9

var i = 1

while (i < 10) {
    println("$i\t: ${i * i}")
    i += 1
}


println("For loop")     // 1 to 9

for (i in 1 until 10)
    println("$i\t: ${i * i}")


println("For loop")     // 1 to 10

for (i in 1 .. 10)
    println("$i\t: ${i * i}")


println("For loop")     // 1 to 10

for (i in 1 .. 10) {
    println("$i\t: ${i * i}")
}


