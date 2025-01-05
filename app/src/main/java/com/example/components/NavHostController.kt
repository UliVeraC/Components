package com.example.components

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.components.components.BadgeScreen
import com.example.components.components.BottonNavigationScreen
import com.example.components.components.ButtonsScreen
import com.example.components.components.CardScreen
import com.example.components.components.CheckBoxScreen
import com.example.components.components.DropDownScreen
import com.example.components.components.IconsScreen
import com.example.components.components.ImagesScreen
import com.example.components.components.LoaderScreen
import com.example.components.components.ModalScreen
import com.example.components.components.PagerScreen
import com.example.components.components.RadioButtonsScreen
import com.example.components.components.SliderScreen
import com.example.components.components.SwitchScreen
import com.example.components.components.TextFieldScreen
import com.example.components.components.TextScreen

@Composable
fun NavHostController(){
    val navController = rememberNavController()
    NavHost(navController =  navController, startDestination = "Home"){
        composable(route = "home"){ HomeScreen(navController) }
        composable(route = "text") { TextScreen(navController) }
        composable(route = "icon") { IconsScreen(navController) }
        composable(route = "button") { ButtonsScreen(navController) }
        composable(route = "txtfield") { TextFieldScreen(navController) }
        composable(route = "checkbox") { CheckBoxScreen(navController) }
        composable(route = "switch") { SwitchScreen(navController) }
        composable(route = "radio") { RadioButtonsScreen(navController) }
        composable(route = "image") { ImagesScreen(navController) }
        composable(route = "loader") { LoaderScreen(navController) }
        composable(route = "badge") { BadgeScreen(navController) }
        composable(route = "slider") { SliderScreen(navController) }
        composable(route = "dropdown") { DropDownScreen(navController) }
        composable(route = "card") { CardScreen(navController) }
        composable(route = "pager") { PagerScreen(navController) }
        composable(route = "navigation") { BottonNavigationScreen(navController) }
        composable(route = "modal") { ModalScreen(navController) }
    }
}