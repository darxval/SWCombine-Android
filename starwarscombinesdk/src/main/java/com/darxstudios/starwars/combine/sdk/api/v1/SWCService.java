package com.darxstudios.starwars.combine.sdk.api.v1;


import retrofit2.Call;
import retrofit2.http.GET;

public interface SWCService {

    @GET("ws/v1.0/api/helloworld/")
    Call<HelloWorld> helloWorld();
}
