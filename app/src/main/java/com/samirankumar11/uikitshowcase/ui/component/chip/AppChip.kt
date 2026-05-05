package com.samirankumar11.uikitshowcase.ui.component.chip

import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppShapes
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing

enum class AppChipType {
    ASSIST,
    FILTER,
    INPUT,
    SUGGESTION,
}

@Composable
fun AppChip(
    label: String,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    type: AppChipType = AppChipType.ASSIST,
) {
    val colors = when (type) {
        AppChipType.ASSIST -> FilterChipDefaults.filterChipColors(
            containerColor = MaterialTheme.colorScheme.surface,
            labelColor = MaterialTheme.colorScheme.onSurface,
            selectedContainerColor = MaterialTheme.colorScheme.primary,
            selectedLabelColor = MaterialTheme.colorScheme.onPrimary,
        )

        AppChipType.FILTER -> FilterChipDefaults.filterChipColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            labelColor = MaterialTheme.colorScheme.onSurfaceVariant,
            selectedContainerColor = MaterialTheme.colorScheme.primary,
            selectedLabelColor = MaterialTheme.colorScheme.onPrimary,
        )

        AppChipType.INPUT -> FilterChipDefaults.filterChipColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            labelColor = MaterialTheme.colorScheme.onSecondaryContainer,
            selectedContainerColor = MaterialTheme.colorScheme.secondary,
            selectedLabelColor = MaterialTheme.colorScheme.onSecondary,
        )

        AppChipType.SUGGESTION -> FilterChipDefaults.filterChipColors(
            containerColor = MaterialTheme.colorScheme.tertiaryContainer,
            labelColor = MaterialTheme.colorScheme.onTertiaryContainer,
            selectedContainerColor = MaterialTheme.colorScheme.tertiary,
            selectedLabelColor = MaterialTheme.colorScheme.onTertiary,
        )
    }

    FilterChip(
        selected = selected,
        onClick = onClick,
        enabled = enabled,
        modifier = modifier,
        shape = AppShapes.small,
        colors = colors,
        label = {
            Text(
                text = label,
                style = AppTypography.labelLarge,
            )
        },
    )
}

@Preview(
    showBackground = true,
)
@Composable
private fun AppChipPreview() {
    ComposeUiKitShowcaseTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
        ) {
            AppChip(
                label = "Assist",
                selected = false,
                onClick = {},
                type = AppChipType.ASSIST,
            )

            AppChip(
                label = "Filter",
                selected = true,
                onClick = {},
                type = AppChipType.FILTER,
            )

            AppChip(
                label = "Input",
                selected = false,
                onClick = {},
                type = AppChipType.INPUT,
            )

            AppChip(
                label = "Suggestion",
                selected = false,
                onClick = {},
                type = AppChipType.SUGGESTION,
            )
        }
    }
}