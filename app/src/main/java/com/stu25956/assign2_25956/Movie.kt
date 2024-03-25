package com.stu25956.assign2_25956

// Movie class as the structure specified in Movie.json
data class Movie(
    var image: Int,
    var name: String,
    var certification: Int,
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

        if (image != other.image) return false
        if (name != other.name) return false
        if (certification != other.certification) return false
        if (description != other.description) return false
        if (!starring.contentEquals(other.starring)) return false
        if (runningTimeMins != other.runningTimeMins) return false
        if (seatsRemaining != other.seatsRemaining) return false
        if (seatsSelected != other.seatsSelected) return false
        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        var result = image
        result = 31 * result + name.hashCode()
        result = 31 * result + certification
        result = 31 * result + description.hashCode()
        result = 31 * result + starring.contentHashCode()
        result = 31 * result + runningTimeMins
        result = 31 * result + seatsRemaining
        result = 31 * result + seatsSelected
        result = 31 * result + id
        return result
    }
}
