package com.example.components.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ButtonsScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                },
                title = {
                    Text(text = "ButtonsScreen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it).verticalScroll(
            state = rememberScrollState()
        )) {
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "IconButton")
            }
            Row {
                IconButton(
                    modifier = Modifier.size(110.dp),
                    onClick = { println("Soy un IconButton") }) {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "Icon",
                        modifier = Modifier.size(90.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(110.dp),
                    onClick = { println("Confirmando") }) {
                    Icon(
                        imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Icon",
                        tint = Color.Green,
                        modifier = Modifier.size(90.dp)
                    )
                }
                IconButton(
                    modifier = Modifier.size(110.dp),
                    onClick = { println("Cerrando App") }) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = "Icon",
                        tint = Color.Red,
                        modifier = Modifier.size(90.dp)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "ElevatedButton")
            }
                ElevatedButton(
                    elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 10.dp),
                    modifier = Modifier.padding(50.dp, 10.dp).width(300.dp)
                        .padding(16.dp),
                    onClick = { println("Soy un elevated button") }) {
                    Text(text = "Elevated button")
                }
                ElevatedButton(
                    elevation = ButtonDefaults.elevatedButtonElevation(defaultElevation = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red,
                        contentColor = Color.Cyan
                    ),
                    modifier = Modifier.padding(50.dp, 10.dp).width(300.dp)
                        .padding(16.dp),
                    onClick = { println("Soy un elevated button") }) {
                    Text(text = "Elevated button")
                }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "OutlinedButton")
            }
            OutlinedButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Magenta,
                ),
                border = BorderStroke(width = 5.dp, color = Color.Magenta),
                onClick = { println("Soy un outlined button")}) {
                Text(text = "Outlined Color")
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "FilledTonalButton")
            }
            FilledTonalButton(onClick = { println("Soy un filled tonal button")}) {
                Text(text="Filled Tonal Button")
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Filled Icon Button")
            }
            FilledIconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "Close")
            }
            Box(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Elevated Button Disabled (aplicable a todos los tipos)")
            }
            ElevatedButton(
                enabled = false,
                onClick = {} ) {
                Text(text = "Soy un boton")
            }
        }
    }
}