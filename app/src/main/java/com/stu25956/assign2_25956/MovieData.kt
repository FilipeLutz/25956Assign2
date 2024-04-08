package com.stu25956.assign2_25956

/**
 * CA2 - Movie Booking App
 * Filipe Lutz Mariano 25956
 */

/**
 * Movie class as the structure specified in Movie.json
 *
 * @property image A string representing the image of the movie.
 * @property name A string representing the name of the movie.
 * @property certification A string representing the certification of the movie.
 * @property description A string representing the description of the movie.
 * @property starring An array of strings representing the actors starring in the movie.
 * @property runningTimeMins An integer representing the running time of the movie in minutes.
 * @property seatsRemaining An integer representing the number of seats remaining for the movie.
 * @property seatsSelected An integer representing the number of seats selected for the movie.
 * @property id An integer representing the unique identifier of the movie.
 */
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
    /**
     * Overrides the equals method to compare the starring array of the current and other Movie objects.
     *
     * @param other The other object to compare with the current object.
     * @return A boolean indicating whether the starring array of the current and other Movie objects are equal.
     */
    override fun equals(other: Any?) = other is Movie && starring.contentEquals(other.starring)

    /**
     * Overrides the hashCode method to return the hash code value of the starring array.
     *
     * @return An integer representing the hash code value of the starring array.
     */
    override fun hashCode() = starring.contentHashCode()
}