package com.example.happybirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happybirthdaycard.ui.theme.HappyBirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HappyBirthdayGreeting("You", "me")
                }
            }
        }
    }
}

@Composable
fun HappyBirthdayGreeting(name: String, from: String) {
    Column {
        Text(text = "Happy birthday $name!!!!", fontSize = 36.sp)
        Text(text = "From $from :-)",           fontSize = 24.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayCardTheme {
        HappyBirthdayGreeting("You", "Me")
    }
}