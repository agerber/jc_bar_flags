package edu.uchicago.gerber.bar_flags

import androidx.compose.ui.graphics.Color
import edu.uchicago.gerber.bar_flags.ui.theme.black
import edu.uchicago.gerber.bar_flags.ui.theme.e_blue
import edu.uchicago.gerber.bar_flags.ui.theme.i_red
import edu.uchicago.gerber.bar_flags.ui.theme.n_blue
import edu.uchicago.gerber.bar_flags.ui.theme.n_red
import edu.uchicago.gerber.bar_flags.ui.theme.t_blue
import edu.uchicago.gerber.bar_flags.ui.theme.t_red
import edu.uchicago.gerber.bar_flags.ui.theme.u_blue
import edu.uchicago.gerber.bar_flags.ui.theme.u_yellow
import edu.uchicago.gerber.bar_flags.ui.theme.white

object Constants {
    val countryMap: Map<String, Array<Color>> =
        linkedMapOf(
            "thailand" to arrayOf(t_red, white, t_blue, t_blue, white, t_red),
            "estonia" to arrayOf(e_blue, black, white),
            "indonesia" to arrayOf(i_red, white),
            "netherlands" to arrayOf(n_red, white, n_blue),
            "ukraine" to arrayOf(u_yellow, u_blue)
        )
}