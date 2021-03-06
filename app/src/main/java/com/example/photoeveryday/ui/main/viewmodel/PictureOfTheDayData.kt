package com.example.photoeveryday.ui.main.viewmodel

import com.example.photoeveryday.ui.main.repository.PODServerResponseData

sealed class PictureOfTheDayData {
    data class Success(val serverResponseData: PODServerResponseData) : PictureOfTheDayData()
    data class Error (val error: Throwable) : PictureOfTheDayData()
    data class Loading (val progress: Int?) : PictureOfTheDayData()
}
