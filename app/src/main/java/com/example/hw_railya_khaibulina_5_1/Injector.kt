package com.example.hw_railya_khaibulina_5_1

import com.example.hw_railya_khaibulina_5_1.model.CounterModel
import com.example.hw_railya_khaibulina_5_1.presenter.Presenter

class Injector {

    companion object {
        fun getPresenter() : Presenter {
            return Presenter()
        }

        fun getModel() : CounterModel {
            return CounterModel()
        }
    }
}