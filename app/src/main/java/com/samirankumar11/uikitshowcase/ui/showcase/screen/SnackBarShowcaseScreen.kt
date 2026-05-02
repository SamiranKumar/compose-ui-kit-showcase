package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.snackbar.AppSnackBar
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun SnackBarShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    AppSnackBar(
        message = "Profile updated successfully",
        actionLabel = "Undo",
        onActionClick = {},
        modifier = modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = true)
@Composable
private fun SnackBarShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        SnackBarShowcaseScreen()
    }
}