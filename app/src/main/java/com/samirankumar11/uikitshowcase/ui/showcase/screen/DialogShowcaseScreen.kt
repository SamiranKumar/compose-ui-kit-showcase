package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.dialog.AppDialog
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun DialogShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    var showDialog by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(AppSpacing.md),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.md),
    ) {
        Text(
            text = "AppDialog",
        )

        Button(
            onClick = {
                showDialog = true
            },
        ) {
            Text(
                text = "Show Dialog",
            )
        }
    }

    if (showDialog) {
        AppDialog(
            onDismissRequest = {
                showDialog = false
            },
            title = "Delete Account",
            description = "Are you sure you want to delete your account?",
            onConfirm = {
                showDialog = false
            },
            onCancel = {
                showDialog = false
            },
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun DialogShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        DialogShowcaseScreen()
    }
}