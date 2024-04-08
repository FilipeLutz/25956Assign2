package com.stu25956.assign2_25956

/**
 * CA2 - Movie Booking App
 * Filipe Lutz Mariano 25956
 */

import kotlin.random.Random

// This object holds the list of Movies.
object MovieList {
    //This is the list of Movie objects. Each Movie object represents a movie with its details.
    val movieList = listOf(
        //This is the first Movie object that represents the movie "DUNE: PART TWO".
        Movie(
            name = "DUNE: PART TWO",
            image = "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/7a7a20aa-1064-46fd-96cc-4b271268f2c5_dune-part-ii_posters_one-sheet_712px.jpg?mw=450&rev=c61dcb539042435c973daaeeb97100b6", //R.drawable.dune_poster,
            certification = "https://www.myvue.com/-/media/vuecinemas/img/certificates/ie/12a.png?rev=d1b78b8f625a43b098703bf1bf397269", //R.drawable.cert_12a,
            description = "Paul Atreides unites with Chani and the Fremen while on a warpath of revenge against" +
                    " the conspirators who destroyed his family.\n",
            starring = arrayOf ("Timothée Chalamet,", "Florence Pugh,", "Zendaya," , "Souheila Yacoub"),
            runningTimeMins = 166,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 0,
        ),
        //This is the second Movie object that represents the movie "GHOSTBUSTERS: FROZEN EMPIRE".
        Movie(
            name = "GHOSTBUSTERS: FROZEN EMPIRE",
            image = "https://www.myvue.com/-/media/vuecinemas/film-and-events/feb-2024/ghostbusters-poster.jpg?rev=890c7016efc4412293629c8d63844732", //R.drawable.ghostbusters_poster,
            certification = "https://www.myvue.com/-/media/vuecinemas/img/certificates/ie/12a.png?rev=d1b78b8f625a43b098703bf1bf397269", //R.drawable.cert_12a,
            description = "In Ghostbusters: Frozen Empire, the Spengler family returns to where it all started – the iconic New York City firehouse – " +
                    "to team up with the original Ghostbusters, who’ve developed a top-secret research lab to take busting ghosts to the next level.\n",
            starring = arrayOf("Paul Rudd,", "Bill Murray,", "Finn Wolfhard"),
            runningTimeMins = 144,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 1
        ),
        //This is the third Movie object that represents the movie "IMMACULATE".
        Movie(
            name = "IMMACULATE",
            image = "https://www.myvue.com/-/media/vuecinemas/img/import/b3d828fc-f999-4d6b-8bf6-299a4998c46e_immaculate_posters_0825-bb-immaculate_1-sheet_aw-08022024_712px.jpg?rev=9e640bbf86ae4a9591e22686c36569da", //R.drawable.immaculate_poster,
            certification = "https://www.myvue.com/-/media/vuecinemas/img/certificates/ie/16.png?rev=a22f1322c3ee478cb4b50f8de5ee741d", //R.drawable.cert_16,
            description = "Cecilia, a woman of devout faith, is warmly welcomed to the picture-perfect " +
                    "Italian countryside where she is offered a new role at an illustrious convent. " +
                    "But it becomes clear to Cecilia that her new home harbors dark and horrifying secrets.\n",
            starring = arrayOf("Sydney Sweeney,", "Benedetta Porcaroli,", "Álvaro Morte,", "Simona Tabasco"),
            runningTimeMins = 89,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 2
        ),
        //This is the fourth Movie object that represents the movie "IMAGINARY".
        Movie(
            name = "IMAGINARY",
            image = "https://www.myvue.com/-/media/vuecinemas/img/import/f607e5c8-c8db-4dbb-92d0-dad9ab8c68c3_imaginary_posters_imaginary_1sheet_686x1016_712px.jpg?rev=795a2eed0ad641b297101bd70e72eca7", //R.drawable.imaginary_poster,
            certification = "https://www.myvue.com/-/media/vuecinemas/img/certificates/ie/15a.png?rev=fd3786da538c4502b4e4c02ea3c7b44e", //R.drawable.cert_15a,
            description = "When Jessica (DeWanda Wise) moves back into her childhood home with her family, her youngest stepdaughter Alice (Pyper Braun) develops an eerie attachment" +
                    " to a stuffed bear named Chauncey she finds in the basement.\n",
            starring = arrayOf("Betty Buckley,", "DeWanda Wise,", "Tom Payne"),
            runningTimeMins = 104,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 3
        ),
        //This is the fifth Movie object that represents the movie "WICKED LITTLE LETTERS".
        Movie(
            name = "WICKED LITTLE LETTERS",
            image = "https://www.myvue.com/-/media/vuecinemas/img/import/2f93acca-53ff-41f7-a57c-42d191057f02_wicked-little-letters_posters_wicked-little-letters-poster-uk--.jpg?rev=19d4909958cd40759403c26e7762f30d", //R.drawable.wicked_poster,
            certification = "https://www.myvue.com/-/media/vuecinemas/img/certificates/ie/15a.png?rev=fd3786da538c4502b4e4c02ea3c7b44e", //R.drawable.cert_15a,
            description = "A 1920s English seaside town bears witness to a dark and absurd scandal in this riotous mystery comedy. " +
                    "Based on a stranger than fiction true story.\n",
            starring = arrayOf("Olivia Colman,", "Timothy Spall,", "Eileen Atkins,", "Gemma Jones"),
            runningTimeMins = 100,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 4
        ),
        //This is the sixth Movie object that represents the movie "BOB MARLEY: ONE LOVE".
        Movie(
            name = "BOB MARLEY: ONE LOVE",
            image = "https://www.myvue.com/-/media/vuecinemas/img/import/bob-marley-one-love_posters_bmol_intl_dgtl_teaser_1sheet_2025x3000_spotlight_uk_712px.jpg?rev=1fb201cf08754f18b77f98fd4f28ed4b", //R.drawable.bob_poster,
            certification = "https://www.myvue.com/-/media/vuecinemas/img/certificates/ie/12a.png?rev=d1b78b8f625a43b098703bf1bf397269", //R.drawable.cert_12a,
            description = "BOB MARLEY: ONE LOVE celebrates the life and music of an icon who inspired generations through his message of love and unity.\n",
            starring = arrayOf("Lashana Lynch,", "Tosin Cole,", "Kingsley Ben-Adir,", "James Norton,", "Anthony Welsh"),
            runningTimeMins = 110,
            seatsRemaining = Random.nextInt(0, 16),
            seatsSelected = 0,
            id = 5
        )
    )
}