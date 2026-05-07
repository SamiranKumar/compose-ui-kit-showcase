package com.samirankumar11.uikitshowcase.ui.component.input

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppOtpField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    length: Int = 6,
    enabled: Boolean = true,
    isError: Boolean = false,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        repeat(length) { index ->
            val digit = value.getOrNull(index)?.toString() ?: ""

            OutlinedTextField(
                value = digit,
                onValueChange = { newValue ->
                    if (newValue.length <= 1 && newValue.all { it.isDigit() }) {
                        val updatedValue = buildString {
                            append(value.take(index))
                            append(newValue)
                            append(value.drop(index + 1))
                        }.take(length)

                        onValueChange(updatedValue)
                    }
                },
                modifier = Modifier.width(52.dp),
                enabled = enabled,
                isError = isError,
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                ),
            )
        }
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun AppOtpFieldPreview() {
    ComposeUiKitShowcaseTheme {
        AppOtpField(
            value = "123456",
            onValueChange = {},
        )
    }
}