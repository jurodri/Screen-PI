package com.example.vigillatus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.vigillatus.ui.screens.LandingPage
import com.example.vigillatus.ui.theme.VigillatusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VigillatusTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LandingPage(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

