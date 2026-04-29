package com.samirankumar11.uikitshowcase.ui.component.searchbar

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppSearchBar(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "Search",
    enabled: Boolean = true,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        placeholder = {
            Text(text = placeholder)
        },
        singleLine = true,
        enabled = enabled,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppSearchBarPreview() {
    ComposeUiKitShowcaseTheme {
        AppSearchBar(
            value = "",
            onValueChange = {},
        )
    }
}