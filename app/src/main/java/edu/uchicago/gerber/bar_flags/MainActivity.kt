package edu.uchicago.gerber.bar_flags

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

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
    Box() {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "UChicago")
            Text(text = "MPCS")
        }

    }



}

@Preview(showBackground = true)
@Composable
fun AppPreview() {

    MainWrapper()

}