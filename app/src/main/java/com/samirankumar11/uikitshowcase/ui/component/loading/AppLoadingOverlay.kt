package com.samirankumar11.uikitshowcase.ui.component.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppLoadingOverlay(
    visible: Boolean,
    modifier: Modifier = Modifier,
) {
    if (!visible) return

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        CircularProgressIndicator()
    }
}

@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 640,
)
@Composable
private fun AppLoadingOverlayPreview() {
    ComposeUiKitShowcaseTheme {
        AppLoadingOverlay(
            visible = true,
        )
    }
}