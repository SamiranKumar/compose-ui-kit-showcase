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
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme


enum class AppDialogType {
    CONFIRMATION,
    INFORMATION,
    WARNING,
    ERROR,
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppDialog(
    onDismissRequest: () -> Unit,
    title: String,
    description: String? = null,
    onConfirm: () -> Unit,
    onCancel: () -> Unit,
    modifier: Modifier = Modifier,
    type: AppDialogType = AppDialogType.INFORMATION,
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
            type = type,
        )
    }
}

@Composable
private fun AppDialogContent(
    title: String,
    description: String?,
    onConfirm: () -> Unit,
    onCancel: () -> Unit,
    type: AppDialogType,
) {
    val titleColor = when (type) {
        AppDialogType.INFORMATION ->
            MaterialTheme.colorScheme.primary

        AppDialogType.CONFIRMATION ->
            MaterialTheme.colorScheme.primary

        AppDialogType.WARNING ->
            MaterialTheme.colorScheme.tertiary

        AppDialogType.ERROR ->
            MaterialTheme.colorScheme.error
    }

    Surface(
        shape = AppShapes.medium,
    ) {
        Column(
            modifier = Modifier.padding(AppSpacing.md),
        ) {
            Text(
                text = title,
                style = AppTypography.titleLarge,
                color = titleColor,
            )

            description?.let {
                Text(
                    text = it,
                    style = AppTypography.bodyMedium,
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
                    Text(
                        text = when (type) {
                            AppDialogType.INFORMATION -> "OK"
                            AppDialogType.CONFIRMATION -> "Confirm"
                            AppDialogType.WARNING -> "Continue"
                            AppDialogType.ERROR -> "Retry"
                        },
                    )
                }
            }
        }
    }
}


@Composable
@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 240,
)
private fun AppDialogPreview() {
    ComposeUiKitShowcaseTheme {
        AppDialog(
            title = "Delete Account",
            description = "Are you sure you want to delete your account?",
            onDismissRequest = {},
            onConfirm = {},
            onCancel = {},
            type = AppDialogType.WARNING,
        )
    }
}