package com.samirankumar11.uikitshowcase.ui.component.input

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    label: String? = null,
    placeholder: String? = null,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        shape = AppShapes.medium,
        label = label?.let {
            { Text(text = it) }
        },
        placeholder = placeholder?.let {
            { Text(text = it) }
        },
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

@Preview(showBackground = true)
@Composable
private fun AppTextFieldLabelPreview() {
    ComposeUiKitShowcaseTheme {
        AppTextField(
            value = "",
            onValueChange = {},
            label = "Email",
            placeholder = "Enter your email",
        )
    }
}