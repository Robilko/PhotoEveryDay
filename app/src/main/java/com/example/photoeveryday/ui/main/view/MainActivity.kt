package com.example.photoeveryday.ui.main.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.photoeveryday.R
import com.example.photoeveryday.ui.main.utils.*
import com.example.photoeveryday.ui.main.view.picture.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme()
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, PictureOfTheDayFragment.newInstance())
                .commitNow()
        }
    }

    private fun setTheme() {
        val theme = getSharedPreferences(SETTINGS_PREFERENCES, Context.MODE_PRIVATE).getString(THEME_PREFERENCES, KEY_DEFAULT_THEME)

        if (theme.equals(KEY_RED_ROSE_THEME)) {
            setTheme(R.style.RedRoseTheme)
        } else {
            setTheme(R.style.DefaultTheme)
        }
    }
}