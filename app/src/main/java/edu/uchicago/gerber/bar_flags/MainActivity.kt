package edu.uchicago.gerber.bar_flags

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
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uchicago.gerber.bar_flags.ui.theme.*


class MainActivity : ComponentActivity() {

    val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
fun CountryButtons(names: Set<String>, viewModel: MainViewModel, selected: String){
    Column() {
        for (name in names) {
                Spacer(modifier = Modifier.weight(1f))
                Button(
                    onClick = { viewModel.countryClick(name) },
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(5f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selected == name) Color.Black else Purple40 )

                ) {
                    Text(text = "${name[0].uppercaseChar()}${name.substring(1)}")
                }
            }
        Spacer(modifier = Modifier.weight(1f))
        }

}

@Composable
fun MainWrapper(viewModel: MainViewModel) {


    val countryMap: Map<String, Array<Color>> =
        linkedMapOf(
            "thailand" to arrayOf(t_red, white, t_blue, t_blue, white, t_red),
            "estonia" to arrayOf(e_blue, black, white),
            "indonesia" to arrayOf(i_red, white),
            "netherlands" to arrayOf(n_red, white, n_blue),
            "ukraine" to arrayOf(u_yellow, u_blue)
        )

  // val viewModel = MainViewModel()
//1 add this dependency to your project implementation "androidx.compose.runtime:runtime-livedata:1.4.3"
    val mutableState = viewModel.mutableLiveData.observeAsState("ukraine")




    Column() {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .weight(70f)

        ) {
            Flag(colors = countryMap[mutableState.value]!!)
        }
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .weight(30f),
            color = Color.DarkGray

        ) {
            CountryButtons(names = countryMap.keys, viewModel = viewModel, mutableState.value)
        }
    }



}





@Preview(showBackground = true)
@Composable
fun AppPreview() {

    MainWrapper(viewModel = MainViewModel())

}