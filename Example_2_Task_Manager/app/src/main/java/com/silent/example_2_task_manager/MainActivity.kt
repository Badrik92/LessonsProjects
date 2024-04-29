package com.silent.example_2_task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.silent.example_2_task_manager.ui.theme.Example_2_Task_ManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example_2_Task_ManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowTaskApp()
                }
            }
        }
    }
}

@Composable
fun ShowTaskApp() {
    TaskApp(
        imagePainter = painterResource(id = R.drawable.ic_task_completed),
        firstText = stringResource(id = R.string.first_text),
        secondText = stringResource(id = R.string.second_text)
    )
}

@Composable
fun TaskApp(
    imagePainter: Painter,
    firstText: String,
    secondText: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imagePainter,
            contentDescription = null
        )
        Text(text = firstText)
        Text(text = secondText)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Example_2_Task_ManagerTheme {

    }
}