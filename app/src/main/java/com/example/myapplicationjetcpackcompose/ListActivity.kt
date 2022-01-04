package com.example.myapplicationjetcpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setList(list = listitem)
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreviewNew() {
setList(list = listitem)
}