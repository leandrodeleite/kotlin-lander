
val L = listOf("CS109", "is", "the", "best")

println(L)

println(L.size)

println(L[0])
println(L[3])

println()

for (e in L)
    println(e)

println()

println(L.lastIndex)

// list is a List<string>
// List is a parameterized type
// type of the objects stored inside the list

println()

for (i in L.indices)
    println("$i: ${L[i]}")


