package com.samirankumar11.uikitshowcase.ui.component.listitem

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

/**
 * Represents the supported content types for the leading area inside [AppListItem].
 */
sealed interface AppListItemIcon {

    data class Vector(
        val imageVector: ImageVector,
    ) : AppListItemIcon

    data class Painter(
        val painter: androidx.compose.ui.graphics.painter.Painter,
    ) : AppListItemIcon
}

/**
 * Displays a compact list row with a headline, optional supporting text,
 * leading media, and trailing content.
 *
 * This component mirrors the Material 3 list item pattern and is intended for
 * simple information rows without introducing custom layout behavior.
 *
 * @param headlineContent Primary text shown in the row.
 * @param modifier Optional layout modifier.
 * @param supportingContent Secondary text shown beneath the headline when provided.
 * @param leadingIcon Optional icon or image placed at the start of the row.
 * @param trailingContent Optional composable content rendered at the end of the row,
 * such as a label, button, or status.
 */
@Composable
fun AppListItem(
    headlineContent: String,
    modifier: Modifier = Modifier,
    supportingContent: String? = null,
    leadingIcon: AppListItemIcon? = null,
    trailingContent: @Composable (() -> Unit)? = null,
) {
    ListItem(
        headlineContent = {
            Text(text = headlineContent)
        },
        supportingContent = supportingContent?.let {
            {
                Text(text = it)
            }
        },
        leadingContent = leadingIcon?.let { icon ->
            {
                when (icon) {
                    is AppListItemIcon.Vector -> {
                        Icon(
                            imageVector = icon.imageVector,
                            contentDescription = null,
                        )
                    }

                    is AppListItemIcon.Painter -> {
                        Icon(
                            painter = icon.painter,
                            contentDescription = null,
                        )
                    }
                }
            }
        },
        trailingContent = trailingContent,
        modifier = modifier,
    )
}


@Preview(showBackground = true)
@Composable
private fun AppListItemPreview() {
    ComposeUiKitShowcaseTheme {
        Column {
            AppListItem(
                headlineContent = "Samiran Kumar",
                supportingContent = "samirankumar11@gmail.com",
                leadingIcon = AppListItemIcon.Vector(
                    imageVector = Icons.Default.Person,
                )
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


private val PreviewIcon = ImageVector.Builder(
    name = "PreviewIcon",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f,
).apply {
    path(
        fill = androidx.compose.ui.graphics.SolidColor(Color.Blue),
    ) {
        moveTo(12f, 2f)
        lineTo(2f, 12f)
        lineTo(12f, 22f)
        lineTo(22f, 12f)
        close()
    }
}.build()


private val PreviewIcon1 = ImageVector.Builder(
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



@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun AppListItemPreview2() {
    ComposeUiKitShowcaseTheme {
        Column {
            AppListItem(
                headlineContent = "Samiran Kumar",
                supportingContent = "samirankumar11@gmail.com",
                leadingIcon = AppListItemIcon.Vector(
                    imageVector = PreviewIcon,
                ),
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
