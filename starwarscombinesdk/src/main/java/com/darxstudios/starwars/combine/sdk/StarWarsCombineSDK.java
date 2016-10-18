package com.darxstudios.starwars.combine.sdk;

import com.darxstudios.starwars.combine.sdk.api.v1.HelloWorld;
import com.darxstudios.starwars.combine.sdk.api.v1.SWCService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public  class StarWarsCombineSDK {

    public static final String BASE_URL = "http://www.swcombine.com/";
    public static final Retrofit RETROFIT = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(SimpleXmlConverterFactory.create())
            .build();
    public static final SWCService SWC_SERVICE = RETROFIT.create(SWCService.class);

    public static void helloWorld(Callback<HelloWorld> messageCallback){
        Call<HelloWorld> messageCall = SWC_SERVICE.helloWorld();

        messageCall.enqueue(messageCallback);
    }
}
