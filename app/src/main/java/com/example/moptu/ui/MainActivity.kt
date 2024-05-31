package com.example.moptu.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.example.moptu.R
import com.example.moptu.ui.fragments.AdviserListFragment
import com.example.moptu.ui.fragments.CommentFragment
import com.example.moptu.ui.fragments.WelcomeFragment
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    lateinit var myToolBar: MaterialToolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myToolBar = findViewById(R.id.toolbar)
        setSupportActionBar(myToolBar)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.welcome_fragment, WelcomeFragment())
                .commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       when (item.itemId) {
           R.id.home_icon -> replaceFragment(WelcomeFragment())
           R.id.places_icon -> replaceFragment(AdviserListFragment())
           R.id.comment_icon -> replaceFragment(CommentFragment())
       }

        return super.onOptionsItemSelected(item)
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.welcome_fragment, fragment)
            .commit()
    }

}