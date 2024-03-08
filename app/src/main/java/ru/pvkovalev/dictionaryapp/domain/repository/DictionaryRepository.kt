package ru.pvkovalev.dictionaryapp.domain.repository

import kotlinx.coroutines.flow.Flow
import ru.pvkovalev.dictionaryapp.domain.model.WordItem
import ru.pvkovalev.dictionaryapp.util.Result

interface DictionaryRepository {
    suspend fun getWordResult(word: String): Flow<Result<WordItem>>
}