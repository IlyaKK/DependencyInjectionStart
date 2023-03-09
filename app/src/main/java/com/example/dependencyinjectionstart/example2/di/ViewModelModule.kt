package com.example.dependencyinjectionstart.example2.di

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(ExampleViewModel::class)
    @Binds
    fun bindExampleViewModel(impl: ExampleViewModel): ViewModel
}