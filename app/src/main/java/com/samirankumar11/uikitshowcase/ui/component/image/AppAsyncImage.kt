package com.samirankumar11.uikitshowcase.ui.component.image

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppAsyncImage(
    model: Any?,
    contentDescription: String?,
    modifier: Modifier = Modifier,
    contentScale: ContentScale = ContentScale.Crop,
) {
    SubcomposeAsyncImage(
        model = model,
        contentDescription = contentDescription,
        contentScale = contentScale,
        modifier = modifier,
        loading = {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center,
            ) {
                CircularProgressIndicator()
            }
        },
        error = {
            Text("Image failed to load")
        },
        success = {
            SubcomposeAsyncImageContent()
        },
    )
}

@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 300,
)
@Composable
private fun AppAsyncImagePreview() {
    ComposeUiKitShowcaseTheme {
        AppAsyncImage(
            model = "https://images.unsplash.com/photo-1537824598505-99ee03483384?auto=format&fit=crop&q=80&w=1200",
            contentDescription = "Preview image",
        )
    }
}