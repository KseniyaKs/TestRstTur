package com.example.testrsttur.data.mapper

import com.example.testrsttur.data.ApiException
import retrofit2.Response
import javax.inject.Inject

interface ResponseMapper {
    fun <R> map(response: Response<R>): R
}

class ResponseMapperImpl @Inject constructor() : ResponseMapper {
    override fun <R> map(response: Response<R>): R {
        when {
            response.isSuccessful -> {
                return response.body() ?: throw ApiException("empty response.body()")
            }
            response.body().toString().isNullOrEmpty() -> {
                throw ApiException("errorBody is empty")
            }
            else -> {
                throw ApiException("errorBody is not valid")
            }
        }
    }
}