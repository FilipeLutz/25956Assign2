package com.stu25956.assign2_25956

import kotlin.random.Random

fun movies() {
    // Obtain movie data from Vue or other providers (mock data used here)
    val movies = listOf(
        Movie(
            name = "DUNE: PART TWO",
            image = "/jssmedia/vuecinemas/img/import/7a7a20aa-1064-46fd-96cc-4b271268f2c5_dune-part-ii_posters_one-sheet_712px.jpg?mw=450&rev=c61dcb539042435c973daaeeb97100b6",
            certification = "12A",
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against the conspirators who destroyed his family.",
            starring = listOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            runningTimeMins = 166,
            seatsRemaining = Random.nextInt(16) // Random value between 0 and 15 for seatsRemaining
        ),
        Movie(
            name = "",
            image = "",
            certification = "",
            description = "",
            starring = listOf(""),
            runningTimeMins = 0,
            seatsRemaining = Random.nextInt(16)
        ),
        Movie(
            name = "",
            image = "", // Placeholder URL
            certification = "",
            description = "",
            starring = listOf(""),
            runningTimeMins = 0,
            seatsRemaining = Random.nextInt(16)
        ),
        Movie(
            name = "",
            image = "",
            certification = "",
            description = "",
            starring = listOf(""),
            runningTimeMins = 0,
            seatsRemaining = Random.nextInt(16)
        )
    )

    // Data credits to the bottom of the app
    println("Data obtained from Vue website")

    // Iterate over movies to display information
    for (movie in movies) {
        println("Movie: ${movie.name}")
        println("Certification: ${movie.certification}")
        println("Description: ${movie.description}")
        println("Starring: ${movie.starring.joinToString(", ")}")
        println("Running Time: ${movie.runningTimeMins} mins")
        println("Seats Remaining: ${movie.seatsRemaining}")
        println("Seats Selected: ${movie.seatsSelected}")
        println("Image URL: ${movie.image}")
        println()
    }

    // Check if any seats are selected and hide remaining seats if so
    for (movie in movies) {
        if (movie.seatsSelected > 0) {
            println("For ${movie.name}:")
            println("Seats selected: ${movie.seatsSelected}")
            println("Remaining seats: Hidden")
            println()
        }
    }
}