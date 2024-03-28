package com.stu25956.assign2_25956

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter

/**
 * This is the main screen for a specific movie.
 * It displays the movie details and allows the user to select seats for the movie.
 * @param movie The movie object containing all the details of the movie.
 * @param navController The NavController used for navigation between different screens.
 */
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MovieActivity(movie: Movie, navController: NavController) {
    // Scaffold container for other Composable widgets.
    Scaffold(
        // TopAppBar container for the top app bar.
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                ),
                title = {
                    Image(
                        painter = painterResource(id = R.drawable.back_arrow),
                        contentDescription = "Back Arrow",
                        modifier = Modifier
                            .background(Color.Black, MaterialTheme.shapes.extraLarge)
                            .size(width = 50.dp, height = 40.dp)
                            .padding(5.dp)
                            .clickable {
                                navController.navigate(Routes.FirstScreen.route)
                            }
                    )
                },
            )
        },
        // The main content of the screen.
        content = {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
            ) {
                item {
                    Image(
                        painter = rememberAsyncImagePainter(movie.image),
                        contentDescription = "Movie Poster",
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(600.dp),
                        contentScale = ContentScale.Crop
                    )
                }

                item {
                    MBody(movie)
                }
            }
        }
    )
}

/**
 * This function converts the list of starring actors in the movie to a string.
 * @param movie The movie object.
 * @return A string containing the names of the starring actors.
 */
fun conv(movie: Movie) :String {
    var stares = ""
    for (i in movie.starring)
        stares += "$i "
    return stares
}

/**
 * This Composable function displays the main body of the movie screen.
 * It includes the movie details and the seat selection functionality.
 * @param movie The movie object.
 */
@Composable
fun MBody(movie: Movie) {
    var seatsSelected by remember { mutableIntStateOf(movie.seatsSelected) }
    var seatsRemaining by remember { mutableIntStateOf(movie.seatsRemaining) }
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
    ) {

        Spacer(modifier = Modifier.height(5.dp))

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier
                .fillMaxWidth()
        ){

            Text(
                text = movie.name.take(21),
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.width(15.dp))

            Image(
                painter = rememberAsyncImagePainter(movie.certification),
                contentDescription = "Movie Certification",
                modifier = Modifier
                    .size(30.dp)
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        Row {

            Text(
                text = "Staring ",
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = conv(movie),
                color = Color.Gray,
                style = MaterialTheme.typography.bodyLarge
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row {
            Text(
                text = "Run Time ",
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = (movie.runningTimeMins / 60).toString() + "hr " +
                        (movie.runningTimeMins % 60).toString() + "mins",
                color = Color.Gray,
                style = MaterialTheme.typography.bodyLarge
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = movie.description,
            color = Color.LightGray,
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(10.dp))

        Column {

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 80.dp)
            ) {

                Text(
                    text = "Select Seats",
                    color = Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium
                )

                Image(
                    painter = painterResource
                        (
                        id = if (seatsSelected == 0)
                            R.drawable.minus_grey else R.drawable.minus_white
                    ),
                    contentDescription = "Minus",
                    modifier = Modifier
                        .size(35.dp)
                        .clickable {
                            if (seatsSelected > 0) {
                                seatsSelected -= 1
                                seatsRemaining += 1
                                movie.seatsSelected = seatsSelected
                                movie.seatsRemaining = seatsRemaining
                            }
                        }
                )

                Text(
                    text = seatsSelected.toString(),
                    color = if (seatsSelected > 0 ) Color.Green
                    else Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium

                )

                Image(
                    painter = painterResource
                        (id = if (seatsRemaining == 0) R.drawable.add_grey else R.drawable.add_white),
                    contentDescription = "Plus",
                    modifier = Modifier
                        .size(30.dp)
                        .clickable {
                            if (seatsRemaining > 0) {
                                seatsSelected += 1
                                seatsRemaining -= 1
                                movie.seatsSelected = seatsSelected
                                movie.seatsRemaining = seatsRemaining
                            }
                        }
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.seat),
                    colorFilter = if (seatsRemaining == 0) ColorFilter.tint(Color.Red)
                    else if (seatsSelected > 0) ColorFilter.tint(Color.Yellow)
                    else ColorFilter.tint(Color.LightGray),
                    contentDescription = "Seat",
                    modifier = Modifier
                        .size(30.dp)
                )

                Spacer(modifier = Modifier.width(15.dp))

                Text(
                    text = "$seatsRemaining  Seats remaining",
                    color = if (seatsRemaining == 0) Color.Red
                    else if (seatsSelected > 0) Color.Yellow
                    else Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.headlineMedium
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}
