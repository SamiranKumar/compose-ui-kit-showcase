package com.samirankumar11.uikitshowcase.ui.component.badge

import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppBadge(
    text: String,
    modifier: Modifier = Modifier,
) {
    Badge(
        modifier = modifier,
    ) {
        Text(
            text = text,
            style = AppTypography.labelMedium,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppBadgePreview() {
    ComposeUiKitShowcaseTheme {
        AppBadge(
            text = "New",
        )
    }
}