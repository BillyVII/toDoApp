package com.virginiem.todoapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.virginiem.todoapp.ui.model.Entree


@Composable
fun StartScreen (startScreenViewModel: StartScreenViewModel = viewModel(), modifier: Modifier = Modifier) {

    val startUiState by startScreenViewModel.uiState.collectAsState()

    val list = startScreenViewModel.entreesList

    // WordListLayout()
    Column (modifier = modifier
        .fillMaxSize()
        .padding(36.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End) {
        WordListLayout(list = list)
        EditTextField(value = startScreenViewModel.word,
            valueChange = {startScreenViewModel.addWord(it)})
        Button(onClick = { startScreenViewModel.addEntree() }) {

        }


    }

}

@Composable
fun WordListLayout(list: List<Entree>){
    LazyColumn(){
        items(list){
            WordItem(word = it)
        }
    }
}

@Composable
fun WordItem(word: Entree){
    Card{
        Text(text = word.entree, fontWeight = FontWeight.Bold, fontSize = 32.sp)
    }
}
@Composable
fun EditTextField(value:String,
                  valueChange: (String)-> Unit){

    OutlinedTextField(
        value = value,
        onValueChange = valueChange,
        label = { Text(text = "label")},
        keyboardOptions = KeyboardOptions.Default.copy(
            imeAction = ImeAction.Done,
            keyboardType = KeyboardType.Text
        ),
        keyboardActions = KeyboardActions()
    )
}


@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen()
}