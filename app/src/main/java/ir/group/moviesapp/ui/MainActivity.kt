package ir.group.moviesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import ir.group.moviesapp.R
import ir.group.moviesapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val navHostFragment= supportFragmentManager.findFragmentById(R.id.moviesNavHostFragment) as NavHostFragment
        val navController= navHostFragment.navController
        binding.bottomNavigation.setupWithNavController(navController)

    }
}