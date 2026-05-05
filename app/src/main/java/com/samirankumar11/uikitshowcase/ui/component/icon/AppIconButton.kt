package com.samirankumar11.uikitshowcase.ui.component.icon

import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

/**
 * A clickable icon action built on Material 3 [IconButton].
 *
 * @param imageVector The icon to display inside the button.
 * @param contentDescription Accessibility label announced to screen readers. Use null for
 * decorative use cases.
 * @param onClick Invoked when the user taps the icon button.
 * @param modifier Optional layout modifier.
 * @param enabled When false, the button is displayed in a disabled state and ignores input.
 */
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