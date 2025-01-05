package com.example.components.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextScreen(navController: NavHostController) {
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
                    Text(text = "TextScreen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Text(
                text = "This is a Text",
                fontSize = 30.sp
            )
            HorizontalDivider()
            Text(text = "Lorem ipsum, adunaudnwu ajndanuewdlkouanmue efiofmimsssssssssssssssssssss")
            HorizontalDivider()
            Text(
                modifier = Modifier.padding(16.dp),
                text = buildAnnotatedString {
                    append("Hola, me llameo Ulises y ")
                    withStyle(style = SpanStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 25.sp)) {
                        append("estoy aprendiendo desarrollo mobil")
                    }

                    append("y me esta gustando bastante")
                },
                fontSize = 20.sp
            )
        }
    }
}