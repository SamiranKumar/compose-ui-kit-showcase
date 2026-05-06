package com.samirankumar11.uikitshowcase.ui.component.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = AppTypography.bodyLarge,
    color: Color = Color.Unspecified,
) {
    Text(
        text = text,
        modifier = modifier,
        style = style,
        color = color,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppTextPreview() {
    ComposeUiKitShowcaseTheme {
        AppText(
            text = "Welcome to the UI kit",
            style = AppTypography.titleMedium,
        )
    }
}
