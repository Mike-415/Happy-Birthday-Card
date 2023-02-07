package com.example.happybirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthdaycard.ui.theme.HappyBirthdayCardTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    BirthdayGreetingWithImage(
                        getString(R.string.happy_birthday_recipient),
                        getString(R.string.happy_birthday_sender))
                }
            }
        }
    }
}

@Composable
fun BirthdayGreetingWithImage(to: String, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        BirthdayGreetingWithText(to = to, from = from)
    }
}
@Composable
fun BirthdayGreetingWithText(to:String, from:String){
    Column {
        Text(text = "Happy birthday $to!!!!",
            fontSize = 36.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth()
                .padding(start = 16.dp, top = 16.dp))
        Text(text = "From $from :-)",
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.End)
                .padding(start = 16.dp, end = 16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayCardTheme {
        BirthdayGreetingWithImage("You", "Me")
    }
}