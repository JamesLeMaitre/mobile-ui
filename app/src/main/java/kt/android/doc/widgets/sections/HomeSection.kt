package kt.android.doc.widgets.sections

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.ui.Modifier

@Composable
fun HomeSection(
    @StringRes text: Int,
    modifier: Modifier,
    content: @Composable() -> Unit
){
        Column(modifier) {

        }
}