package com.samirankumar11.uikitshowcase.ui.component.button

import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppIconTextButton(
    text: String,
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
        )

        Text(text = text)
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun AppIconTextButtonPreview() {
    ComposeUiKitShowcaseTheme {
        AppIconTextButton(
            text = "Edit",
            icon = androidx.compose.material.icons.Icons.Default.Edit,
            onClick = {},
        )
    }
}