package com.giussepr.expensemanager.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.giussepr.expensemanager.monthlyincome.MonthlyIncomeScreen
import com.giussepr.expensemanager.splash.SplashScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.SplashScreen.route) {
        composable(AppScreens.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(AppScreens.MonthlyIncome.route) {
            MonthlyIncomeScreen()
        }
    }
}
