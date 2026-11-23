package feature.imc.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.games.aprendiendoandroid.ui.theme.SelectedCard
import com.games.aprendiendoandroid.ui.theme.UnSelectedCard

@Preview
@Composable
fun GenderSelector(
    isMaleSelect: Boolean = true,
    onGenderSelect:(Boolean)-> Unit={})
{
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        GenderCard(
            modifier = Modifier.weight(1f),
            isSelect = isMaleSelect,
            gender="Hombre",
            symbol = "♂",
            onClick = {onGenderSelect(true)})
        GenderCard(
            modifier = Modifier.weight(1f),
            isSelect = !isMaleSelect,
            gender = "Mujer",
            symbol = "♀",
            onClick = {onGenderSelect(false)})
    }
}

@Preview
@Composable
fun GenderCard(
    modifier: Modifier= Modifier,
    isSelect: Boolean = true,
    gender: String = "",
    symbol: String= "",
    onClick:()->Unit = {}
){
    var TarColor = if (isSelect){
        SelectedCard
    }else{
        UnSelectedCard
    }
    Card(
        modifier.height(160.dp)
        .clickable{onClick},
        colors = CardDefaults.cardColors(
            containerColor = TarColor,
            contentColor = Color.White
        )
        ) {
        Column(Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Text(symbol, fontSize = 67.sp, fontWeight = FontWeight.ExtraBold)
            Text(gender, fontSize = 16.sp, fontWeight = FontWeight.Bold)

        }
    }
}