package com.samirankumar11.uikitshowcase.ui.component.input

import androidx.compose.foundation.layout.height
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier
            .height(AppSpacing.textFieldHeight),
        shape = AppShapes.medium,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppTextFieldPreview() {
    ComposeUiKitShowcaseTheme {
        AppTextField(
            value = "",
            onValueChange = {},
        )
    }
}