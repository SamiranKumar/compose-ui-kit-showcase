package com.samirankumar11.uikitshowcase.ui.component.toggle

import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppSegmentedButton(
    items: List<String>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    SingleChoiceSegmentedButtonRow(
        modifier = modifier,
    ) {
        items.forEachIndexed { index, item ->
            SegmentedButton(
                selected = selectedIndex == index,
                onClick = {
                    onItemSelected(index)
                },
                enabled = enabled,
                shape = SegmentedButtonDefaults.itemShape(
                    index = index,
                    count = items.size,
                ),
                icon = {},
            ) {
                Text(text = item)
            }
        }
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun AppSegmentedButtonPreview() {
    ComposeUiKitShowcaseTheme {
        AppSegmentedButton(
            items = listOf("Day", "Week", "Month"),
            selectedIndex = 0,
            onItemSelected = {},
        )
    }
}