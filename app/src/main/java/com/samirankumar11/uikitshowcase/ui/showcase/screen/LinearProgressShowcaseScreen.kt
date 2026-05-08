package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.progress.AppLinearProgress
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun LinearProgressShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        Text(
            text = "Linear Progress",
            style = AppTypography.titleMedium,
        )

        AppLinearProgress(
            modifier = Modifier.fillMaxWidth(),
            progress = 0.65f,
        )

        AppLinearProgress(
            modifier = Modifier.fillMaxWidth(),
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun LinearProgressShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        LinearProgressShowcaseScreen()
    }
}