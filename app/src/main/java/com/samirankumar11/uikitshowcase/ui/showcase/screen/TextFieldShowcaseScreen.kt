package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.input.AppTextField
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun TextFieldShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(AppSpacing.md),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.md),
    ) {
        Text(
            text = "AppTextField",
        )

        AppTextField(
            value = "",
            onValueChange = {},
            label = "Email",
            placeholder = "Enter your email",
        )

        AppTextField(
            value = "",
            onValueChange = {},
            label = "Email",
            placeholder = "Enter your email",
            isError = true,
            errorMessage = "Invalid email address",
        )

        AppTextField(
            value = "password123",
            onValueChange = {},
            label = "Password",
            placeholder = "Enter password",
            passwordVisible = false,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TextFieldShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        TextFieldShowcaseScreen()
    }
}