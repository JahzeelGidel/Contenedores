package co.edu.unab.cubidesjahzeel.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }

@Preview(showSystemUi = true)
@Composable
fun ContentScreen(){
    Column(
        modifier = Modifier
            .background(Color.Magenta)
            .padding(18.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally){

        Row(
            modifier = Modifier
                .background(Color.Blue)
                .padding(all = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }

        Column {
            Text(
                text = "Inicio",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Red)
            )
            Text(
                text = "Perfil",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Green)
            )
            Text(
                text = "Configuración",
                modifier = Modifier.background(Color.Yellow)
            )
            Text(
                text = "Inicio",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Red)
            )
            Text(
                text = "TiTULO",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Red)
            )
            Text(
                text = "Inicio",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.Red)
            )
            }
        }
    }
}

