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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.components.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SliderScreen(navController: NavHostController) {
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
                    Text(text = "SliderScreen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it))
        {
            var sliderValue by remember {
                mutableFloatStateOf(0.1f)
            }
            var sliderValue2 by remember {
                mutableFloatStateOf(0.1f)
            }
            var sliderValue3 by remember {
                mutableFloatStateOf(0f)
            }
            Slider(
                colors=SliderDefaults.colors(
                    thumbColor = Color.Cyan,
                    activeTickColor = Color.Red,
                    activeTrackColor = Color.Green
                ),
                value = sliderValue, onValueChange = {
                sliderValue = it
            })
            Text(text = sliderValue.toString(), fontSize = 50.sp)
            HorizontalDivider()
            Slider(
                colors=SliderDefaults.colors(
                    thumbColor = Color.Cyan,
                    activeTickColor = Color.Red,
                    activeTrackColor = Color.Green
                ),
                steps = 4,
                value = sliderValue2, onValueChange = {
                    sliderValue2 = it
                })
            Text(text = sliderValue2.toString(), fontSize = 50.sp)
            HorizontalDivider()
            Slider(
                colors=SliderDefaults.colors(
                    thumbColor = Color.Cyan,
                    activeTickColor = Color.Red,
                    activeTrackColor = Color.Green
                ),
                steps = 4,
                value = sliderValue3, onValueChange = {
                    sliderValue3 = it
                })
            Text(text = sliderValue3.toString(), fontSize = 50.sp)
        }
    }
}