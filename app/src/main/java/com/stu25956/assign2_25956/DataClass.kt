package com.stu25956.assign2_25956

// Movie class as the structure specified in Movie.json
data class Movie(
    val name: String,
    val image: String,
    val certification: String,
    val description: String,
    val starring: List<String>,
    val runningTimeMins: Int,
    var seatsRemaining: Int, // Changed to var to allow modification
    var seatsSelected: Int = 0 // Default value of 0 for seatsSelected
)
