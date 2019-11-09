package com.chairul.hotel.Network;

import com.chairul.hotel.Model.ModelHotel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("hotel.php")
    Call<List<ModelHotel>> getDataTable();
}
