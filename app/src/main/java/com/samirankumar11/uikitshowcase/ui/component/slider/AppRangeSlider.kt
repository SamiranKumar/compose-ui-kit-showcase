package com.samirankumar11.uikitshowcase.ui.component.slider

import androidx.compose.material3.RangeSlider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppRangeSlider(
    value: ClosedFloatingPointRange<Float>,
    onValueChange: (ClosedFloatingPointRange<Float>) -> Unit,
    modifier: Modifier = Modifier,
    valueRange: ClosedFloatingPointRange<Float> = 0f..100f,
    enabled: Boolean = true,
) {
    RangeSlider(
        value = value,
        onValueChange = onValueChange,
        valueRange = valueRange,
        enabled = enabled,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppRangeSliderPreview() {
    ComposeUiKitShowcaseTheme {
        AppRangeSlider(
            value = 25f..75f,
            onValueChange = {},
        )
    }
}