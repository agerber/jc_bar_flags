package edu.uchicago.gerber.bar_flags

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import edu.uchicago.gerber.bar_flags.ui.theme.t_blue
import edu.uchicago.gerber.bar_flags.ui.theme.t_red
import edu.uchicago.gerber.bar_flags.ui.theme.white

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainWrapper()
                
            }
        
    }
}

@Composable
fun MainWrapper() {

    //Box - z axis
    // Row - x axis
    // Column - y axis
    Row() {
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .weight(10f),
            color = t_red
        ) {}
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .weight(10f),
            color = white
        ) {}
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .weight(20f),
            color = t_blue
        ) {}
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .weight(10f),
            color = white
        ) {}
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .weight(10f),
            color = t_red
        ) {}

    }



}

@Preview(showBackground = true)
@Composable
fun AppPreview() {

    MainWrapper()

}