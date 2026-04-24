package com.samirankumar11.uikitshowcase.ui.component.button

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    isLoading: Boolean = false
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(AppSpacing.buttonHeight),
        enabled = enabled,
        shape = AppShapes.medium,
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.size(20.dp),
                color = MaterialTheme.colorScheme.onPrimary,
                strokeWidth = 2.dp,
            )
        } else {
            Text(
                text = text,
                style = MaterialTheme.typography.labelLarge,
            )
        }

    }
}


@Preview(showBackground = true)
@Composable
private fun AppButtonPreview() {
    ComposeUiKitShowcaseTheme {
        AppButton(
            text = "Login",
            onClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppButtonDisabledPreview() {
    ComposeUiKitShowcaseTheme {
        AppButton(
            text = "Disabled",
            onClick = {},
            enabled = false,
        )
    }
}


@Preview(
    showBackground = true,
    widthDp = 100,
    heightDp = 40
)
@Composable
private fun AppButtonLoadingPreview() {
    ComposeUiKitShowcaseTheme {
        AppButton(
            text = "Login",
            onClick = {},
            isLoading = true,
        )
    }
}
