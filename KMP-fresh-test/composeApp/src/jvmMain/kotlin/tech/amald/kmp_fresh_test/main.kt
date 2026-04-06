package tech.amald.kmp_fresh_test

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "kmp_fresh_test",
    ) {
        App()
    }
}