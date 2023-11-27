package kt.android.doc.widgets.sections

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier,
    content: @Composable () -> Unit
){
        Column(modifier) {
            Text(
                stringResource(title),
                style = MaterialTheme.typography.bodyMedium,
                modifier = modifier
                    .paddingFromBaseline(top = 40.dp, bottom = 16.dp)
                    .padding(horizontal = 16.dp)
            )
            content()
        }
}