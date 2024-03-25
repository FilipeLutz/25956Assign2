package com.stu25956.assign2_25956

sealed class Routes(val route: String) {
    data object FirstScreen : Routes("Home")
    data object SecondScreen : Routes("movie_screen")
}