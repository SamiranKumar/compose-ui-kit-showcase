package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.samirankumar11.uikitshowcase.ui.component.listitem.AppListItem
import com.samirankumar11.uikitshowcase.ui.component.listitem.AppListItemIcon
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun ListItemShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.sm),
    ) {
        // Basic List Item
        AppListItem(
            headlineContent = "Samiran Kumar",
            supportingContent = "samirankumar11@gmail.com",
            leadingIcon = AppListItemIcon.Vector(
                imageVector = Icons.Default.Person,
            ),
        )

        HorizontalDivider()

        // List Item with trailing content
        AppListItem(
            headlineContent = "Settings",
            supportingContent = "Manage your account settings",
            leadingIcon = AppListItemIcon.Vector(
                imageVector = Icons.Default.Settings,
            ),
            trailingContent = {
                Text(
                    text = "Edit",
                    fontSize = 14.sp,
                )
            },
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun ListItemShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        ListItemShowcaseScreen()
    }
}
