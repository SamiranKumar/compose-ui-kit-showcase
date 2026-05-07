package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.textfield.AppPasswordField
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun PasswordFieldShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    var password by remember {
        mutableStateOf("password123")
    }

    var emptyPassword by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        AppPasswordField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth(),
            label = "Password",
        )

        AppPasswordField(
            value = emptyPassword,
            onValueChange = { emptyPassword = it },
            modifier = Modifier.fillMaxWidth(),
            label = "Required Password",
            isError = emptyPassword.isEmpty(),
            supportingText = if (emptyPassword.isEmpty()) {
                "Password is required"
            } else {
                null
            },
        )

        AppPasswordField(
            value = "disabled123",
            onValueChange = {},
            modifier = Modifier.fillMaxWidth(),
            label = "Disabled",
            enabled = false,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun PasswordFieldShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        PasswordFieldShowcaseScreen()
    }
}