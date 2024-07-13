package software.mys.fabiansuarez.busunabapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import software.mys.fabiansuarez.busunabapp.ui.theme.BusUnabAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            /*BusUnabAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainMapScreen(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }*/
            HomeScreen()
            /*BusUnabAppTheme {
                MyContraintLayout()
            }*/
        }
    }
}


@Composable
fun MyContraintLayout() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (boxYellow, boxBlue, boxRed) = createRefs()

        Box(
            modifier = Modifier
                .background(color = Color.Yellow)
                .size(100.dp)
                .constrainAs(boxYellow){
                    bottom.linkTo(parent.bottom)
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                }
        )
        Box(
            modifier = Modifier
                .background(color = Color.Blue)
                .size(100.dp)
                .constrainAs(boxBlue){
                    top.linkTo(boxYellow.bottom)
                    end.linkTo(boxYellow.start)
                }
        )
        Box(
            modifier = Modifier
                .background(color = Color.Red)
                .size(100.dp)
                .constrainAs(boxRed){
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxYellow.end)
                }
        )
    }
}