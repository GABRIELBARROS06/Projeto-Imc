package br.senai.sp.jandira.imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.ImcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
Column {
    Box(
        modifier = Modifier
            .height(230.dp)
            .fillMaxSize()
            .background(color = Color(0xFFC54040))


    ){
        Image(
            painter =
            painterResource(id = R.drawable.imc), contentDescription = "",
            modifier = Modifier.padding(top = 20.dp, start = 140.dp)

        )
        Text(
            text = "Calculadora IMC",
            color = Color.White,
            fontSize = 32.sp,
            modifier = Modifier.padding(top =  120.dp, start = 70.dp)

        )
    }


    Card(
        modifier = Modifier
            .height(400.dp)
            .width(320.dp)
            .offset(
                x = 40.dp,
                y = -50.dp
            ),
        colors = CardDefaults.cardColors(Color(0xFFD6D5D5)),

        )
    {
        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {
            Text(
                text = "Seus dados",
                fontSize = 28.sp,
                color = Color(0xFFF44336),
                fontWeight = ExtraBold,
                modifier = Modifier
                    .padding(top = 30.dp, start = 80.dp)

            )

            Text(
                text = "Seu peso",
                color = Color(0xFFF44336),
                fontWeight = Bold,
                modifier = Modifier
                    .padding(top = 20.dp,start = 20.dp)
            )




            OutlinedTextField(
                value = "", onValueChange = {},
                Modifier
                    .height(50.dp)
                    .offset(x = 20.dp, y = 5.dp),
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xFFF44336),
                        unfocusedContainerColor = Color(0xFFFFFFFF)

                    ),
                placeholder = {
                    Text(
                        text = "Digite seu peso",
                        fontSize = 14.sp

                    )

                }


            )

            Text(
                text = "Sua altura",
                color = Color(0xFFF44336),
                fontWeight = Bold,
                modifier = Modifier
                    .padding(top = 20.dp,start = 20.dp)
            )




            OutlinedTextField(
                value = "", onValueChange = {},
                Modifier
                    .height(50.dp)
                    .offset(x = 20.dp, y = 5.dp),

                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xFFF44336),
                        unfocusedContainerColor = Color(0xFFFFFFFF)

                    ),
                placeholder = {
                    Text(
                        text = "Digite sua Altura",
                        fontSize = 14.sp

                    )
                }
            )
            Button(onClick = { /*TODO*/ },


                modifier = Modifier
                    .height(100.dp)
                    .width(310.dp)
                    .padding(top = 30.dp, start = 10.dp),

                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF44336)),
                border = BorderStroke(width = 2.dp, color = Color.Red ),


                ) {

                Text(text = "Calcular")

            }


        }


    }

    Box(
        modifier = Modifier
            .height(230.dp)
            .width(300.dp)
            .offset(x = 50.dp, y = -20.dp)
            .background(
                Color(0xFF4CAF50)

            )


    ) {
        Text(
            text = "Resultado",
            modifier = Modifier
                .padding(top = 40.dp, start = 40.dp),
            color = Color.White

        )
        Text(
            text = "Peso Ideal",
            color = Color(0xFFFFFFFF),
            fontSize = 32.sp,
            fontWeight = Bold,
            modifier = Modifier.padding(top = 60.dp, start = 10.dp)


            )
        Text(
            text = "21.3",
            color = Color.White,
            fontSize = 32.sp,
            fontWeight = Bold,
            modifier = Modifier.offset(x = 200.dp, y = 50.dp)
            )
    }

}
}

















@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImcTheme {
        Greeting()
    }
}