package com.samirankumar11.uikitshowcase.ui.component.progress

import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppLinearProgress(
    modifier: Modifier = Modifier,
    progress: Float = 0.5f,
) {
    LinearProgressIndicator(
        progress = { progress },
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppLinearProgressPreview() {
    ComposeUiKitShowcaseTheme {
        AppLinearProgress(progress = 0.6f)
    }
}
