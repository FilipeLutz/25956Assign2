package com.stu25956.assign2_25956

sealed class Routes(val route: String) {
    /**
     * This is an object that represents the first screen in the navigation graph.
     * It extends the Routes sealed class and passes the route name "Home" to the parent constructor.
     */
    data object FirstScreen : Routes("Home")
    data object SecondScreen : Routes("MovieScreen")
}