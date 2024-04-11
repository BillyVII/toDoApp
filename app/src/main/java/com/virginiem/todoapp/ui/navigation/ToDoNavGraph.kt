package com.virginiem.todoapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.virginiem.todoapp.ui.StartScreen
import com.virginiem.todoapp.ui.home.HomeDestination

@Composable
fun ToDoNavHost(
    navController: NavHostController = rememberNavController()
){
    NavHost(navController = navController, startDestination = HomeDestination.route){
        composable(route = HomeDestination.route){
            StartScreen()
        }
    }
}