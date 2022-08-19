package com.dlr.home.ui

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

/**
 * Created by R. Mert Dolar on 16.08.2022.
 */
@Composable
fun HomeScreen(navController : NavHostController,text : String){
    Text(text = "Hello $text!")
}