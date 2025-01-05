package com.example.components.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RadioButtonsScreen(navController: NavHostController) {
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
                    Text(text = "RadioButtonScreen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it)) {

            var selectedOption by remember { mutableStateOf(false) }
            RadioButton(selected = selectedOption, onClick = {
                selectedOption = !selectedOption
            })
            HorizontalDivider()
            var selectedOption2 by remember { mutableStateOf(false) }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = selectedOption2, onClick = {
                    selectedOption2 = !selectedOption2
                })
                Text(text = "Option2", modifier = Modifier.clickable { selectedOption2 = !selectedOption2 })
            }
            HorizontalDivider()
            var selectedOption3 by remember { mutableStateOf(false) }
            var optionSelected by remember { mutableStateOf(1) }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = (optionSelected == 1), onClick = {
                    optionSelected = 1
                })
                Text(text = "Option1", modifier = Modifier.clickable { selectedOption3 = !selectedOption3 })
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = (optionSelected == 2), onClick = {
                    optionSelected = 2
                })
                Text(text = "Option2", modifier = Modifier.clickable { selectedOption3 = !selectedOption3 })
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = (optionSelected == 3), onClick = {
                    optionSelected = 3
                })
                Text(text = "Option3", modifier = Modifier.clickable { selectedOption3 = !selectedOption3 })
            }

            Text(text = optionSelected.toString(), fontSize = 40.sp, modifier = Modifier.padding(16.dp))
            HorizontalDivider()
            RadioButton(
                colors = RadioButtonDefaults.colors(
                    selectedColor = Color.Red,
                    unselectedColor = Color.Blue,
                    disabledSelectedColor = Color.Green
                ),
                enabled = false,
                selected = true,
                onClick = {

                }
            )
        }

    }
}