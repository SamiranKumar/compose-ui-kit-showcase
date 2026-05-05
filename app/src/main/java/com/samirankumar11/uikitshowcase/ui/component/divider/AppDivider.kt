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

/**
 * Displays a thin horizontal divider used to separate blocks of content.
 *
 * This is a lightweight Material 3 divider wrapper that preserves the project’s
 * current spacing and visual style while allowing callers to add optional layout
 * padding through the [modifier].
 *
 * @param modifier Optional layout modifier applied to the divider.
 *
 * Example:
 * ```kotlin
 * AppDivider()
 * ```
 */
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