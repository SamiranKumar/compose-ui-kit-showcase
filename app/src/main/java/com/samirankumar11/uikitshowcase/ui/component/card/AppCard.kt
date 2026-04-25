package com.samirankumar11.uikitshowcase.ui.component.card

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    Card(
        modifier = modifier,
        shape = AppShapes.medium,
    ) {
        Box(
            modifier = Modifier.padding(AppSpacing.md),
        ) {
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppCardPreview() {
    ComposeUiKitShowcaseTheme {
        AppCard {
            Box(
                modifier = Modifier.size(160.dp),
                contentAlignment = Alignment.Center,
            ) {
                Text(text = "App Card")
            }
        }
    }
}