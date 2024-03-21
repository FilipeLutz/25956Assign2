package com.stu25956.assign2_25956

import kotlin.random.Random

fun Movies() {
    // Obtain movie data from Vue or other providers (mock data used here)
    val movies = listOf(
        Movie(
            name = "DUNE: PART TWO",
            image = "/jssmedia/vuecinemas/img/import/7a7a20aa-1064-46fd-96cc-4b271268f2c5_dune-part-ii_posters_one-sheet_712px.jpg?mw=450&rev=c61dcb539042435c973daaeeb97100b6",
            certification = "12A",
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against the conspirators who destroyed his family. Facing a choice between the love of his life and the fate of the known universe, he endeavors to prevent a terrible future only he can foresee.",
            starring = listOf("Timothée Chalamet", "Florence Pugh", "Zendaya" , "Souheila Yacoub", "Austin Butler"),
            runningTimeMins = 166,
            seatsRemaining = Random.nextInt(16) // Random value between 0 and 15 for seatsRemaining
        ),
        Movie(
            name = "BOB MARLEY: ONE LOVE",
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/bob-marley-one-love_posters_bmol_intl_dgtl_teaser_1sheet_2025x3000_spotlight_uk_712px.jpg?mw=450&rev=1fb201cf08754f18b77f98fd4f28ed4b",
            certification = "12A",
            description = "BOB MARLEY: ONE LOVE celebrates the life and music of an icon who inspired generations through his message of love and unity. On the big screen for the first time, discover Bob’s powerful story of overcoming adversity and the journey behind his revolutionary music. Produced in partnership with the Marley family and starring Kingsley Ben-Adir as the legendary musician and Lashana Lynch as his wife Rita.",
            starring = listOf("Lashana Lynch", "Tosin Cole", "Kingsley Ben-Adir", "James Norton", "Anthony Welsh"),
            runningTimeMins = 110,
            seatsRemaining = Random.nextInt(16)
        ),
        Movie(
            name = "WICKED LITTLE LETTERS",
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/2f93acca-53ff-41f7-a57c-42d191057f02_wicked-little-letters_posters_wicked-little-letters-poster-uk--.jpg?mw=450&rev=19d4909958cd40759403c26e7762f30d",
            certification = "15A",
            description = "A 1920s English seaside town bears witness to a dark and absurd scandal in this riotous mystery comedy. Based on a stranger than fiction true story, WICKED LITTLE LETTERS follows two neighbours: deeply conservative local Edith Swan (Olivia Colman) and rowdy Irish migrant Rose Gooding (Jessie Buckley). When Edith and fellow residents begin to receive wicked letters full of unintentionally hilarious profanities, foulmouthed Rose is charged with the crime. The anonymous letters prompt a national uproar, and a trial ensues. However, as the town's women - led by Police Officer Gladys Moss (Anjana Vasan) - begin to investigate the crime themselves, they suspect that something is amiss, and Rose may not be the culprit after all.",
            starring = listOf("Olivia Colman", "Timothy Spall", "Eileen Atkins", "Gemma Jones", "Anjana Vasan", "Jessie Buckley"),
            runningTimeMins = 100,
            seatsRemaining = Random.nextInt(16)
        ),
        Movie(
            name = "IMAGINARY",
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/f607e5c8-c8db-4dbb-92d0-dad9ab8c68c3_imaginary_posters_imaginary_1sheet_686x1016_712px.jpg?mw=450&rev=795a2eed0ad641b297101bd70e72eca7",
            certification = "15A",
            description = "From Blumhouse, the genre-defining masterminds behind FIVE NIGHTS AT FREDDY’S and M3GAN. When Jessica (DeWanda Wise) moves back into her childhood home with her family, her youngest stepdaughter Alice (Pyper Braun) develops an eerie attachment to a stuffed bear named Chauncey she finds in the basement. Alice starts playing games with Chauncey that begin playful and become increasingly sinister. As Alice’s behaviour becomes more and more concerning, Jessica intervenes only to realize Chauncey is much more than the stuffed toy bear she believed him to be.",
            starring = listOf("Betty Buckley", "DeWanda Wise", "Tom Payne"),
            runningTimeMins = 104,
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