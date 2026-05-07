package com.samirankumar11.uikitshowcase.ui.component.progress

import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppCircularProgress(
    modifier: Modifier = Modifier,
    progress: Float? = null,
) {
    if (progress == null) {
        CircularProgressIndicator(
            modifier = modifier,
        )
    } else {
        CircularProgressIndicator(
            progress = { progress.coerceIn(0f, 1f) },
            modifier = modifier,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun AppCircularProgressPreview() {
    ComposeUiKitShowcaseTheme {
        AppCircularProgress(
            progress = 0.65f,
        )
    }
}