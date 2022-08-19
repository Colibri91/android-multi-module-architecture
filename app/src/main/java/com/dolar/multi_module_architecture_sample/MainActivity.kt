package com.dolar.multi_module_architecture_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.rememberNavController
import com.dolar.multi_module_architecture_sample.presentation.BottomNavigationBar
import com.dolar.multi_module_architecture_sample.presentation.NavigationGraph
import com.dolar.multi_module_architecture_sample.ui.theme.MultimodulearchitecturesampleTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultimodulearchitecturesampleTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    MainScreenView()
                }
            }
        }
    }
}

@Composable
fun MainScreenView(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        NavigationGraph(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MultimodulearchitecturesampleTheme {
    }
}