package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.button.AppIconTextButton
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun IconTextButtonShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        Text(
            text = "Icon Text Button",
            style = AppTypography.titleMedium,
        )

        AppIconTextButton(
            text = "Edit",
            icon = Icons.Default.Edit,
            onClick = {},
        )

        AppIconTextButton(
            text = "Add",
            icon = Icons.Default.Add,
            onClick = {},
        )

        AppIconTextButton(
            text = "Disabled",
            icon = Icons.Default.Edit,
            onClick = {},
            enabled = false,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun IconTextButtonShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        IconTextButtonShowcaseScreen()
    }
}