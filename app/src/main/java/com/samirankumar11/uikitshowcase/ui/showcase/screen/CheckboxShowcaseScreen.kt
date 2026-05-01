package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.checkbox.AppCheckbox
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun CheckboxShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        AppCheckbox(
            checked = true,
            onCheckedChange = {},
        )

        Text("Accept terms and conditions")
    }
}

@Preview(showBackground = true)
@Composable
private fun CheckboxShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        CheckboxShowcaseScreen()
    }
}