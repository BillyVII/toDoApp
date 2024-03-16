package com.virginiem.todoapp.ui.home

import androidx.annotation.StringRes
import com.virginiem.todoapp.R
import com.virginiem.todoapp.ui.navigation.NavigationDestination

object HomeDestination : NavigationDestination {
    override val route = "home"
    override val titleRes = R.string.app_name

}