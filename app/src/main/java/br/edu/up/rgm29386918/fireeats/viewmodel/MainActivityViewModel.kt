package br.edu.up.rgm29386918.fireeats.viewmodel

import androidx.lifecycle.ViewModel
import br.edu.up.rgm29386918.fireeats.Filters

/**
 * ViewModel for [com.google.firebase.example.fireeats.MainActivity].
 */

class MainActivityViewModel : ViewModel() {

    var isSigningIn: Boolean = false
    var filters: Filters = Filters.default
}
