package com.samirankumar11.uikitshowcase.ui.component.listitem

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun AppListItem(
    headlineContent: String,
    modifier: Modifier = Modifier,
    supportingContent: String? = null,
    leadingIcon: ImageVector? = null,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    ListItem(
        modifier = modifier,
        headlineContent = {
            Text(
                text = headlineContent,
            )
        },
        supportingContent = supportingContent?.let { text ->
            {
                Text(
                    text = text,
                )
            }
        },
        leadingContent = leadingIcon?.let { icon ->
            {
                androidx.compose.material3.Icon(
                    imageVector = icon,
                    contentDescription = null,
                )
            }
        },
        trailingContent = trailingContent,
    )
}

private val PreviewIcon = ImageVector.Builder(
    name = "PreviewIcon",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f,
).apply {
    path(
        fill = androidx.compose.ui.graphics.SolidColor(Color.Black),
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

@Preview(showBackground = true)
@Composable
private fun AppListItemPreview() {
    ComposeUiKitShowcaseTheme {
        Column {
            AppListItem(
                headlineContent = "Samiran Kumar",
                supportingContent = "samirankumar11@gmail.com",
                leadingIcon = PreviewIcon,
            )

            AppListItem(
                headlineContent = "Settings",
                supportingContent = "Manage your account settings",
                trailingContent = {
                    Text(
                        text = "Edit",
                        fontSize = 14.sp,
                    )
                },
            )
        }
    }
}