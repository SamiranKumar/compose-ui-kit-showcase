package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.bottombar.AppBottomBar
import com.samirankumar11.uikitshowcase.ui.component.bottombar.AppBottomBarItem
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun BottomBarShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    AppBottomBar(
        modifier = modifier.fillMaxWidth(),
        items = listOf(
            AppBottomBarItem(
                label = "Home",
                icon = Icons.Default.Home,
            ),
            AppBottomBarItem(
                label = "Profile",
                icon = Icons.Default.Person,
            ),
        ),
        selectedIndex = 0,
        onItemClick = {},
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun BottomBarShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        BottomBarShowcaseScreen()
    }
}