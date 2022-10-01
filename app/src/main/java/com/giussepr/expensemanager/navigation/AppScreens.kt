package com.giussepr.expensemanager.navigation

sealed class AppScreens(val route: String) {
    object SplashScreen : AppScreens("splash_screen")
    object MonthlyIncome : AppScreens("monthly_income")
}
