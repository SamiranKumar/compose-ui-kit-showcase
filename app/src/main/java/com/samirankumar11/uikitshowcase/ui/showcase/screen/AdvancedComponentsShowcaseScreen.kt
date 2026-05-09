package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.button.AppIconTextButton
import com.samirankumar11.uikitshowcase.ui.component.button.AppOutlinedButton
import com.samirankumar11.uikitshowcase.ui.component.button.AppTextButton
import com.samirankumar11.uikitshowcase.ui.component.input.AppOtpField
import com.samirankumar11.uikitshowcase.ui.component.progress.AppCircularProgress
import com.samirankumar11.uikitshowcase.ui.component.progress.AppLinearProgress
import com.samirankumar11.uikitshowcase.ui.component.radio_button.AppRadioGroup
import com.samirankumar11.uikitshowcase.ui.component.text.AppText
import com.samirankumar11.uikitshowcase.ui.component.textfield.AppPasswordField
import com.samirankumar11.uikitshowcase.ui.component.toggle.AppSegmentedButton
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AdvancedComponentsShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    var password by remember {
        mutableStateOf("password123")
    }

    var otp by remember {
        mutableStateOf("123456")
    }

    var selectedPlanIndex by remember {
        mutableStateOf(0)
    }

    var selectedPlatformIndex by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(AppSpacing.md),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.md),
    ) {
        Text(
            text = "Advanced Components",
            style = AppTypography.headlineSmall,
        )

        AppText(
            text = "Typography and text actions",
            style = AppTypography.titleMedium,
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(AppSpacing.sm),
        ) {
            AppTextButton(
                text = "Learn more",
                onClick = {},
            )

            AppOutlinedButton(
                text = "Secondary",
                onClick = {},
            )
        }

        AppIconTextButton(
            text = "Edit",
            icon = Icons.Default.Edit,
            onClick = {},
        )

        AppPasswordField(
            value = password,
            onValueChange = {
                password = it
            },
            label = "Password",
        )

        AppOtpField(
            value = otp,
            onValueChange = {
                otp = it
            },
            length = 6,
        )

        AppSegmentedButton(
            items = listOf(
                "Day",
                "Week",
                "Month",
            ),
            selectedIndex = selectedPlanIndex,
            onItemSelected = {
                selectedPlanIndex = it
            },
        )

        AppRadioGroup(
            options = listOf(
                "Male",
                "Female",
                "Other",
            ),
            selectedIndex = selectedPlatformIndex,
            onSelectionChange = {
                selectedPlatformIndex = it
            },
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(AppSpacing.lg),
        ) {
            AppCircularProgress()

            AppLinearProgress(
                progress = 0.65f,
            )
        }

        AppText(
            text = "Status: Ready",
            style = AppTypography.bodyMedium,
        )

        AppIconTextButton(
            text = "Disabled",
            icon = Icons.Default.Edit,
            onClick = {},
            enabled = false,
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun AdvancedComponentsShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        AdvancedComponentsShowcaseScreen()
    }
}