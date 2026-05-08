package com.samirankumar11.uikitshowcase.ui.component.toggle

import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppToggleButton(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    checkedIcon: ImageVector,
    uncheckedIcon: ImageVector,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    IconToggleButton(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
    ) {
        Icon(
            imageVector = if (checked) checkedIcon else uncheckedIcon,
            contentDescription = if (checked) "Checked" else "Unchecked",
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun AppToggleButtonPreview() {
    ComposeUiKitShowcaseTheme {
        AppToggleButton(
            checked = true,
            onCheckedChange = {},
            checkedIcon = androidx.compose.material.icons.Icons.Default.Favorite,
            uncheckedIcon = androidx.compose.material.icons.Icons.Default.FavoriteBorder,
        )
    }
}