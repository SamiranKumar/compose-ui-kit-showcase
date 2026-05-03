package com.samirankumar11.uikitshowcase.ui.component.slider

import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppSlider(
    value: Float,
    onValueChange: (Float) -> Unit,
    modifier: Modifier = Modifier,
    valueRange: ClosedFloatingPointRange<Float> = 0f..100f,
    enabled: Boolean = true,
) {
    Slider(
        value = value,
        onValueChange = onValueChange,
        valueRange = valueRange,
        enabled = enabled,
        modifier = modifier,
    )
}

@Preview(showBackground = true)
@Composable
private fun AppSliderPreview() {
    ComposeUiKitShowcaseTheme {
        val value = remember { mutableFloatStateOf(50f) }

        AppSlider(
            value = value.floatValue,
            onValueChange = {
                value.floatValue = it
            },
        )
    }
}