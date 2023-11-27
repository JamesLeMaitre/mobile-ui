package kt.android.doc.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable

@ExperimentalMaterial3Api
@ExperimentalMaterial3WindowSizeClassApi
@Composable
fun DocApp(windowSize: WindowSizeClass) {
    when (windowSize.widthSizeClass) {
        WindowWidthSizeClass.Compact -> {
            DocAppPortrait()
        }

        WindowWidthSizeClass.Expanded -> {
            DocAppLandscape()
        }
    }
}