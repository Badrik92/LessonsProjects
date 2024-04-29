package com.silent.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.silent.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}


@Composable
fun QuadrantApp(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxWidth()) {
        Row(modifier.weight(1f)) {
            ColumnShow(
                title = stringResource(id = R.string.text_composable),
                description = stringResource(id = R.string.text_composable_description),
                backgroundColor = colorResource(id = R.color.text_com),
                modifier.weight(1f)
            )
            ColumnShow(
                title = stringResource(id = R.string.image_composable),
                description = stringResource(id = R.string.image_composable_description),
                backgroundColor = colorResource(id = R.color.image_com),
                modifier.weight(1f)
            )

        }
        Row(modifier.weight(1f)) {
            ColumnShow(
                title = stringResource(id = R.string.row_composable),
                description = stringResource(id = R.string.row_composable_description),
                backgroundColor = colorResource(id = R.color.row_com),
                modifier.weight(1f)
            )
            ColumnShow(
                title = stringResource(id = R.string.column_composable),
                description = stringResource(id = R.string.column_composable_description),
                backgroundColor = colorResource(id = R.color.column_com),
                modifier.weight(1f)
            )

        }
    }
}

@Composable
fun ColumnShow(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier.padding(16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}
