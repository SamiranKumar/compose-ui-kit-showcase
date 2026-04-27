package com.samirankumar11.uikitshowcase.ui.component.chip

import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    FilterChip(
        selected = selected,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        label = {
            Text(
                text = label,
                style = AppTypography.labelLarge,
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
private fun AppChipPreview() {
    ComposeUiKitShowcaseTheme {
        AppChip(
            label = "Selected",
            selected = true,
            onClick = {},
        )
    }
}