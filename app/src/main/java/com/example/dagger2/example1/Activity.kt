package com.example.dagger2.example1

class Activity {

    lateinit var computer: Computer

    init {
        Component().inject(this)
    }

}