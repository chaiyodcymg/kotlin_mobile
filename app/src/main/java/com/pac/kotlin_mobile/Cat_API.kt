package com.pac.kotlin_mobile

import retrofit2.Call

import retrofit2.http.*
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface Cat_API {
    @GET("search")
    fun search(
        @Query("data") data: String
    ): Call<List<Cat>>

    @GET("mypost/{id}")
    fun getMypost(
        @Path("id") id:Int):Call<List<Cat>>

    @GET("allpost")
    fun getAllpost(): Call<List<Cat>>

    @PUT("soft_delete/{id}")
    fun softdelete(
        @Path("id") id:Int):Call<Cat>

    @PUT("deny_post/{id}")
    fun deny_post(
        @Path("id") id:Int):Call<Cat>

    @PUT("accept_post/{id}")
    fun accept_post(
        @Path("id") id:Int):Call<Cat>

    @DELETE("deletePost/{id}")
    fun deletePost(
        @Path("id") id: Int): Call<Cat>

    @FormUrlEncoded /// Update
    @PUT("updatePost/{id}")
    fun updatePost(
        @Path("id") id: Int,
        @Field("name") name: String,
        @Field("gender") gender: String,
        @Field("color") color: String,
        @Field("vaccine") vaccine: String,
        @Field("date_vaccine") date: String,
        @Field("species") species: String,
        @Field("more_info") more_info: String,
//        @Field("image") image: String,
        @Field("house_no") house_no: String,
        @Field("street") street: String,
        @Field("sub_district") sub_district: String,
        @Field("district") district: String,
        @Field("province") province: String,
        @Field("post_address") post_address: String,
        @Field("firstname") firstname: String,
        @Field("lastname") lastname: String,
        @Field("phone") phone: String,
        @Field("email") email: String,
        @Field("line_id") line_id: String,
        @Field("facebook") facebook: String,
    ): Call<Cat>


}