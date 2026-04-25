package com.samirankumar11.uikitshowcase.ui.component.card

import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Card(
        modifier = modifier,
    ) {
        content()
    }
}

@Preview(showBackground = true)
@Composable
private fun AppCardPreview() {
    ComposeUiKitShowcaseTheme {
        AppCard {
            Text(text = "App Card")
        }
    }
}