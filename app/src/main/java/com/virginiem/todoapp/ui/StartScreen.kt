package com.virginiem.todoapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StartScreen (modifier : Modifier = Modifier ) {
    Column (modifier = modifier.fillMaxSize()
        .padding(36.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End) {
        Text(text = "toto")
        Button(
            onClick = { /*TODO*/ }) {
            Text(text = "toto")

        }
    }

}

@Preview
@Composable
fun StartScreenPreview(){
    StartScreen()
}