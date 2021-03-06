package com.example.basicapicalls.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClientFactory {

    static Retrofit apiClientSeed = null;

    //api client
    static Retrofit GetApiClientSeed()
    {
       if(apiClientSeed==null) {


           apiClientSeed = new Retrofit.Builder()
                   .baseUrl("https://jsonplaceholder.typicode.com")
                   .addConverterFactory(GsonConverterFactory.create())
                   .build();
       }
       return apiClientSeed;
    }
    public static PostApi GetPostApi(){ return GetApiClientSeed().create(PostApi.class);}
    public static PhotoApi GetPhotoApi(){ return GetApiClientSeed().create(PhotoApi.class);}


}
