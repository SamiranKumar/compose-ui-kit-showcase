package com.samirankumar11.uikitshowcase.ui.showcase.screen
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.radio_button.AppRadioGroup
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun RadioGroupShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        Text(
            text = "Radio Group",
            style = AppTypography.titleMedium,
        )

        AppRadioGroup(
            options = listOf(
                "Male",
                "Female",
                "Other",
            ),
            selectedIndex = selectedIndex,
            onSelectionChange = {
                selectedIndex = it
            },
        )

        Text(
            text = "Disabled",
            style = AppTypography.titleMedium,
        )

        AppRadioGroup(
            options = listOf(
                "Option 1",
                "Option 2",
            ),
            selectedIndex = 0,
            onSelectionChange = {},
            enabled = false,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun RadioGroupShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        RadioGroupShowcaseScreen()
    }
}