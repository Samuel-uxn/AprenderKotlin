package com.games.aprendiendoandroid.Composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Preview
@Composable
fun ColumnExample(){
    Column(verticalArrangement = Arrangement.SpaceAround) {
        Text("Hola1")
        Text("Hola2")
        Text("Hola3")
        Text("Hola4")
        Text("Hola5")
        Text("Hola6")
    }
}