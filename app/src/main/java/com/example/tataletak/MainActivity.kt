package com.example.tataletak

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import com.example.tataletak.ui.theme.TataletakTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TataletakTheme {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Panggil composable layout utama dengan padding dari Scaffold
                TataletakBoxColumnRow(
                    modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}