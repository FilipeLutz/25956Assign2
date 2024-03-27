package com.stu25956.assign2_25956

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
private fun Image(movie: Movie) {
    Image(
        painter = painterResource(id = movie.image),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(12.dp))),
    )
}

@Composable
fun MovieList(movie: Movie, navController: NavController) {

    Card(
        modifier = Modifier
            .padding(horizontal = 5.dp, vertical = 5.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate(Routes.SecondScreen.route + "/" + movie.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp))
    ) {
        Row (modifier = Modifier
            .background(Color.DarkGray)){
            Image(movie)
            Column(
                modifier = Modifier
                    .padding(top = (15.dp), end = 5.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly) {

                Row {
                    Text(
                        text = movie.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontFamily = FontFamily.Default,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )

                    Spacer(modifier = Modifier.width(7.dp))

                    Image(
                        modifier = Modifier.padding(top = 4.dp),
                        painter = painterResource(movie.certification),
                        contentDescription = null
                    )
                }

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = "Run Time: " + (movie.runningTimeMins / 60).toString() + "hr " + (movie.runningTimeMins % 60).toString() + "mins",
                    style = MaterialTheme.typography.bodySmall,
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.LightGray)

                Spacer(modifier = Modifier.height(6.dp))

                if(movie.seatsSelected > 0)
                {
                    Text(text = movie.seatsSelected.toString() + " Seats selected",
                        style = MaterialTheme.typography.bodyMedium,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Black
                    )
                }
                else {
                    Text(
                        text = movie.seatsRemaining.toString() + " Seats remaining",
                        style = MaterialTheme.typography.bodyMedium,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.Red,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}