package com.stu25956.assign2_25956

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter

@Composable
fun CardItems(movie: Movie, navController: NavController) {
    Card(
        modifier = Modifier
            .padding(5.dp)
            .fillMaxSize()
            .clickable {
                navController.navigate(Routes.SecondScreen.route + "/" + movie.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
    ) {
        Column(
            modifier = Modifier
                .background(Color.DarkGray)
                .padding(6.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {

            Image(movie)

            Spacer(modifier = Modifier.width(1.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            ) {
                Text(
                    text = movie.name.take(14),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                )

                Image(
                    modifier = Modifier.size(22.dp),
                    painter = rememberAsyncImagePainter(model = movie.certification),
                    contentDescription = "Movie Certification"
                )
            }

            Text(
                text = "Run Time: ${movie.runningTimeMins / 60}hr ${movie.runningTimeMins % 60}mins",
                style = MaterialTheme.typography.bodySmall,
                fontWeight = FontWeight.SemiBold,
                color = Color.LightGray,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp)
            )

            if (movie.seatsSelected > 0) {
                Text(
                    text = "${movie.seatsSelected} Seats selected",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Green,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 5.dp)
                )
            }

            else {
                Text(
                    text = "${movie.seatsRemaining} Seats remaining",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Red,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 5.dp, end = 5.dp)
                )
            }
        }
    }
}

@Composable
private fun Image(movie: Movie) {
    Image(
        painter = rememberAsyncImagePainter(model = movie.image),
        contentDescription = "Movie Poster",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxSize()
            .aspectRatio(10f / 15)
            .clip(RoundedCornerShape(corner = CornerSize(12.dp)))
    )
}