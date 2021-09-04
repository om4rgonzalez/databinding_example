package com.example.bindinginlayoutexample.model

import androidx.databinding.ObservableField

class NumberModel{

    var numero1: ObservableField<String> = ObservableField("0")
    var numero2: ObservableField<String> = ObservableField("0")
    var result: ObservableField<String> = ObservableField("0")

    fun sum() = result.set((Integer.parseInt(numero1.get())
            + Integer.parseInt(numero2.get())).toString())

    fun sub() = result.set((Integer.parseInt(numero1.get())
            - Integer.parseInt(numero2.get())).toString())
}
