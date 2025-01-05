package com.example.components.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Bathtub
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.sharp.AccountCircle
import androidx.compose.material.icons.twotone.Image
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun IconsScreen(navController: NavHostController) {
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
                    Text(text = "IconsScreen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it).verticalScroll(
            state = rememberScrollState()
        )) {
            Icon(
                imageVector = Icons.Default.Edit, contentDescription = "Edit",
                modifier = Modifier.padding(16.dp)
                    .size(100.dp),
                tint = Color.Cyan
            )
            HorizontalDivider()
            Row(){
                Icon(imageVector = Icons.Filled.Edit, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.Default.Face, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.Outlined.Edit, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
            }
            Row(){
                Icon(imageVector = Icons.Sharp.AccountCircle, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
            }
            Row(){
                Icon(imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.Default.Bathtub, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.TwoTone.Image, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
            }
            Row(){
                Icon(imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.Default.Bathtub, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.TwoTone.Image, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
            }
            Row(){
                Icon(imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.Default.Bathtub, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.TwoTone.Image, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
            }
            Row(){
                Icon(imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.Default.Bathtub, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.TwoTone.Image, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
            }
            Row(){
                Icon(imageVector = Icons.AutoMirrored.Rounded.KeyboardArrowLeft, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.Default.Bathtub, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
                Icon(imageVector = Icons.TwoTone.Image, contentDescription = "",
                    modifier = Modifier.padding(16.dp)
                        .size(100.dp))
            }

        }
    }
}