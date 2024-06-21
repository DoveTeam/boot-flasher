package team.dove.bootflasher.ui.page.main

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MainPage(modifier: Modifier = Modifier) {
    val mainViewModel = viewModel<MainViewModel>()

    Column(
        modifier = modifier
    ) {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MainPagePreview() {
    MainPage()
}