package kt.android.doc.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kt.android.doc.R
import kt.android.doc.ui.theme.DocTheme
import kt.android.doc.widgets.elements.SearchBar
import kt.android.doc.widgets.parents.AlignYourBodyRow
import kt.android.doc.widgets.parents.FavoriteCollectionsGrid
import kt.android.doc.widgets.sections.HomeSection

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Column(modifier.verticalScroll(rememberScrollState())) {
        Spacer(modifier = Modifier.height(16.dp))
        SearchBar(modifier = Modifier.padding(horizontal = 16.dp))
        HomeSection(title = R.string.align_your_body, modifier = Modifier) {
            AlignYourBodyRow()
        }
        HomeSection(title = R.string.favorite_collections, modifier = Modifier) {
            FavoriteCollectionsGrid()
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DocTheme {
        HomeScreen()
    }
}