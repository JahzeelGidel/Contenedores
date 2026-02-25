package co.edu.unab.cubidesjahzeel.contenedores

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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

@Preview(showSystemUi = true)
@Composable
fun ContentScreen(){
    Column(
        modifier = Modifier
            .background(Color.White)
            .padding(18.dp)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally){

        Row(
            modifier = Modifier
                .background(Color.White)
                .padding(all = 16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.aprovado),
                contentDescription = "Hola mundo",
                modifier = Modifier.size(200.dp)
            )
            Text(
                text = "Hola mundo",
                fontSize = 25.sp,
                modifier = Modifier.background(Color.White)
            )
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun Actividad3() {
    Column(Modifier.fillMaxWidth()) {

        Row(Modifier.weight(1f)) {
            InfoCard(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(Modifier.weight(1f)) {
            InfoCard(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun InfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}