package com.example.greetingcard

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.WaterDrop
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.filled.Air
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Call your app's root composable here!
                    weatherApp()
                }
            }
        }
    }
}

@Composable
fun WeatherCard(
    day: String,
    imageVector: ImageVector,
    weather: String,
    low: String,
    high: String){

    Column(modifier = Modifier
        .padding(10.dp)
        .border(width = 1.dp, color = Color.Black)
        .padding(10.dp)){

        Text(text = day)
        Icon(
            imageVector = imageVector,
            contentDescription = weather
        )
        Text(text = weather)
        Text(text = "Low " + low)
        Text(text = "High " + high)
    }
}

@Composable
fun weatherApp(){
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(text = "Weather App")
        Row(){
            WeatherCard(
                day = "Mon",
                imageVector = Icons.Default.WaterDrop,
                weather = "Rainy",
                low = "25",
                high = "30"
            )

            WeatherCard(
                day = "Tue",
                imageVector = Icons.Default.WbSunny,
                weather = "Sunny",
                low = "29",
                high = "35"
            )

            WeatherCard(
                day = "Wed",
                imageVector = Icons.Default.Air,
                weather = "Windy",
                low = "20",
                high = "25"
            )
        }

        Row(){
            WeatherCard(
                day = "Thurs",
                imageVector = Icons.Default.Air,
                weather = "Windy",
                low = "25",
                high = "30"
            )

            WeatherCard(
                day = "Fri",
                imageVector = Icons.Default.Cloud,
                weather = "Cloudy",
                low = "29",
                high = "35"
            )

            WeatherCard(
                day = "Sat",
                imageVector = Icons.Default.WaterDrop,
                weather = "Rainy",
                low = "25",
                high = "30"
            )
        }

        WeatherCard(
            day = "Sun",
            imageVector = Icons.Default.WaterDrop,
            weather = "Rainy",
            low = "25",
            high = "30"
        )

    }
}

@Preview(showBackground = true)
@Composable
fun WeatherInfoPreview() {
    weatherApp()
}