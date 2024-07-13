package software.mys.fabiansuarez.busunabapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState
import software.mys.fabiansuarez.busunabapp.ui.theme.BusUnabAppTheme
import software.mys.fabiansuarez.busunabapp.ui.theme.Typography

@Preview
@Composable
fun PreviewMap() {
    BusUnabAppTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            MainMapScreen(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            )
        }
    }
}

@Composable
fun MainMapScreen(modifier: Modifier) {
        Map()
}

@Composable
fun Map(modifier: Modifier = Modifier) {
    Column {
        val unabBucaramanga = LatLng(7.11666957033466, -73.10541723309717)
        val cameraPositionState = rememberCameraPositionState {
            position = CameraPosition.fromLatLngZoom(unabBucaramanga, 12f)
        }
        GoogleMap(
            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPositionState
        ) {
            Marker(
                state = MarkerState(position = unabBucaramanga),
                title = "Singapore",
                snippet = "Marker in Singapore"
            )
        }
    }

}