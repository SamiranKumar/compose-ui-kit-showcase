package com.samirankumar11.uikitshowcase.ui.component.snackbar

import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppSnackBar(
    message: String,
    modifier: Modifier = Modifier,
    actionLabel: String? = null,
    onActionClick: (() -> Unit)? = null,
) {
    Snackbar(
        modifier = modifier,
        action = {
            if (actionLabel != null && onActionClick != null) {
                androidx.compose.material3.TextButton(
                    onClick = onActionClick,
                ) {
                    Text(text = actionLabel)
                }
            }
        },
    ) {
        Text(text = message)
    }
}

@Preview(showBackground = true)
@Composable
private fun AppSnackBarPreview() {
    ComposeUiKitShowcaseTheme {
        AppSnackBar(
            message = "Profile updated successfully",
            actionLabel = "Undo",
            onActionClick = {},
        )
    }
}