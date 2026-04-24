package com.samirankumar11.uikitshowcase.ui.component.button

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
        modifier = modifier,
        enabled = enabled,
    ) {
        Text(text = text)
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
