package feature

import android.icu.text.CaseMap
import android.service.quicksettings.Tile
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(onImcSelect:()-> Unit) {
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(title = {Text("Hola ")})
        }
    ) {
        paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
                .background(Color.Red)
                .padding(top = 10.dp)
                .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = {onImcSelect()}) {
                Text("Imc Calculator")
            }
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {}) {
                Text("Imc Calculator")
            }
        }
    }


}