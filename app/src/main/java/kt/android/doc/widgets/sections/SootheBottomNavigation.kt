package kt.android.doc.widgets.sections

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import kt.android.doc.R

@Composable
fun SootheBottomNavigation(
    modifier: Modifier = Modifier
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        modifier = modifier
    ) {
        NavigationBarItem(
            selected = true,
            label = {
                Text(text = stringResource(id = R.string.bottom_navigation_home))
            },
            onClick = { /*TODO*/ },
            icon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = null)
            })
        NavigationBarItem(
            selected = false,
            label = {
                Text(text = stringResource(id = R.string.bottom_navigation_profile))
            },
            onClick = { /*TODO*/ },
            icon = {
                Icon(imageVector = Icons.Default.Settings, contentDescription = null)
            })
    }
}