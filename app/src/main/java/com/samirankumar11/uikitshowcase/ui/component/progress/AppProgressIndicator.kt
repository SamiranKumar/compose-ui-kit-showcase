package com.samirankumar11.uikitshowcase.ui.component.progress

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppProgressIndicator(
    modifier: Modifier = Modifier,
) {
    CircularProgressIndicator(
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppProgressIndicatorPreview() {
    ComposeUiKitShowcaseTheme {
        AppProgressIndicator()
    }
}