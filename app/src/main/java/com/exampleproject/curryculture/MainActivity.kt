package com.exampleproject.curryculture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.exampleproject.curryculture.Navigation.Nav
import com.exampleproject.curryculture.ui.theme.CurryCultureTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurryCultureTheme {
                Nav()

            }
        }
    }
}
