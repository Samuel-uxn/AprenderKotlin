package com.games.aprendiendoandroid.Composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ListExample(modifier: Modifier = Modifier){
    val names = listOf("Samuel", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato", "Julian", "Hola", "Como están", "Gato");

    LazyColumn(modifier = modifier) {
        item{
            Box(modifier.fillMaxWidth().
            height(70.dp).
            background(Color(0xFF101D4B)),
            contentAlignment = Alignment.Center    ) {
                Text("Welcom", color = Color(0xFFFFFFFF))
            }
        }
        items(names) {
            Text(it)
        }
    }
}