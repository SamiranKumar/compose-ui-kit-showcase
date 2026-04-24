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

        AppButton(
            text = "Leading Icon",
            onClick = {},
            leadingIcon = {
                Text("→")
            },
        )

        AppButton(
            text = "Trailing Icon",
            onClick = {},
            trailingIcon = {
                Text("→")
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