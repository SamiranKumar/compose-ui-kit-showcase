package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.searchbar.AppSearchBar
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun SearchBarShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    var searchText by remember {
        mutableStateOf("")
    }

    AppSearchBar(
        value = searchText,
        onValueChange = {
            searchText = it
        },
        modifier = modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = true)
@Composable
private fun SearchBarShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        SearchBarShowcaseScreen()
    }
}