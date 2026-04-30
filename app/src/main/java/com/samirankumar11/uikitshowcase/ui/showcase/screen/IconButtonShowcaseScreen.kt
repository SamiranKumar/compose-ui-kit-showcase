package com.samirankumar11.uikitshowcase.ui.showcase.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.samirankumar11.uikitshowcase.ui.component.icon.AppIconButton
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun IconButtonShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.md),
    ) {
        AppIconButton(
            imageVector = Icons.Default.Add,
            contentDescription = "Add",
            onClick = {},
        )

        AppIconButton(
            imageVector = Icons.Default.Delete,
            contentDescription = "Delete",
            onClick = {},
        )

        Text(
            text = "Icon buttons",
            fontSize = 14.sp,
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun IconButtonShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        IconButtonShowcaseScreen()
    }
}