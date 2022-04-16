package com.example.demonavigationdrawer.ui.contact

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ContactViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Datos de contacto\n" +
                "Javier Juárez Carrillo\n" +
                "Telefono: 55 1234 5678"
    }
    val text: LiveData<String> = _text
}