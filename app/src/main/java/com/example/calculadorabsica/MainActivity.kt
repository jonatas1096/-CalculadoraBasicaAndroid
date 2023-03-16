package com.example.calculadorabsica

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraScreen()
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun CalculadoraScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Calculadora Básica - Android Studio",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                backgroundColor = Color(0xFFFFA500)
            )
        },
        content = { //começo do content
            //começo do text field
            var value1 by remember { mutableStateOf("")}
            var value2 by remember { mutableStateOf("")}
            var operator by remember { mutableStateOf("")}
            var result by remember { mutableStateOf("")}

            Column(Modifier.padding(16.dp)) {
                TextField(
                    value = value1,
                    onValueChange = { value1 = it },
                    label = { Text("Value 1") },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                TextField(
                    value = value2,
                    onValueChange = { value2 = it },
                    label = { Text("Value 2") },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth()
                )
                //fim do text field

                Row(Modifier.padding(vertical = 16.dp)) {
                    Button(
                        onClick = { operator = "+" },
                        modifier = Modifier
                            .padding(vertical = 16.dp)
                    )
                    {
                        Text(text = "+", color = Color.White)
                    }

                }
            }
        }, //fim do content

        
    )


}

@Composable
fun Calcular() {

}
@Preview(showBackground = true)
@Composable
fun CalculadoraPreview() {
    CalculadoraScreen()

}
