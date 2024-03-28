package com.stu25956.assign2_25956

// Movie class as the structure specified in Movie.json
data class Movie(
    var image: String,
    var name: String,
    var certification: String,
    var description: String,
    var starring: Array<String>,
    var runningTimeMins: Int,
    var seatsRemaining: Int,
    var seatsSelected: Int,
    var id: Int
)