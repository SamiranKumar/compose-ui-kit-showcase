package com.samirankumar11.uikitshowcase.ui.component.input

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
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
    isError: Boolean = false,
    errorMessage: String? = null,
    passwordVisible: Boolean = false,
    leadingIcon: (@Composable (() -> Unit))? = null,
    trailingIcon: (@Composable (() -> Unit))? = null,
) {
    Column(
        modifier = modifier,
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            shape = AppShapes.medium,
            isError = isError,
            visualTransformation = if (passwordVisible) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },
            label = label?.let {
                { Text(text = it) }
            },
            placeholder = placeholder?.let {
                { Text(text = it) }
            },
            leadingIcon = leadingIcon,
            trailingIcon = trailingIcon,
        )

        if (isError && errorMessage != null) {
            Text(
                text = errorMessage,
                color = MaterialTheme.colorScheme.error,
            )
        }
    }
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

@Preview(showBackground = true)
@Composable
private fun AppTextFieldErrorPreview() {
    ComposeUiKitShowcaseTheme {
        AppTextField(
            value = "",
            onValueChange = {},
            label = "Email",
            placeholder = "Enter your email",
            isError = true,
            errorMessage = "Invalid email address",
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppTextFieldPasswordPreview() {
    ComposeUiKitShowcaseTheme {
        AppTextField(
            value = "password123",
            onValueChange = {},
            label = "Password",
            placeholder = "Enter password",
            passwordVisible = false,
        )
    }
}



@Preview(showBackground = true)
@Composable
private fun AppTextFieldLeadingIconPreview() {
    ComposeUiKitShowcaseTheme {
        AppTextField(
            value = "",
            onValueChange = {},
            label = "Email",
            placeholder = "Enter email",
            leadingIcon = {
                Text("@")
            },
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AppTextFieldTrailingIconPreview() {
    ComposeUiKitShowcaseTheme {
        AppTextField(
            value = "",
            onValueChange = {},
            label = "Search",
            placeholder = "Search...",
            trailingIcon = {
                Text("X")
            },
        )
    }
}