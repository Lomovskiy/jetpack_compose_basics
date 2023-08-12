package com.lomovskiy.jcb

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lomovskiy.jcb.ui.theme.JetpackComposeBasicsTheme

@Composable
fun Greetings(
    modifier: Modifier = Modifier,
    names: List<String> = List(1000) { "$it" }
) {
    LazyColumn(
        modifier = modifier.padding(vertical = 4.dp),
    ) {
        items(items = names) { name: String ->
            Greeting(name = name)
        }
    }
}

@Preview(
    showBackground = true,
    widthDp = 320
)
@Composable
fun GreetingsPreview() {
    JetpackComposeBasicsTheme {
        MyApp()
    }
}