package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.component.toggle.AppSegmentedButton
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun SegmentedButtonShowcaseScreen(
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
            text = "Segmented Button",
            style = AppTypography.titleMedium,
        )

        AppSegmentedButton(
            items = listOf(
                "Day",
                "Week",
                "Month",
            ),
            selectedIndex = selectedIndex,
            onItemSelected = { selectedIndex = it },
            modifier = Modifier.fillMaxWidth(),
        )

        AppSegmentedButton(
            items = listOf(
                "List",
                "Grid",
            ),
            selectedIndex = 0,
            onItemSelected = {},
            modifier = Modifier.fillMaxWidth(),
            enabled = false,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun SegmentedButtonShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        SegmentedButtonShowcaseScreen()
    }
}