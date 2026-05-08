package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.toggle.AppToggleButton
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun ToggleButtonShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    var checked by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        Text(
            text = "Toggle Button",
            style = AppTypography.titleMedium,
        )

        AppToggleButton(
            checked = checked,
            onCheckedChange = { checked = it },
            checkedIcon = Icons.Default.Favorite,
            uncheckedIcon = Icons.Default.FavoriteBorder,
        )

        AppToggleButton(
            checked = true,
            onCheckedChange = {},
            checkedIcon = Icons.Default.Favorite,
            uncheckedIcon = Icons.Default.FavoriteBorder,
            enabled = false,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun ToggleButtonShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        ToggleButtonShowcaseScreen()
    }
}