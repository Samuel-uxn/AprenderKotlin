package com.games.aprendiendoandroid.Composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment

@Composable
fun CounterScreen(modifier: Modifier){

    var counter  by rememberSaveable() { mutableStateOf(23) };
    var counter2  by rememberSaveable() { mutableStateOf(12) };
    var name by remember{ mutableStateOf("") }

    Column() {
        Counter(counter, onIncrement = {counter++})
        Counter(counter2, onIncrement = {counter2++})
        TextFieldCounter(name = name, onValueChange = {myText -> name = myText})
    }
}
@Composable
fun Counter(
    counter: Int,
    onIncrement:()->Unit

){
    Column(modifier = Modifier.padding(30.dp)) {
        Text(
            "Pulsaciones $counter"
        )

        Button(onClick = {onIncrement()}) {
            Text("Sumar")
        }
    }
}
@Composable
fun TextFieldCounter(
    name: String,
    onValueChange:(String)->Unit
){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center ){
        TextField(
            value = name,
            onValueChange = { onValueChange(it)},
            label = {Text("Example")})
    }
}