package com.dolar.multi_module_architecture_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dlr.home.ui.HomeMain
import com.dolar.multi_module_architecture_sample.ui.theme.MultimodulearchitecturesampleTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultimodulearchitecturesampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    GenerateMainNavigation()
                }
            }
        }
    }
}

@Composable
fun GenerateMainNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeMain() }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MultimodulearchitecturesampleTheme {
        GenerateMainNavigation()
    }
}