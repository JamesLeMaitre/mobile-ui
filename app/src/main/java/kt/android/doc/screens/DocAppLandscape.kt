package kt.android.doc.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import kt.android.doc.ui.theme.DocTheme
import kt.android.doc.widgets.sections.SootheNavigationRail

@ExperimentalMaterial3Api
@Composable
fun DocAppLandscape(){
    DocTheme {
        Surface (color = MaterialTheme.colorScheme.background){
            SootheNavigationRail()
            HomeScreen()
        }
    }
}