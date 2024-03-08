package ru.pvkovalev.dictionaryapp.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.pvkovalev.dictionaryapp.data.repository.DictionaryRepositoryImpl
import ru.pvkovalev.dictionaryapp.domain.repository.DictionaryRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    @Singleton
    abstract fun bindDictionaryRepository(
        dictionaryRepositoryImpl: DictionaryRepositoryImpl
    ): DictionaryRepository
}