package com.example.mvpdemo.mainActivityView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import com.example.mvpdemo.databinding.ActivityMainBinding
import com.example.mvpdemo.mainActivityPresenter.MainActivityContract
import com.example.mvpdemo.mainActivityPresenter.MainActivityPresenter

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    // View holds a reference to the presenter class
    private val presenter = MainActivityPresenter()

    // we use binding to access the views
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // set the view of a presenter
        presenter.setView(this)

        initListeners()
    }

    private fun initListeners() {

        binding.editTextName.addTextChangedListener {
            presenter.updateFullName(it.toString())
        }
        binding.editTextEmail.addTextChangedListener {
            presenter.updateEmail(it.toString())
        }
    }

    override fun showEmail(email: String) {
        binding.TvEmail.text = email
    }

    override fun showFullName(fullname: String) {
        binding.TvFullName.text = fullname
    }

}