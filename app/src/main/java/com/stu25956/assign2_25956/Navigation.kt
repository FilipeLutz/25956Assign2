package com.stu25956.assign2_25956

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.FirstScreen.route,
    ) {
        composable(Routes.FirstScreen.route)
        {
            Home(navController = navController)
        }
        composable(Routes.SecondScreen.route + "/{movieId}")
        { backStackEntry ->
            val arg = backStackEntry.arguments?.getString("movieId")
            var id = 1
            if(arg != null)
                id = arg.toInt()
            val movie = MovieList.movieList.find { it.id == id}
            if(movie != null)
                MovieScreen(movie,navController = navController)
        }
    }
}