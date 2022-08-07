package com.hfad.drawernavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.navigation.NavigationView
import com.hfad.drawernavigation.databinding.ActivityMainBinding
import com.hfad.drawernavigation.fragment.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.view.toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.view.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.nvView.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == R.id.action_send) {
            Toast.makeText(this, "Action send", Toast.LENGTH_SHORT).show()
            true
        } else {
            super.onOptionsItemSelected(item)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_profile ->{
                loadFragment(ProfileFragment(), supportFragmentManager)
                Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_profile_edit -> {
                loadFragment(ProfileEditFragment(), supportFragmentManager)
                Toast.makeText(this, "Profile Edit", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_Favourite -> {
                loadFragment(FavouriteFragment(), supportFragmentManager)
            }
            R.id.nav_setting -> {
                loadFragment(SettingFragment(), supportFragmentManager)
            }
            R.id.nav_phone -> {
                loadFragment(PhoneFragment(), supportFragmentManager)
            }
            R.id.nav_email -> {
                loadFragment(EmailFragment(), supportFragmentManager)
            }
            R.id.nav_site -> {
                loadFragment(SiteFragment(), supportFragmentManager)
            }
        }
        binding.drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun loadFragment(fragment: Fragment, fragmentManager: FragmentManager) {
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nvView, fragment)
        fragmentTransaction.commit()
    }
}