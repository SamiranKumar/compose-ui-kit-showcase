package com.samirankumar11.uikitshowcase.ui.component.topbar

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samirankumar11.uikitshowcase.ui.theme.AppTypography
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

/**
 * A center-aligned top app bar for simple screen headers.
 *
 * The component exposes an optional navigation icon and trailing action slot while
 * preserving the project’s Material 3 top app bar styling and behavior.
 *
 * @param title Main title shown in the bar.
 * @param modifier Optional layout modifier.
 * @param navigationIcon Optional icon displayed at the start of the bar. When null,
 * the navigation slot remains empty.
 * @param onNavigationClick Callback invoked when the navigation icon is tapped. This is
 * ignored when [navigationIcon] is null.
 * @param actions Composable content rendered in the trailing action area.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: ImageVector? = null,
    onNavigationClick: (() -> Unit)? = null,
    actions: @Composable () -> Unit = {},
) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        title = {
            Text(
                text = title,
                style = AppTypography.titleLarge,
            )
        },
        navigationIcon = {
            if (navigationIcon != null) {
                IconButton(
                    onClick = { onNavigationClick?.invoke() },
                ) {
                    Icon(
                        imageVector = navigationIcon,
                        contentDescription = "Navigation",
                    )
                }
            }
        },
        actions = {
            actions()
        },
        colors = TopAppBarDefaults.topAppBarColors(),
    )
}

private val PreviewBackIcon = ImageVector.Builder(
    name = "PreviewBackIcon",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f,
).apply {
    path(
        fill = androidx.compose.ui.graphics.SolidColor(Color.Black),
    ) {
        moveTo(20f, 11f)
        horizontalLineTo(7.83f)
        lineTo(13.42f, 5.41f)
        lineTo(12f, 4f)
        lineTo(4f, 12f)
        lineTo(12f, 20f)
        lineTo(13.41f, 18.59f)
        lineTo(7.83f, 13f)
        horizontalLineTo(20f)
        close()
    }
}.build()

private val PreviewMoreIcon = ImageVector.Builder(
    name = "PreviewMoreIcon",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f,
).apply {
    path(
        fill = androidx.compose.ui.graphics.SolidColor(Color.Black),
    ) {
        moveTo(6f, 10f)
        curveTo(4.9f, 10f, 4f, 10.9f, 4f, 12f)
        curveTo(4f, 13.1f, 4.9f, 14f, 6f, 14f)
        curveTo(7.1f, 14f, 8f, 13.1f, 8f, 12f)
        curveTo(8f, 10.9f, 7.1f, 10f, 6f, 10f)
        close()
        moveTo(18f, 10f)
        curveTo(16.9f, 10f, 16f, 10.9f, 16f, 12f)
        curveTo(16f, 13.1f, 16.9f, 14f, 18f, 14f)
        curveTo(19.1f, 14f, 20f, 13.1f, 20f, 12f)
        curveTo(20f, 10.9f, 19.1f, 10f, 18f, 10f)
        close()
        moveTo(12f, 10f)
        curveTo(10.9f, 10f, 10f, 10.9f, 10f, 12f)
        curveTo(10f, 13.1f, 10.9f, 14f, 12f, 14f)
        curveTo(13.1f, 14f, 14f, 13.1f, 14f, 12f)
        curveTo(14f, 10.9f, 13.1f, 10f, 12f, 10f)
        close()
    }
}.build()

@Preview(showBackground = true)
@Composable
private fun AppTopBarPreview() {
    ComposeUiKitShowcaseTheme {
        AppTopBar(
            title = "Profile",
            navigationIcon = PreviewBackIcon,
            onNavigationClick = {},
            actions = {
                IconButton(
                    onClick = {},
                ) {
                    Icon(
                        imageVector = PreviewMoreIcon,
                        contentDescription = "More",
                    )
                }
            },
        )
    }
}