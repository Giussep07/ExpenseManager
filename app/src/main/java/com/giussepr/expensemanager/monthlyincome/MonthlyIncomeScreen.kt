package com.giussepr.expensemanager.monthlyincome

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.giussepr.expensemanager.R
import com.giussepr.expensemanager.ui.theme.ExpenseManagerTheme
import com.giussepr.expensemanager.ui.theme.White

@Composable
@Preview
fun MonthlyIncomePreview() {
    ExpenseManagerTheme {
        MonthlyIncomeScreen()
    }
}

@Composable
fun MonthlyIncomeScreen() {
    var text by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(White)
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {

        Text(text = stringResource(id = R.string.monthly_income_title),
            style = MaterialTheme.typography.h5,
            textAlign = TextAlign.Center)

        OutlinedTextField(value = text,
            onValueChange = { text = it },
            placeholder = { Text(stringResource(id = R.string.monthly_income)) })

        Button(onClick = { /*TODO*/ }) {
            Text(text = stringResource(id = R.string.start))
        }
    }
}
