package com.samirankumar11.uikitshowcase.ui.showcase

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.showcase.screen.ButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.CardShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.DialogShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.TextFieldShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun UiKitShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(AppSpacing.md),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.lg),
    ) {
        ButtonShowcaseScreen()

        TextFieldShowcaseScreen()

        CardShowcaseScreen()

        DialogShowcaseScreen()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun UiKitShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        UiKitShowcaseScreen()
    }
}