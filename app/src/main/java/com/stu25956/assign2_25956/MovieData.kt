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
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Movie

        return starring.contentEquals(other.starring)
    }

    override fun hashCode(): Int {
        return starring.contentHashCode()
    }
}