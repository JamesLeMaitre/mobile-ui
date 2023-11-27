package kt.android.doc.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import kt.android.doc.ui.theme.DocTheme
import kt.android.doc.widgets.sections.SootheBottomNavigation

@ExperimentalMaterial3Api
@Composable
fun DocAppPortrait(){
    DocTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}