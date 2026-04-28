package com.samirankumar11.uikitshowcase.ui.component.switch_a

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppSwitch(
    checked: Boolean,
    onCheckedChange: ((Boolean) -> Unit)?,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Switch(
        checked = checked,
        onCheckedChange = onCheckedChange,
        modifier = modifier,
        enabled = enabled,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppSwitchPreview() {
    ComposeUiKitShowcaseTheme {
        AppSwitch(
            checked = true,
            onCheckedChange = {},
        )
    }
}