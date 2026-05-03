package com.samirankumar11.uikitshowcase.ui.component.datepicker

import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppDatePicker(
    visible: Boolean,
    onDismiss: () -> Unit,
    onConfirm: (Long?) -> Unit,
) {
    if (!visible) return

    val datePickerState = rememberDatePickerState()

    DatePickerDialog(
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(
                onClick = {
                    onConfirm(datePickerState.selectedDateMillis)
                },
            ) {
                Text("OK")
            }
        },
        dismissButton = {
            TextButton(
                onClick = onDismiss,
            ) {
                Text("Cancel")
            }
        },
    ) {
        DatePicker(
            state = datePickerState,
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun AppDatePickerPreview() {
    ComposeUiKitShowcaseTheme {
        DatePicker(
            state = rememberDatePickerState(),
        )
    }
}