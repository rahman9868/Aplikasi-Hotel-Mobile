package com.chairul.hotel.Network;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    private static final String base_url = "http://18.212.62.143/ ";
    private static Retrofit setInit(){
    Gson gson = new GsonBuilder().setLenient().create();

    OkHttpClient client = new OkHttpClient();

        return new Retrofit.Builder()
                .baseUrl(base_url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static ApiService getInstance(){
        return setInit().create(ApiService.class);
    }
}
