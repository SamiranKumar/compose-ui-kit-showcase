package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.radio_button.AppRadioButton
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun RadioButtonShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
    ) {
        AppRadioButton(
            selected = true,
            onClick = {},
        )

        Text("Selected option")

        AppRadioButton(
            selected = false,
            onClick = {},
        )

        Text("Unselected option")
    }
}

@Preview(showBackground = true)
@Composable
private fun RadioButtonShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        RadioButtonShowcaseScreen()
    }
}