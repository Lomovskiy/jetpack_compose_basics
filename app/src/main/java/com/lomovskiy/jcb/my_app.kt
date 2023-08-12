package com.lomovskiy.jcb

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lomovskiy.jcb.ui.theme.JetpackComposeBasicsTheme

@Composable
fun MyApp(modifier: Modifier = Modifier) {
    var shouldShowOnboarding: Boolean by rememberSaveable { mutableStateOf(true) }
    Surface(
        modifier = modifier
    ) {
        if (shouldShowOnboarding) {
            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
        } else {
            Greetings()
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320
)
@Composable
fun MyAppPreview() {
    JetpackComposeBasicsTheme {
        MyApp(Modifier.fillMaxSize())
    }
}