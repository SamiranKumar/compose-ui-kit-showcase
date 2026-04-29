package com.samirankumar11.uikitshowcase.ui.component.empty_state

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppEmptyState(
    title: String,
    modifier: Modifier = Modifier,
    description: String? = null,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(
            text = title,
            style = AppTypography.titleMedium,
        )

        if (description != null) {
            Text(
                text = description,
                style = AppTypography.bodyMedium,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppEmptyStatePreview() {
    ComposeUiKitShowcaseTheme {
        AppEmptyState(
            title = "No data found",
            description = "There is nothing to display.",
        )
    }
}