package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.empty_state.AppEmptyState
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun EmptyStateShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    AppEmptyState(
        title = "No data found",
        description = "There is nothing to display.",
        modifier = modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = true)
@Composable
private fun EmptyStateShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        EmptyStateShowcaseScreen()
    }
}