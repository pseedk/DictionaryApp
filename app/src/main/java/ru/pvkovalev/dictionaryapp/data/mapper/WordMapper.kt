package ru.pvkovalev.dictionaryapp.data.mapper

import ru.pvkovalev.dictionaryapp.data.dto.DefinitionDto
import ru.pvkovalev.dictionaryapp.data.dto.MeaningDto
import ru.pvkovalev.dictionaryapp.data.dto.WordItemDto
import ru.pvkovalev.dictionaryapp.domain.model.Definition
import ru.pvkovalev.dictionaryapp.domain.model.Meaning
import ru.pvkovalev.dictionaryapp.domain.model.WordItem

fun WordItemDto.toWorldItem() =
    WordItem(
        word = word ?: "",
        meanings = meanings?.map {
            it.toMeaning()
        } ?: emptyList(),
        phonetic = phonetic ?: ""
    )

fun MeaningDto.toMeaning() =
    Meaning(
        definition = definitionDtoToDefinition(definitions?.get(0)),
        partOfSpeech = partOfSpeech ?: ""
    )

fun definitionDtoToDefinition(definitionDto: DefinitionDto?) =
    Definition(
        definition = definitionDto?.definition ?: "",
        example = definitionDto?.example ?: ""
    )