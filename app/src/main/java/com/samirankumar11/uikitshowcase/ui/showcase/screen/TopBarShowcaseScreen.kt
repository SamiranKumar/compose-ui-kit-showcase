package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.topbar.AppTopBar
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun TopBarShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    AppTopBar(
        modifier = modifier.fillMaxWidth(),
        title = "Profile",
        onNavigationClick = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun TopBarShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        TopBarShowcaseScreen()
    }
}