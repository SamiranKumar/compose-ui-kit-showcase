package com.samirankumar11.uikitshowcase.ui.component.icon

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppIcon(
    imageVector: ImageVector,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
) {
    Icon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        modifier = modifier,
    )
}


@Preview(showBackground = true)
@Composable
private fun AppIconPreview() {
    ComposeUiKitShowcaseTheme {
        AppIcon(
            imageVector = PreviewIcon,
            contentDescription = "Preview icon",
        )
    }
}


val PreviewIcon = ImageVector.Builder(
    name = "PreviewIcon",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f,
).apply {
    path(
        fill = SolidColor(Color.Blue),
    ) {
        moveTo(12f, 2f)
        lineTo(15f, 9f)
        lineTo(22f, 12f)
        lineTo(15f, 15f)
        lineTo(12f, 22f)
        lineTo(9f, 15f)
        lineTo(2f, 12f)
        lineTo(9f, 9f)
        close()
    }
}.build()