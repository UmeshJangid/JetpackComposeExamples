package com.example.myapplicationjetcpackcompose

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

/*This file contains common methods.*/

@Composable
fun showText(text: String) {
    Text(
        text = "Anything you write will append here $text. I am learning so testing with text.",
        fontSize = 32.sp,
        fontFamily = FontFamily.SansSerif,
    )
}