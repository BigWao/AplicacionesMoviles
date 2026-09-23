package com.example.aplicacionesmoviles
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                FormularioScreen()
            }
        }
    }
}

@Composable
fun FormularioScreen() {
    var nombre by remember { mutableStateOf("") }
    var apellidos by remember { mutableStateOf("") }
    var usuario by remember { mutableStateOf("") }
    var contraseña by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .padding(16.dp)
                .width(320.dp)
                .border(1.dp, Color.Black, RoundedCornerShape(4.dp)),
            colors = CardDefaults.cardColors(containerColor = Color.Transparent),
            elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(text = "Nombre:")
                OutlinedTextField(
                    value = nombre,
                    onValueChange = { nombre = it },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                Text(text = "Apellido:")
                OutlinedTextField(
                    value = apellidos,
                    onValueChange = { apellidos = it },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                Text(text = "Usuario:")
                OutlinedTextField(
                    value = usuario,
                    onValueChange = { usuario = it },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )

                Text(text = "Contraseña:")
                OutlinedTextField(
                    value = contraseña,
                    onValueChange = { contraseña = it },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true,
                    visualTransformation = PasswordVisualTransformation()
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.End)
                ) {
                    Button(onClick = { }) {
                        Text("Cancelar")
                    }
                    Button(onClick = { }) {
                        Text("Aceptar")
                    }
                }
            }
        }
    }
}