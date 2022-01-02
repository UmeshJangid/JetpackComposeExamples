package com.example.myapplicationjetcpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplicationjetcpackcompose.ui.theme.MyApplicationJetcpackComposeTheme

/*Basic Text Example*/
private val TAG = "MainActivity"

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IAMSurfaceExample()
        }
    }
}

/*@Composable
fun showText(text: String) {
    Text(
        text = "Anything you write will append here $text. I am learning so testing with text.",
        fontSize = 32.sp,
        fontFamily = FontFamily.SansSerif,
    )
}*/

/*@Composable
fun IAMButton() {
    Button(
        onClick = {
        Log.d(TAG, "IAMButton:")
    }, Modifier.background(color = Color.Red).size(150.dp,60.dp).padding(all = 4.dp)
    )
    {
        // I am Composable Fun again.
        Text(text = "Click Me")
    }
}*/

/*Surface is like View in Android.*/
@Composable
fun IAMSurfaceExample() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Surface(
            color = Color.Cyan,
            modifier = Modifier.wrapContentSize(align = Alignment.BottomCenter)
        ) {
            Text(
                text = "Make Me Wrap Content",
                style = MaterialTheme.typography.h5
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IAMSurfaceExample()
}
