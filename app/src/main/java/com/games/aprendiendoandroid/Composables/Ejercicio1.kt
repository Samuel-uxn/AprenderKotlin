package com.games.aprendiendoandroid.Composables
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true)
@Composable
fun coloresScreen(){
    Column() {
        Box(modifier = Modifier.fillMaxWidth().weight(1f).background(Color(0xFF52CECA)),
            contentAlignment = Alignment.Center) {
            Text("Ejemplo 1")
        }
        Row(modifier = Modifier.fillMaxWidth().weight(1f)) {
            Box(modifier = Modifier.fillMaxHeight().weight(1f).background(Color(0xFF8A0834)),
                contentAlignment = Alignment.Center) {
                Text("Ejemplo 2")

            }
            Box(modifier = Modifier.fillMaxHeight().weight(1f).background(Color(0xFF48B03D)),
                contentAlignment = Alignment.Center) {
                Text("Ejemplo 3")

            }
        }
        Box(modifier = Modifier.fillMaxWidth().weight(1f).background(Color(0xFF8E3DB0)),
            contentAlignment = Alignment.BottomCenter) {
            Text("Ejemplo 4")
        }
    }

}