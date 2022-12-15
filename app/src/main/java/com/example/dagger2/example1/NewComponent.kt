package com.example.dagger2.example1

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {
     fun inject(activity: Activity)
}