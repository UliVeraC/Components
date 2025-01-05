package com.example.components.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoaderScreen(navController: NavHostController) {
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
                    Text(text = "LoadersScreen")
                })
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .verticalScroll(
                    state = rememberScrollState()
                )
        ) {
            Text(text = "Circular Indicator", modifier = Modifier.padding(16.dp))
            CircularProgressIndicator(
                color = Color.Red,
                trackColor = Color.LightGray,
                strokeWidth = 10.dp,
                modifier = Modifier.padding(16.dp)
            )
            HorizontalDivider()

            var progressvalue by remember {
                mutableStateOf(0.0f)
            }

            Text(text = "ProgressBar", modifier = Modifier.padding(16.dp))

            LinearProgressIndicator(
                color = Color.Red,
                trackColor = Color.Blue,
                modifier = Modifier.fillMaxWidth(),
                progress = { progressvalue }

            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(16.dp).fillMaxWidth()
            )
            {
                ElevatedButton(onClick = {
                    progressvalue -= 0.1f
                }) {
                    Text(text = "Disminuir -")
                }
                ElevatedButton(onClick = {
                    progressvalue += 0.1f
                }) {
                    Text(text = "Aumentar +")
                }
            }
        }
    }
}
