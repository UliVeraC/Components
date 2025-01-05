package com.example.components.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.components.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardScreen(navController: NavHostController) {
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
                    Text(text = "CardScreen")
                })
        }
    ) {
        Column(modifier = Modifier.padding(it))
        {
            Row(
                modifier = Modifier.horizontalScroll(rememberScrollState())
            ) {
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, // Centra los elementos horizontalmente
                        verticalArrangement = Arrangement.Center // Centra los elementos verticalmente dentro de la columna
                    ) {
                        AsyncImage(
                            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1aBreN01CFB6y6pU2UtNcSzgdBZoMYzAEbQ&s",
                            contentDescription = "Souls",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "Souls Like",
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth()
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, // Centra los elementos horizontalmente
                        verticalArrangement = Arrangement.Center // Centra los elementos verticalmente dentro de la columna
                    ) {
                        AsyncImage(
                            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGn8cbPAtHCn_f9-LqzBgTWVAtSYh_E0cjjg&s",
                            contentDescription = "Shooters",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "Shooters",
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth()
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, // Centra los elementos horizontalmente
                        verticalArrangement = Arrangement.Center // Centra los elementos verticalmente dentro de la columna
                    ) {
                        AsyncImage(
                            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCh-Pl6BsNr5yoPLzsR803nHbGIihQ3f64dER8JsQVcAg6yg_KusaoVA5O0VNYMUNp8b8&usqp=CAU",
                            contentDescription = "Plataforma",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "Plataforma",
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth()
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, // Centra los elementos horizontalmente
                        verticalArrangement = Arrangement.Center // Centra los elementos verticalmente dentro de la columna
                    ) {
                        AsyncImage(
                            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1aBreN01CFB6y6pU2UtNcSzgdBZoMYzAEbQ&s",
                            contentDescription = "Souls",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "Souls Like",
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth()
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, // Centra los elementos horizontalmente
                        verticalArrangement = Arrangement.Center // Centra los elementos verticalmente dentro de la columna
                    ) {
                        AsyncImage(
                            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGn8cbPAtHCn_f9-LqzBgTWVAtSYh_E0cjjg&s",
                            contentDescription = "Shooters",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "Shooters",
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth()
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .width(120.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, // Centra los elementos horizontalmente
                        verticalArrangement = Arrangement.Center // Centra los elementos verticalmente dentro de la columna
                    ) {
                        AsyncImage(
                            model = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTCh-Pl6BsNr5yoPLzsR803nHbGIihQ3f64dER8JsQVcAg6yg_KusaoVA5O0VNYMUNp8b8&usqp=CAU",
                            contentDescription = "Plataforma",
                            modifier = Modifier.size(100.dp)
                        )
                        Text(
                            text = "Plataforma",
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth()
                        )
                    }
                }
            }

        }
    }
}