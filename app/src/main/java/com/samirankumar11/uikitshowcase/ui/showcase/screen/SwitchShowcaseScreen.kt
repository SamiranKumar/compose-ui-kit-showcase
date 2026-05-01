package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.switch_a.AppSwitch
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun SwitchShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "Enable notifications",
            modifier = Modifier.weight(1f),
        )

        AppSwitch(
            checked = true,
            onCheckedChange = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SwitchShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        SwitchShowcaseScreen()
    }
}