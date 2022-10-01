package com.giussepr.expensemanager.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.giussepr.expensemanager.R
import com.giussepr.expensemanager.navigation.AppScreens
import com.giussepr.expensemanager.ui.theme.ExpenseManagerTheme
import com.giussepr.expensemanager.ui.theme.White
import kotlinx.coroutines.delay

@Composable
@Preview
fun SplashScreenPreview() {
    ExpenseManagerTheme {
        SplashScreen(rememberNavController())
    }
}

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(2000L)
        navController.popBackStack()
        navController.navigate(AppScreens.MonthlyIncome.route)
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .background(White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.lottie_splash))
        LottieAnimation(composition, iterations = Int.MAX_VALUE, modifier = Modifier.size(250.dp))

        Text(text = stringResource(id = R.string.giussep_ricardo_cachaya), style = MaterialTheme.typography.caption)
    }
}
