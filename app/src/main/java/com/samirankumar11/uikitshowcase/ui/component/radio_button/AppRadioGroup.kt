package com.samirankumar11.uikitshowcase.ui.component.radio_button

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppRadioGroup(
    options: List<String>,
    selectedIndex: Int,
    onSelectionChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Column(
        modifier = modifier,
    ) {
        options.forEachIndexed { index, option ->
            RadioButton(
                selected = selectedIndex == index,
                onClick = {
                    onSelectionChange(index)
                },
                enabled = enabled,
            )

            Text(
                text = option,
            )
        }
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun AppRadioGroupPreview() {
    ComposeUiKitShowcaseTheme {
        AppRadioGroup(
            options = listOf(
                "Male",
                "Female",
                "Other",
            ),
            selectedIndex = 0,
            onSelectionChange = {},
        )
    }
}