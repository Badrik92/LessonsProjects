package com.silent.mylittlepetproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.silent.mylittlepetproject.ui.theme.MyLittlePetProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLittlePetProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier, color = MaterialTheme.colorScheme.background
                ) {
                    Images(text = stringResource(R.string.the_imperator))
                }
            }
        }
    }
}

@Composable
fun Images(text: String, modifier: Modifier = Modifier) {
    Row() {
        Box(
            modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.imperator),
                contentDescription = null,
                modifier
                    .fillMaxSize(0.5f)
                    .padding(
                        8.dp
                    )

            )
            Text(
                text = text,
                textAlign = TextAlign.End,
                modifier = Modifier.padding(8.dp)
            )
        }
    }


}

@Preview(showBackground = true)
@Composable
fun ShowHello() {
    Images(stringResource(id = R.string.the_imperator))
}

