package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.divider.AppDivider
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun DividerShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(AppSpacing.md),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.md),
    ) {
        Text(
            text = "AppDivider",
            style = AppTypography.titleMedium,
        )

        Text(
            text = "Default Divider",
            style = AppTypography.bodyMedium,
        )

        AppDivider()

        Text(
            text = "Another Divider",
            style = AppTypography.bodyMedium,
        )

        AppDivider()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun DividerShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        DividerShowcaseScreen()
    }
}