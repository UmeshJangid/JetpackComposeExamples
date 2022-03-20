package com.example.myapplicationjetcpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/* Basic Text Example*/
private val TAG = "MainActivity"
var listitem: List<String> = listOf("Umesh", "Deepak", "Valentino", "Karishma", "Sharda")

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setList(list = listitem)
        }
    }
}



@Composable
fun IAMROWEX() {
    Surface(color = Color.DarkGray, modifier = Modifier.fillMaxSize())
    {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            DummySurfaces(color = Color.Magenta)
            DummySurfaces(color = Color.Red)
            DummySurfaces(color = Color.Blue)
            DummySurfaces(color = Color.Cyan)
            DummySurfaces(color = Color.Yellow)
        }
    }
}

@Composable
fun IAM_COLUMN_EXAMPLE() {
    Surface(color = Color.DarkGray, modifier = Modifier.fillMaxSize())
    {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            DummySurfaces(color = Color.Magenta)
            DummySurfaces(color = Color.Red)
            DummySurfaces(color = Color.Blue)
            DummySurfaces(color = Color.Cyan)
            DummySurfaces(color = Color.Yellow)
        }
    }
}

@Composable
fun IAM_ROW_AND_COLUMN_EXAMPLE() {
    Surface(color = Color.DarkGray, modifier = Modifier.fillMaxSize())
    {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(horizontalArrangement = Arrangement.Center) {
                DummySurfacesForSquare(color = Color.Magenta)
                DummySurfacesForSquare(color = Color.Red)
            }
            DummySurfacesForSquare(color = Color.Blue)
            DummySurfacesForSquare(color = Color.Cyan)
            DummySurfacesForSquare(color = Color.Yellow)
        }
    }
}

@Composable
fun DummySurfaces(color: Color) {
    //Adjust width and height according to your need.
    //Surface(color = color, modifier = Modifier.size(60.dp, 600.dp)) // This for Row {
    Surface(color = color, modifier = Modifier.size(600.dp, 60.dp)) {
    }
}

@Composable
fun DummySurfacesForSquare(color: Color) {
    //Adjust width and height according to your need.
    //Surface(color = color, modifier = Modifier.size(60.dp, 600.dp)) // This for Row {
    Surface(color = color, modifier = Modifier.size(160.dp, 160.dp)) {
    }
}


@Composable
fun setList(list: List<String>) {
    Surface(color = Color.White, modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            for (listItem in list) {
                SetText(text = listItem)
            }
            Button(onClick = { },Modifier.wrapContentSize(align = Alignment.Center)) {
                Text(text = "Add More Dynamic")
            }
        }
        
    }
}

@Composable
fun SetText(text: String) {
    Text(text = text, style = MaterialTheme.typography.h5)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    setList(list = listitem)
}
