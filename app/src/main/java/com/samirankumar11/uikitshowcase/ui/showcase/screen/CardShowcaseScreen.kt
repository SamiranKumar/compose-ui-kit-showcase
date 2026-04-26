package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.card.AppCard
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun CardShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(AppSpacing.md),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.md),
    ) {
        Text(
            text = "AppCard",
        )

        AppCard {
            Column {
                Text(
                    text = "Card Title",
                )

                Text(
                    text = "Card content goes here.",
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        CardShowcaseScreen()
    }
}