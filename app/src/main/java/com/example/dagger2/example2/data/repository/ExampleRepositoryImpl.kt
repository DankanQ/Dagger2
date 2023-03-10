package com.example.dagger2.example2.data.repository

import com.example.dagger2.example2.domain.ExampleRepository
import com.example.dagger2.example2.data.datasource.ExampleLocalDataSource
import com.example.dagger2.example2.data.datasource.ExampleRemoteDataSource
import com.example.dagger2.example2.data.mapper.ExampleMapper

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
