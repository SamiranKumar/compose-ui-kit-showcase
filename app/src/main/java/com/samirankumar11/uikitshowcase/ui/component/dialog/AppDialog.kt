package com.samirankumar11.uikitshowcase.ui.component.dialog

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
    modifier: Modifier = Modifier,
) {
    BasicAlertDialog(
        onDismissRequest = onDismissRequest,
        modifier = modifier,
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
            }
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320,
    heightDp = 200,
)
@Composable
private fun AppDialogPreview() {
    ComposeUiKitShowcaseTheme {
        Surface(
            shape = AppShapes.medium,
        ) {
            Column(
                modifier = Modifier.padding(AppSpacing.md),
            ) {
                Text(
                    text = "Delete Account",
                    style = MaterialTheme.typography.titleLarge,
                )

                Text(
                    text = "Are you sure you want to delete your account?",
                    style = MaterialTheme.typography.bodyMedium,
                )
            }
        }
    }
}