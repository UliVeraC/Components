package com.example.components.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
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
import androidx.compose.material3.TextField
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
fun DropDownScreen(navController: NavHostController) {
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
                    Text(text = "DropDownScreen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it))
        {
            var valuetext by remember {
                mutableStateOf("")
            }
            var expandedDropDown by remember {
                mutableStateOf(false)
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
                TextField(
                    label = { Text(text = "Selecciona una Serie") },
                    modifier = Modifier
                        .fillMaxWidth(),
                    value = valuetext, onValueChange = {},
                    trailingIcon = {
                        IconButton(onClick = { expandedDropDown = !expandedDropDown }) {
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "Expandir DropDown"
                            )
                        }
                    }
                )

                DropdownMenu(
                    modifier = Modifier.fillMaxWidth(fraction = 0.92f),
                    expanded = expandedDropDown, onDismissRequest = {}) {
                    DropdownMenuItem(text = { Text(text = "The Walking Dead") }, onClick = {
                        valuetext = "The Walking Dead"
                        expandedDropDown = false
                    })
                    DropdownMenuItem(text = { Text(text = "Games Of Thrones") }, onClick = {
                        valuetext = "Games Of Thrones"
                        expandedDropDown = false
                    })
                    DropdownMenuItem(text = { Text(text = "The Boys") }, onClick = {
                        valuetext = "The Boys"
                        expandedDropDown = false
                    })
                }
            }

        }
    }
}