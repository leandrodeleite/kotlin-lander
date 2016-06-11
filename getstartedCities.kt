
fun main (args: Array<String>) {

    val countriesCities = listOf(
        Pair("England", "London"),
        Pair("France",  "Paris"),
        Pair("Germany", "Mainz")
    )

    for ( (country, city) in countriesCities ) {
        println("Country: ${country} - City: ${city}")
    }

}

