package com.games.aprendiendoandroid.Composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun TextExample(){
    Text(
    "Samuel",
    fontSize = 40.sp,
    color = Color(0xFF572364),
    fontWeight = FontWeight.SemiBold
       )
}
