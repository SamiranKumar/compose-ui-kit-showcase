package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.button.AppButton
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun ButtonShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(AppSpacing.md),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.md),
    ) {
        Text(
            text = "AppButton",
        )

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
    }
}

@Preview(showBackground = true)
@Composable
private fun ButtonShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        ButtonShowcaseScreen()
    }
}