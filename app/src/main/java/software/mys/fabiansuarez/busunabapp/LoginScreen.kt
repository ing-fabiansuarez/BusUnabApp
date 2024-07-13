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
import androidx.compose.ui.unit.dp
import software.mys.fabiansuarez.busunabapp.ui.theme.BusUnabAppTheme
import software.mys.fabiansuarez.busunabapp.ui.theme.Typography

@Preview
@Composable
fun PreviewLogin() {
    BusUnabAppTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            LoginScreen(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
            )
        }
    }
}

@Composable
fun LoginScreen(modifier: Modifier) {
    Column(modifier.padding(16.dp)) {
        FormLogin()
    }
}

@Composable
fun FormLogin() {
    Card {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                style = Typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                text = stringResource(R.string.login),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            )
            OutlinedTextField(
                label = {
                    Text(text = stringResource(R.string.email))
                },
                value = "",
                onValueChange = { },
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                label = {
                    Text(text = stringResource(R.string.password))
                },
                value = "",
                onValueChange = { },
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(R.string.log_in))
            }
            OutlinedButton(
                onClick = { },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.sign_in))
            }
        }
    }
}