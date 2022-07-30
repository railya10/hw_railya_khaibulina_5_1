package com.example.hw_railya_khaibulina_5_1.presenter

import com.example.hw_railya_khaibulina_5_1.Injector
import com.example.hw_railya_khaibulina_5_1.view.CounterView

class Presenter {

    lateinit var view: CounterView
    val model = Injector.getModel()


    fun increment() {
        model.increment()
        view.updateCount(model.count)
    }

    fun decrement() {
        model.decrement()
        view.updateCount(model.count)
    }

    fun attachView(counterView: CounterView) {
        view = counterView

    }

    fun changeProperties () {
        if (model.count == 10) {
        view.showToast("Congratulations!")
        }
        if (model.count == 15) {
            view.changeTextColor()
        }
    }

}