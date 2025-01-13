package com.example.myapplication.ui.theme

import org.koin.dsl.module

class HelloSayer() {
    fun sayHello() = "Hello!"
}

val koinModule = module {
    single { HelloSayer() }
}