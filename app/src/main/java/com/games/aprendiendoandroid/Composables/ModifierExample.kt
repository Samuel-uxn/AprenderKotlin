package com.games.aprendiendoandroid.Composables

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import com.games.aprendiendoandroid.R

@Preview(showSystemUi = true)
@Composable
fun ProfileScreen(){
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF479191))
                .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(modifier = Modifier.size(80.dp),
                painter = painterResource(R.drawable.images),
                contentDescription = null)
            Column(modifier = Modifier.background(Color(0xFF8271A2))) {
                Text("Samuel")
                Text("Movile Developer", color = Color(0xFFFFFFFF))
            }
            Button(onClick = { print("hola") }) {
                Text("Follow")
            }
        }
    }
}