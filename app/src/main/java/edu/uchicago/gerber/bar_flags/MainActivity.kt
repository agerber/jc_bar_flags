package edu.uchicago.gerber.bar_flags

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uchicago.gerber.bar_flags.ui.theme.*


class MainActivity : ComponentActivity() {

    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
        setContent {
            MainWrapper(viewModel = viewModel)
                
            }
        
    }
}
@Composable
fun Flag(colors: Array<Color>){
    Column() {
        for (color in colors) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                color = color
            ) {}
        }

    }
}

@Composable
fun CountryButtons(names: Set<String>, viewModel: MainViewModel){
    Column() {
        for (name in names) {
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    onClick = {
                        viewModel.countryClick(name)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (name == viewModel.country.value) Color.Black else Purple40 ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text(text = "${name[0].uppercaseChar()}${name.substring(1)}")
                }
            }
        }

}

@Composable
fun MainWrapper(viewModel: MainViewModel) {


    Column() {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .weight(70f)

        ) {
            Flag(colors = Constants.countryMap[viewModel.country.value]!!)
        }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .weight(30f),
            color = Color.DarkGray

        ) {
            CountryButtons(names = Constants.countryMap.keys, viewModel = viewModel)
        }
    }



}





@Preview(showBackground = true)
@Composable
fun AppPreview() {

    MainWrapper(viewModel = MainViewModel())

}