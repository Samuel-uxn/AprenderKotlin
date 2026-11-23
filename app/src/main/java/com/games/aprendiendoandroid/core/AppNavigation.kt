package com.games.aprendiendoandroid.core

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import feature.MenuScreen
import feature.imc.ImcScreen

@Composable
fun AppNavigation(){
    val backStack = rememberNavBackStack(Menu)
    NavDisplay(backStack = backStack, entryProvider = entryProvider {
        entry<Menu>{
            MenuScreen(onImcSelect = {backStack.add(IMC)})
        }
        entry<IMC>{
            ImcScreen()
        }
    })
}