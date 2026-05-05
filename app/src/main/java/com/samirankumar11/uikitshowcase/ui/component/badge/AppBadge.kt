package com.samirankumar11.uikitshowcase.ui.component.badge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Badge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

enum class AppBadgeType {
    DEFAULT,
    SUCCESS,
    WARNING,
    ERROR,
}

@Composable
fun AppBadge(
    text: String,
    modifier: Modifier = Modifier,
    type: AppBadgeType = AppBadgeType.DEFAULT,
) {
    val containerColor = when (type) {
        AppBadgeType.DEFAULT -> MaterialTheme.colorScheme.secondaryContainer
        AppBadgeType.SUCCESS -> MaterialTheme.colorScheme.primaryContainer
        AppBadgeType.WARNING -> MaterialTheme.colorScheme.tertiaryContainer
        AppBadgeType.ERROR -> MaterialTheme.colorScheme.errorContainer
    }

    val contentColor = when (type) {
        AppBadgeType.DEFAULT -> MaterialTheme.colorScheme.onSecondaryContainer
        AppBadgeType.SUCCESS -> MaterialTheme.colorScheme.onPrimaryContainer
        AppBadgeType.WARNING -> MaterialTheme.colorScheme.onTertiaryContainer
        AppBadgeType.ERROR -> MaterialTheme.colorScheme.onErrorContainer
    }

    Badge(
        modifier = modifier,
        containerColor = containerColor,
        contentColor = contentColor,
    ) {
        Text(
            text = text,
            style = AppTypography.labelMedium,
        )
    }
}

@Preview(
    showBackground = true,
)
@Composable
private fun AppBadgePreview() {
    ComposeUiKitShowcaseTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
        ) {
            AppBadge(
                text = "Default",
                type = AppBadgeType.DEFAULT,
            )

            AppBadge(
                text = "Success",
                type = AppBadgeType.SUCCESS,
            )

            AppBadge(
                text = "Warning",
                type = AppBadgeType.WARNING,
            )

            AppBadge(
                text = "Error",
                type = AppBadgeType.ERROR,
            )
        }
    }
}