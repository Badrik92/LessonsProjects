package com.silent.example_1_compose_article

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.silent.example_1_compose_article.ui.theme.Example_1_Compose_ArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example_1_Compose_ArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    ArticleApp(
        title = stringResource(id = R.string.jetpack_compose_tutorial),
        shortDescription = stringResource(id = R.string.part_1),
        longDescription = stringResource(id = R.string.part_2),
        imagePainter = painterResource(id = R.drawable.bg_compose_background)
    )
}

@Composable
fun ArticleApp(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = imagePainter,
            contentDescription = null
        )
        Text(
            text = title,
            modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDescription,
            modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = longDescription,
            modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Example_1_Compose_ArticleTheme {
        ComposeArticleApp()
    }
}