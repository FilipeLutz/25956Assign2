package com.stu25956.assign2_25956

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

/**
 * This is a Composable function that sets up the navigation for the application.
 * It uses the Jetpack Compose Navigation library to define a navigation graph.
 * The navigation graph has two destinations: the Home screen and the Movie screen.
 * The Home screen is the start destination.
 */
@Composable
fun Navigation() {
    // Remember the NavController, which controls navigation within the NavHost.
    val navController = rememberNavController()

    // NavHost is a container for navigation destinations.
    // It receives the NavController and the route of the start destination.
    NavHost(
        navController = navController,
        startDestination = Routes.FirstScreen.route,
    ) {
        // Define the composable for the first screen (Home).
        // When the route is the route of the first screen, the Home composable is displayed.
        composable(Routes.FirstScreen.route) {
            Home(navController)
        }
        // Define the composable for the second screen (Movie).
        // When the route is the route of the second screen, the MovieActivity composable is displayed.
        // The route for the second screen includes an argument for the movie ID.
        composable("${Routes.SecondScreen.route}/{movieId}") { backStackEntry ->
            // Get the movie ID from the route arguments.
            // If the movie ID is not null and is an integer, find the movie with that ID.
            // If the movie is found, display the MovieActivity composable for that movie.
            backStackEntry.arguments?.getString("movieId")?.toInt()?.let { id ->
                MovieList.movieList.find { it.id == id }?.let { movie ->
                    MovieActivity(movie, navController)
                }
            }
        }
    }
}