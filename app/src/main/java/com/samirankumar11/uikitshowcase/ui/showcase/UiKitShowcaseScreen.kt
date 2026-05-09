package com.samirankumar11.uikitshowcase.ui.showcase

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.samirankumar11.uikitshowcase.ui.showcase.screen.AdvancedComponentsShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.AvatarShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.BottomBarShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.ButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.CardShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.CheckboxShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.CircularProgressShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.DialogShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.DividerShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.EmptyStateShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.IconButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.IconShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.IconTextButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.LinearProgressShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.ListItemShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.OtpFieldShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.OutlinedButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.PasswordFieldShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.ProgressIndicatorShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.RadioButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.RadioGroupShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.SearchBarShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.SegmentedButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.SnackBarShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.SwitchShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.TextButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.TextFieldShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.TextShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.ToggleButtonShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.showcase.screen.TopBarShowcaseScreen
import com.samirankumar11.uikitshowcase.ui.theme.AppSpacing
import com.samirankumar11.uikitshowcase.ui.theme.ComposeUiKitShowcaseTheme

@Composable
fun UiKitShowcaseScreen(
    modifier: Modifier = Modifier,
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(AppSpacing.md),
        verticalArrangement = Arrangement.spacedBy(AppSpacing.lg),
    ) {
        ButtonShowcaseScreen()

        TextFieldShowcaseScreen()

        CardShowcaseScreen()

        DialogShowcaseScreen()

        DividerShowcaseScreen()

        IconShowcaseScreen()

        IconButtonShowcaseScreen()

        ListItemShowcaseScreen()

        TopBarShowcaseScreen()

        BottomBarShowcaseScreen()

        SwitchShowcaseScreen()

        CheckboxShowcaseScreen()

        RadioButtonShowcaseScreen()

        ProgressIndicatorShowcaseScreen()

        SearchBarShowcaseScreen()

        SnackBarShowcaseScreen()

        AvatarShowcaseScreen()

        EmptyStateShowcaseScreen()

        // components()

        AdvancedComponentsShowcaseScreen()

    }
}


@Composable
fun components() {
    OutlinedButtonShowcaseScreen()

    TextButtonShowcaseScreen()

    IconTextButtonShowcaseScreen()

    PasswordFieldShowcaseScreen()

    OtpFieldShowcaseScreen()

    CircularProgressShowcaseScreen()

    LinearProgressShowcaseScreen()

    ToggleButtonShowcaseScreen()

    SegmentedButtonShowcaseScreen()

    RadioGroupShowcaseScreen()

    TextShowcaseScreen()
}


@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun UiKitShowcaseScreenPreview() {
    ComposeUiKitShowcaseTheme {
        UiKitShowcaseScreen()
    }
}