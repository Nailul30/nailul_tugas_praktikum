package com.f55119084.nailul_tugaspraktikum.api

import com.f55119084.nailul_tugaspraktikum.data.model.DetailUser
import com.f55119084.nailul_tugaspraktikum.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users" )
    @Headers( "Authorization: token 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" )

    fun getSearchUsers (
        @Query ( "q" ) query : String
    ): Call<UserResponse>

    @GET( "users/{username}" )
    @Headers( "Authorization: token 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" )

    fun getUserDetail (
        @Path ( "username" ) username : String
    ): Call<DetailUser>
}