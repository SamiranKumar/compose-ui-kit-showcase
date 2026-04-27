package com.samirankumar11.uikitshowcase.ui.component.divider

import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp

@Composable
fun AppDivider(
    modifier: Modifier = Modifier,
) {
    HorizontalDivider(
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppDividerPreview() {
    ComposeUiKitShowcaseTheme {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Content Above")

            AppDivider(
                modifier = Modifier.padding(vertical = 16.dp)
            )

            Text("Content Below")
        }
    }
}