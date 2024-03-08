package ru.pvkovalev.dictionaryapp.presentation

import ru.pvkovalev.dictionaryapp.domain.model.WordItem

data class MainState(
    val isLoading: Boolean = false,
    val searchWord: String = "",
    val wordItem: WordItem? = null
)
