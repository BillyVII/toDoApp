package com.virginiem.todoapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun StartScreen (modifier : Modifier = Modifier ) {
    var text by remember { mutableStateOf("")}
    Column (modifier = modifier
        .fillMaxSize()
        .padding(36.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End) {
        Text(text = "toto")
        EditTextField()
        Button(
            onClick = { AddEntree() }) {
            Text(text = "toto")

        }
    }

}
@Composable
fun EditTextField(){
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        value = text,
        onValueChange = { text = it},
        label = { Text(text = "label")},
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done
        )
    )

}

fun AddEntree(){
    val entreesList = mutableListOf<String>()
    entreesList.add("toto")
    entreesList.add("titi")
    entreesList.add("tata")

    for (entree in entreesList) {
        println(entree)
    }
}

@Preview
@Composable
fun StartScreenPreview(){
    StartScreen()
}