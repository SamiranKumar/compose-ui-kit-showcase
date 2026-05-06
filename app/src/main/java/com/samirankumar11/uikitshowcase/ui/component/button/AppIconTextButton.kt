package com.samirankumar11.uikitshowcase.ui.component.button

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppIconTextButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    icon: (@Composable () -> Unit)? = null,
) {
    Button(
        onClick = onClick,
        modifier = modifier.height(AppSpacing.buttonHeight),
        enabled = enabled,
        shape = AppShapes.medium,
    ) {
        if (icon != null) {
            icon()
        }

        Text(text = text)
    }
}

@Preview(showBackground = true)
@Composable
private fun AppIconTextButtonPreview() {
    ComposeUiKitShowcaseTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
        ) {
            AppIconTextButton(
                text = "Add item",
                onClick = {},
                icon = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                    )
                },
            )

            AppIconTextButton(
                text = "Disabled",
                onClick = {},
                enabled = false,
                icon = {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                    )
                },
            )
        }
    }
}
