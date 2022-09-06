package com.example.retrofitpractice.data.api

import com.example.retrofitpractice.data.models.Todo
import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {

    @GET("/todos")
    suspend fun getTodos() : Response<List<Todo>>
}