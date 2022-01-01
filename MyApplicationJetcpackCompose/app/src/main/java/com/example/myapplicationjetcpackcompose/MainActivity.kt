package com.example.myapplicationjetcpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplicationjetcpackcompose.ui.theme.MyApplicationJetcpackComposeTheme

/*Basic Text Example*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            showText(text = "Hello Friends")
        }
    }
}

@Composable
fun showText(text: String) {
    Text(
        text = "Anything you write will append here $text. I am learning so testing with text.",
        fontSize = 32.sp,
        fontFamily = FontFamily.SansSerif,
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    showText(text = "Hello Friends")
}
