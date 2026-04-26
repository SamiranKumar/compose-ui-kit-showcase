package com.samirankumar11.uikitshowcase.ui.component.dialog

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
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
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit,
) {
    BasicAlertDialog(
        onDismissRequest = onDismissRequest,
        modifier = modifier,
    ) {
        AppDialogSurface(
            content = content,
        )
    }
}


@Composable
private fun AppDialogSurface(
    content: @Composable () -> Unit,
) {
    Surface(
        shape = AppShapes.medium,
    ) {
        Box(
            modifier = Modifier.padding(AppSpacing.md),
        ) {
            content()
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
        AppDialogSurface {
            Text(text = "App Dialog")
        }
    }
}