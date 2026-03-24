package com.example.app_trabalho_kotlin.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MenuScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF0F1923)) // Fundo escuro moderno
            .padding(32.dp)
    ) {
        Text(
            text = "MENU",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFECE8E1) // Texto claro
        )
        Column(
            modifier = Modifier.align(Alignment.Center),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val buttonModifier = Modifier.size(width = 200.dp, height = 48.dp)

            Button(
                onClick = { navController.navigate("perfil/Rafael/20") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF4655)), // Botão vermelho vibrante
                modifier = buttonModifier
            ) {
                Text(text = "Perfil", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFFECE8E1))
            }

            Button(
                onClick = { navController.navigate("pedidos?cliente=Rafael") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF4655)),
                modifier = buttonModifier
            ) {
                Text(text = "Pedidos", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFFECE8E1))
            }

            Button(
                onClick = { navController.navigate("login") },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF4655)),
                modifier = buttonModifier
            ) {
                Text(text = "Sair", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Color(0xFFECE8E1))
            }
        }
    }
}