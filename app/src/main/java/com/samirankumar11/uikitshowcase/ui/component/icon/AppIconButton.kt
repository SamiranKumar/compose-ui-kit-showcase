package com.samirankumar11.uikitshowcase.ui.component.icon

import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppIconButton(
    imageVector: ImageVector,
    contentDescription: String? = null,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    IconButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
    ) {
        AppIcon(
            imageVector = imageVector,
            contentDescription = contentDescription,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppIconButtonPreview() {
    ComposeUiKitShowcaseTheme {
        AppIconButton(
            imageVector = PreviewIcon,
            contentDescription = "Preview icon",
            onClick = {},
        )
    }
}