package com.example.hw_railya_khaibulina_5_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hw_railya_khaibulina_5_1.databinding.ActivityMainBinding
import com.example.hw_railya_khaibulina_5_1.presenter.Presenter
import com.example.hw_railya_khaibulina_5_1.view.CounterView

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    var presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            btnIncrement.setOnClickListener {
                presenter.increment()
                presenter.changeProperties()
            }
            btnDecrement.setOnClickListener {
                presenter.decrement()
            }


        }
    }

    override fun updateCount(count: Int) {
        binding.tvCounter.text = count.toString()
    }

    override fun changeTextColor() {
        binding.tvCounter.setTextColor(Color.BLUE)
    }

    override fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}