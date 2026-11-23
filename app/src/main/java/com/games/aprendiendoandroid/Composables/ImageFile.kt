package com.games.aprendiendoandroid.Composables

import android.R.attr.contentDescription
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.games.aprendiendoandroid.R

@Preview
@Composable
fun ImageExample(){
       Image(painter = painterResource(R.drawable.images),
        contentDescription = "")
}