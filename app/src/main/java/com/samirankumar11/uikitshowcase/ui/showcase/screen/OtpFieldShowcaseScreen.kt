package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.input.AppOtpField
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun OtpFieldShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    var otp by remember {
        mutableStateOf("123456")
    }

    var emptyOtp by remember {
        mutableStateOf("")
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        Text(
            text = "OTP Field",
            style = AppTypography.titleMedium,
        )

        AppOtpField(
            value = otp,
            onValueChange = { otp = it },
        )

        AppOtpField(
            value = emptyOtp,
            onValueChange = { emptyOtp = it },
            modifier = Modifier.fillMaxWidth(),
            isError = true,
        )

        AppOtpField(
            value = "123456",
            onValueChange = {},
            enabled = false,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun OtpFieldShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        OtpFieldShowcaseScreen()
    }
}