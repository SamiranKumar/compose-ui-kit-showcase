package com.samirankumar11.uikitshowcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.samirankumar11.uikitshowcase.ui.showcase.UiKitShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            ComposeUiKitShowcaseTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    UiKitShowcaseScreen(
                        modifier = Modifier
                            .padding(innerPadding),
                    )
                }
            }
        }
    }
}
