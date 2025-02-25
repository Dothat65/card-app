package com.example.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.postcard.ui.theme.PostcardTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PostcardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {

                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight = 116.sp,
        color = Color.Blue

    )
    Text(
        text = from,
        fontSize = 36.sp
    )
}

@Preview(showBackground = true)
@Composable
fun postCardPreview() {
    PostcardTheme {
        GreetingText(
            "Hello from the College of Staten Island",
            from  ="Hellooo",
            modifier = Modifier.padding(16.dp) // Pass modifier with padding
        )
    }
} // test
