package kz.arbuz.kinobuz.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kz.arbuz.kinobuz.R

class MainActivity: AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val topMoviesFragment = TopMoviesFragment()
        val transactionManager = supportFragmentManager.beginTransaction()
        transactionManager.add(R.id.container, topMoviesFragment, "TopFragmentMovies")
        transactionManager.addToBackStack(null)
        transactionManager.commit()
    }
}