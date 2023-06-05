package edu.uchicago.gerber.bar_flags

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun MainWrapper() {

    Flag(colors = arrayOf(t_red, white, t_blue, t_blue, white, t_red))
}





@Preview(showBackground = true)
@Composable
fun AppPreview() {

    MainWrapper()

}