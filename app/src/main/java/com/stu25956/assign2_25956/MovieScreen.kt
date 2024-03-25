package com.stu25956.assign2_25956

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MovieScreen(movie: Movie, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){
        Image(painter = painterResource(id = R.drawable.back_arrow),
            contentDescription = "A back arrow",
            modifier = Modifier
                .size(width = 40.dp, height = 20.dp)
                .clickable {
                    /* Back To Home Screen*/
                    navController.navigate(Routes.FirstScreen.route)
                    //   Log.d("TAG", movie.seats_remaining.toString() + " | " + movie.seats_selected.toString())
                })
        Image(painter = painterResource(id = movie.image) ,
            contentDescription = "A movie cover",
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5f),
            contentScale = ContentScale.Crop)
        Bottom(movie)
    }
}

fun conv(movie: Movie) :String
{
    var stares = ""
    for (i in movie.starring)
        stares +="$i, "
    stares.removeSuffix(", ")
    return stares
}
@Composable
fun Bottom(movie: Movie)
{
    var seatsSelected by remember { mutableIntStateOf(movie.seatsSelected) }
    var seatsRemaining by remember { mutableIntStateOf(movie.seatsRemaining) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = movie.name,
                style = MaterialTheme.typography.titleLarge,
                color = Color.White,
                fontFamily = FontFamily.Serif
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = movie.certification) ,
                contentDescription = "A seat",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Text(text = "Staring ",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily.Serif)
            Text(text = conv(movie),
                color = Color.Gray,
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily.Serif)
        }
        Spacer(modifier = Modifier.height(5.dp))
        Row {
            Text(text = "Running time ",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily.Serif)
            Text(text = (movie.runningTimeMins / 60).toString() + "hr " + (movie.runningTimeMins % 60).toString() + "mins",
                color = Color.Gray,
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily.Serif)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text= movie.description,
            color = Color.LightGray,
            style = MaterialTheme.typography.bodyMedium,
            fontFamily = FontFamily.Serif)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Select Seats",
                color = Color.White,
                style = MaterialTheme.typography.titleLarge,
                fontFamily = FontFamily.Serif)
            Spacer(modifier = Modifier.width(5.dp))
            Image(painter = painterResource(id = if(seatsSelected == 0) R.drawable.minus_grey else R.drawable.minus_white) ,
                contentDescription = "A minus sign",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp)
                    .clickable {
                        if (seatsSelected > 0) {
                            seatsSelected -= 1
                            seatsRemaining += 1
                            movie.seatsSelected = seatsSelected
                            movie.seatsRemaining = seatsRemaining
                        }
                    })
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = seatsSelected.toString(),
                fontFamily = FontFamily.Serif,
                modifier = Modifier
            )
            Spacer(modifier = Modifier.width(5.dp))
            Image(painter = painterResource(id = if(seatsRemaining == 0) R.drawable.add_grey else R.drawable.add_white),
                contentDescription = "A plus sign",
                modifier = Modifier
                    .size(width = 20.dp, height = 20.dp)
                    .clickable {
                        if (seatsRemaining > 0) {
                            seatsSelected += 1
                            seatsRemaining -= 1
                            movie.seatsSelected = seatsSelected
                            movie.seatsRemaining = seatsRemaining
                        }
                    })
            Spacer(modifier = Modifier.fillMaxWidth(0.1f))
            Image(painter = painterResource(id = R.drawable.seat) ,
                contentDescription = "A seat",
                modifier = Modifier
                    .size(width = 25.dp, height = 20.dp))
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "$seatsRemaining seats remaining",
                color = Color.White,
                style = MaterialTheme.typography.titleLarge,
                fontFamily = FontFamily.Serif)
        }
    }
}