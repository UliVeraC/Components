package com.example.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Abc
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AdsClick
import androidx.compose.material.icons.filled.AllInclusive
import androidx.compose.material.icons.filled.ArrowDropDownCircle
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.CreditCard
import androidx.compose.material.icons.filled.Download
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Pages
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material.icons.filled.SpaceBar
import androidx.compose.material.icons.filled.Swipe
import androidx.compose.material.icons.filled.SwitchLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text(text = "Components Kit") })
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues).verticalScroll(
            state = rememberScrollState()
        )) {
            ItemComponent("Text",
                Icons.Default.Edit,
                Modifier.clickable {
                    navController.navigate("text")
                })
            ItemComponent("Icons",
                Icons.Default.Face,
                Modifier.clickable {
                    navController.navigate("icon")
                })
            ItemComponent("Buttons",
                Icons.Default.AdsClick,
                Modifier.clickable {
                    navController.navigate("button")
                })
            ItemComponent("TextField",
                Icons.Default.SpaceBar,
                Modifier.clickable {
                    navController.navigate("txtfield")
                })
            ItemComponent("CheckBox",
                Icons.Default.CheckBox,
                Modifier.clickable {
                    navController.navigate("checkbox")
                })
            ItemComponent("Switch",
                Icons.Default.SwitchLeft,
                Modifier.clickable {
                    navController.navigate("switch")
                })
            ItemComponent("RadioButtons",
                Icons.Default.RadioButtonChecked,
                Modifier.clickable {
                    navController.navigate("radio")
                })
            ItemComponent("Images",
                Icons.Default.Image,
                Modifier.clickable {
                    navController.navigate("image")
                })
            ItemComponent("Loaders",
                Icons.Default.AllInclusive,
                Modifier.clickable {
                    navController.navigate("loader")
                })
            ItemComponent("Badge",
                Icons.Default.Notifications,
                Modifier.clickable {
                    navController.navigate("badge")
                })
            ItemComponent("Slider",
                Icons.Default.SwitchLeft,
                Modifier.clickable {
                    navController.navigate("slider")
                })
            ItemComponent("DropDown",
                Icons.Default.ArrowDropDownCircle,
                Modifier.clickable {
                    navController.navigate("dropdown")
                })
            ItemComponent("Card",
                Icons.Default.CreditCard,
                Modifier.clickable {
                    navController.navigate("card")
                })
            ItemComponent("Pager",
                Icons.Default.Pages,
                Modifier.clickable {
                    navController.navigate("pager")
                })
            ItemComponent("BottonAppBar",
                Icons.Default.Download,
                Modifier.clickable {
                    navController.navigate("navigation")
                })
            ItemComponent("Modal",
                Icons.Default.List,
                Modifier.clickable {
                    navController.navigate("modal")
                })
        }
    }
}