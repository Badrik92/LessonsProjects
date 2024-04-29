package com.silent.projectsimplebusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.silent.projectsimplebusinesscard.ui.theme.ProjectSimpleBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjectSimpleBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    BusinessApp()
                }
            }
        }
    }
}

@Composable
fun BusinessApp(modifier: Modifier = Modifier.background(color = Color.Cyan)) {
    val image: Painter = painterResource(id = R.drawable.android_logo)
    Column(modifier) {
        Image(
            painter = image,
            contentDescription = null
        )
    }
}

@Preview
@Composable
fun ShowApp() {
    BusinessApp()
}