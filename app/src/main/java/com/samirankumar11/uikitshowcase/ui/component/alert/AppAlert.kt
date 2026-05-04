package com.samirankumar11.uikitshowcase.ui.component.alert

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppAlert(
    visible: Boolean,
    title: String,
    message: String,
    onDismiss: () -> Unit,
    confirmText: String = "OK",
) {
    if (!visible) return

    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(title)
        },
        text = {
            Text(message)
        },
        confirmButton = {
            TextButton(
                onClick = onDismiss,
            ) {
                Text(confirmText)
            }
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun AppAlertPreview() {
    ComposeUiKitShowcaseTheme {
        AppAlert(
            visible = true,
            title = "Information",
            message = "Your profile has been updated successfully.",
            onDismiss = {},
        )
    }
}