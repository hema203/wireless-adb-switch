package com.smoothie.wirelessDebuggingSwitch.core

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class PreferenceFragment(private val preferencesResource: Int) :
    PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(preferencesResource, rootKey)
    }

}
