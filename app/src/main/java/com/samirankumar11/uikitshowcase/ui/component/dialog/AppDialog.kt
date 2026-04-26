package com.samirankumar11.uikitshowcase.ui.component.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppDialog(
    onDismissRequest: () -> Unit,
    title: String,
    description: String? = null,
    onConfirm: () -> Unit,
    onCancel: () -> Unit,
    modifier: Modifier = Modifier,
) {
    BasicAlertDialog(
        onDismissRequest = onDismissRequest,
        modifier = modifier,
    ) {
        AppDialogContent(
            title = title,
            description = description,
            onConfirm = onConfirm,
            onCancel = onCancel,
        )
    }
}

@Composable
private fun AppDialogContent(
    title: String,
    description: String?,
    onConfirm: () -> Unit,
    onCancel: () -> Unit,
) {
    Surface(
        shape = AppShapes.medium,
    ) {
        Column(
            modifier = Modifier.padding(AppSpacing.md),
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge,
            )

            description?.let {
                Text(
                    text = it,
                    style = MaterialTheme.typography.bodyMedium,
                )
            }

            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(top = AppSpacing.md),
                horizontalArrangement = Arrangement.spacedBy(AppSpacing.sm),
            ) {
                OutlinedButton(
                    onClick = onCancel,
                ) {
                    Text(text = "Cancel")
                }

                Button(
                    onClick = onConfirm,
                ) {
                    Text(text = "Confirm")
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 240,
)
@Composable
private fun AppDialogPreview() {
    ComposeUiKitShowcaseTheme {
        AppDialogContent(
            title = "Delete Account",
            description = "Are you sure you want to delete your account?",
            onConfirm = {},
            onCancel = {},
        )
    }
}