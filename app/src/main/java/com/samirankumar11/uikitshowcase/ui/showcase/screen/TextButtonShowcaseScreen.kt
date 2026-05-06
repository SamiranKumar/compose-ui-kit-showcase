package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.button.AppTextButton
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun TextButtonShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        AppTextButton(
            text = "Text Button",
            onClick = {},
        )

        AppTextButton(
            text = "Disabled",
            onClick = {},
            enabled = false,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun TextButtonShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        TextButtonShowcaseScreen()
    }
}