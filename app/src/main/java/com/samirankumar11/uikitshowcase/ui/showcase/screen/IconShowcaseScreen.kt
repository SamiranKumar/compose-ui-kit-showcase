package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.icon.AppIcon
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun IconShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(AppSpacing.lg),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AppIcon(
            imageVector = Icons.Default.Home,
            contentDescription = "Home",
        )

        AppIcon(
            imageVector = Icons.Default.Favorite,
            contentDescription = "Favorite",
        )

        AppIcon(
            imageVector = Icons.Default.Settings,
            contentDescription = "Settings",
        )

        Text("AppIcon")
    }
}

@Preview(showBackground = true)
@Composable
private fun IconShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        IconShowcaseScreen()
    }
}