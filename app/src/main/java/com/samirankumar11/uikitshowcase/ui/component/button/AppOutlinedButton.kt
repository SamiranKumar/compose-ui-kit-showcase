package com.samirankumar11.uikitshowcase.ui.component.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppOutlinedButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    leadingIcon: (@Composable (() -> Unit))? = null,
    trailingIcon: (@Composable (() -> Unit))? = null,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier.height(AppSpacing.buttonHeight),
        enabled = enabled,
        shape = AppShapes.medium,
    ) {
        if (leadingIcon != null) {
            leadingIcon()
        }

        Text(text = text)

        if (trailingIcon != null) {
            trailingIcon()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AppOutlinedButtonPreview() {
    ComposeUiKitShowcaseTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
        ) {
            AppOutlinedButton(
                text = "Secondary",
                onClick = {},
            )
            AppOutlinedButton(
                text = "Disabled",
                onClick = {},
                enabled = false,
            )
        }
    }
}
