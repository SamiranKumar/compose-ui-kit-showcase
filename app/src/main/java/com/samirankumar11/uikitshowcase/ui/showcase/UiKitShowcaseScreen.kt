package com.samirankumar11.uikitshowcase.ui.showcase

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samirankumar11.uikitshowcase.ui.component.button.AppButton
import com.samirankumar11.uikitshowcase.ui.component.input.AppTextField
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun UiKitShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Text(text = "AppButton")

        AppButton(
            text = "Login",
            onClick = {},
        )

        AppButton(
            text = "Disabled",
            onClick = {},
            enabled = false,
        )

        AppButton(
            text = "Loading",
            onClick = {},
            isLoading = true,
        )

        Text(text = "AppTextField")

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

        AppTextField(
            value = "",
            onValueChange = {},
            label = "Search",
            placeholder = "Search...",
            leadingIcon = {
                Text("@")
            },
            trailingIcon = {
                Text("X")
            },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun UiKitShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        UiKitShowcaseScreen()
    }
}