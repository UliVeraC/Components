package com.example.components.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.components.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ImagesScreen(navController: NavHostController) {
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
                    Text(text = "ImagesScreen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "Fondo")
            Box (
                modifier = Modifier.background(color = Color.DarkGray)
            ){
                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "Android")
            }
            Box (
                modifier = Modifier.background(color = Color.DarkGray)
            ){
                Image(
                    modifier = Modifier.fillMaxWidth().size(200.dp),
                    painter = painterResource(id = R.drawable.uwu), contentDescription = "Mia")
            }
            HorizontalDivider()
            Text(text = "Imagenes desde internet", fontSize = 20.sp)

            AsyncImage(model="https://i.blogs.es/289100/androidgo/1366_2000.jpeg",contentDescription = "Android"
            )
            AsyncImage(
                modifier = Modifier.clip(CircleShape).size(100.dp),
                model="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZm-cMdPAp8m3OXzgn4SdYXcA7dpEo4tzb8w&s",contentDescription = "Profile"
            )

        }

    }
}