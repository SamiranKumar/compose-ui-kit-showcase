package com.samirankumar11.uikitshowcase.ui.component.bottombar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

data class AppBottomBarItem(
    val label: String,
    val icon: ImageVector,
)

@Composable
fun AppBottomBar(
    items: List<AppBottomBarItem>,
    selectedIndex: Int,
    onItemClick: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    NavigationBar(
        modifier = modifier,
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == selectedIndex,
                onClick = {
                    onItemClick(index)
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.label,
                    )
                },
                label = {
                    Text(text = item.label)
                },
            )
        }
    }
}

private val PreviewHomeIcon = ImageVector.Builder(
    name = "PreviewHomeIcon",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f,
).apply {
    path(
        fill = androidx.compose.ui.graphics.SolidColor(Color.Black),
    ) {
        moveTo(10f, 20f)
        verticalLineTo(14f)
        horizontalLineTo(14f)
        verticalLineTo(20f)
        horizontalLineTo(19f)
        verticalLineTo(12f)
        lineTo(12f, 5f)
        lineTo(5f, 12f)
        verticalLineTo(20f)
        close()
    }
}.build()

private val PreviewPersonIcon = ImageVector.Builder(
    name = "PreviewPersonIcon",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f,
).apply {
    path(
        fill = androidx.compose.ui.graphics.SolidColor(Color.Black),
    ) {
        moveTo(12f, 12f)
        curveTo(14.21f, 12f, 16f, 10.21f, 16f, 8f)
        curveTo(16f, 5.79f, 14.21f, 4f, 12f, 4f)
        curveTo(9.79f, 4f, 8f, 5.79f, 8f, 8f)
        curveTo(8f, 10.21f, 9.79f, 12f, 12f, 12f)
        close()

        moveTo(12f, 14f)
        curveTo(7.58f, 14f, 4f, 16.24f, 4f, 19f)
        verticalLineTo(20f)
        horizontalLineTo(20f)
        verticalLineTo(19f)
        curveTo(20f, 16.24f, 16.42f, 14f, 12f, 14f)
        close()
    }
}.build()

@Preview(
    showBackground = true,
    widthDp = 360,
    heightDp = 80,
)
@Composable
private fun AppBottomBarPreview() {
    ComposeUiKitShowcaseTheme {
        AppBottomBar(
            items = listOf(
                AppBottomBarItem(
                    label = "Home",
                    icon = PreviewHomeIcon,
                ),
                AppBottomBarItem(
                    label = "Profile",
                    icon = PreviewPersonIcon,
                ),
            ),
            selectedIndex = 0,
            onItemClick = {},
        )
    }
}