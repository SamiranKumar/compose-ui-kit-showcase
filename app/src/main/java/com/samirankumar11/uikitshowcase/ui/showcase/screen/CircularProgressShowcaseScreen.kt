package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.progress.AppCircularProgress
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun CircularProgressShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        Text(
            text = "Circular Progress",
            style = AppTypography.titleMedium,
        )

        // Determinate
        AppCircularProgress(
            progress = 0.65f,
        )

        // Indeterminate
        AppCircularProgress()
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun CircularProgressShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        CircularProgressShowcaseScreen()
    }
}