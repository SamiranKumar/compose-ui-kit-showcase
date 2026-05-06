package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.text.AppText
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun TextShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        AppText(
            text = "Title Text",
            style = androidx.compose.material3.MaterialTheme.typography.titleLarge,
        )

        AppText(
            text = "Body text example",
        )

        AppText(
            text = "Label Text",
            style = androidx.compose.material3.MaterialTheme.typography.labelLarge,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun TextShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        TextShowcaseScreen()
    }
}