package com.samirankumar11.uikitshowcase.ui.component.tooltip

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.PlainTooltip
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTooltip(
    text: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    TooltipBox(
        positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
        tooltip = {
            PlainTooltip {
                Text(text)
            }
        },
        state = rememberTooltipState(),
        modifier = modifier,
    ) {
        content()
    }
}

@Preview(showBackground = true)
@Composable
private fun AppTooltipPreview() {
    ComposeUiKitShowcaseTheme {
        AppTooltip(
            text = "This is a tooltip",
        ) {
            Box {
                Text("Hover / long press")
            }
        }
    }
}