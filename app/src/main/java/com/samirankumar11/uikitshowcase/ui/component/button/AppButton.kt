package com.samirankumar11.uikitshowcase.ui.component.button

import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(AppSpacing.buttonHeight),
        enabled = enabled,
        shape = AppShapes.medium,
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
        )
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
