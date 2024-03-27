package com.stu25956.assign2_25956

import kotlin.random.Random

object MoviesData {
    val movieList = listOf(
        Movie(
            name = "DUNE: PART TWO",
            image = R.drawable.dune_poster,
            certification = R.drawable.cert_12a,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family.\n",
            starring = arrayOf ("Timothée Chalamet,", "Florence Pugh,", "Zendaya," , "Souheila Yacoub"),
            runningTimeMins = 166,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 0,
        ),
        Movie(
            name = "GHOSTBUSTERS",
            image = R.drawable.ghostbusters_poster,
            certification = R.drawable.cert_12a,
            description = "In Ghostbusters: Frozen Empire, the Spengler family returns to where it all started – the iconic New York City firehouse – " +
                    "to team up with the original Ghostbusters, who’ve developed a top-secret research lab to take busting ghosts to the next level.\n",
            starring = arrayOf("Paul Rudd,", "Bill Murray,", "Finn Wolfhard"),
            runningTimeMins = 144,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 1
        ),
        Movie(
            name = "IMMACULATE",
            image = R.drawable.immaculate_poster,
            certification = R.drawable.cert_16,
            description = "Cecilia, a woman of devout faith, is warmly welcomed to the picture-perfect " +
                    "Italian countryside where she is offered a new role at an illustrious convent. " +
                    "But it becomes clear to Cecilia that her new home harbors dark and horrifying secrets.\n",
            starring = arrayOf("Sydney Sweeney,", "Benedetta Porcaroli,", "Álvaro Morte,", "Simona Tabasco"),
            runningTimeMins = 89,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 2
        ),
        Movie(
            name = "IMAGINARY",
            image = R.drawable.imaginary_poster,
            certification = R.drawable.cert_15a,
            description = "From Blumhouse, the genre-defining masterminds behind FIVE NIGHTS AT FREDDY’S and M3GAN. " +
                    "When Jessica (DeWanda Wise) moves back into her childhood home with her family, her youngest stepdaughter Alice (Pyper Braun) develops an eerie attachment" +
                    " to a stuffed bear named Chauncey she finds in the basement.\n",
            starring = arrayOf("Betty Buckley,", "DeWanda Wise,", "Tom Payne"),
            runningTimeMins = 104,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 3
        ),
        Movie(
            name = "WICKED LITTLE LETTERS",
            image = R.drawable.wicked_poster,
            certification = R.drawable.cert_15a,
            description = "A 1920s English seaside town bears witness to a dark and absurd scandal in this riotous mystery comedy. " +
                    "Based on a stranger than fiction true story.\n",
            starring = arrayOf("Olivia Colman,", "Timothy Spall,", "Eileen Atkins,", "Gemma Jones"),
            runningTimeMins = 100,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 4
        ),
        Movie(
            name = "BOB MARLEY: ONE LOVE",
            image = R.drawable.bob_poster,
            certification = R.drawable.cert_12a,
            description = "BOB MARLEY: ONE LOVE celebrates the life and music of an icon who inspired generations through his message of love and unity. " +
                    "On the big screen for the first time, discover Bob’s powerful story of overcoming adversity and the journey behind his revolutionary music.\n",
            starring = arrayOf("Lashana Lynch,", "Tosin Cole,", "Kingsley Ben-Adir,", "James Norton,", "Anthony Welsh"),
            runningTimeMins = 110,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 5
        ),
    )
}