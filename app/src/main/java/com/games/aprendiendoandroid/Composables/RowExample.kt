package com.games.aprendiendoandroid.Composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun RowExample(){
    Row() {
        Text("Hola1 ")
        Column() {
            Text("Jajja")
            Text("Buenass", color = Color(0xFFB42222))
        }
        Text("Hola2")
        Text("Hola3")

    }
}