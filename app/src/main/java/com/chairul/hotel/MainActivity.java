package com.chairul.hotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.chairul.hotel.Model.ModelHotel;
import com.chairul.hotel.Network.RetroServer;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<ModelHotel> lstHotel;
    private RecyclerView recyclerView;


    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstHotel = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerviewid);
        loadData();
    }

    private void loadData() {
        Toast.makeText(MainActivity.this, "Loading", Toast.LENGTH_SHORT).show();
        RetroServer.getInstance().getDataTable().enqueue(new Callback<List<ModelHotel>>() {
            @Override
            public void onResponse(Call<List<ModelHotel>> call, Response<List<ModelHotel>> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Success",Toast.LENGTH_SHORT).show();
                    if (response.body().size() > 0) {

                         //clearArray();
                        Toast.makeText(MainActivity.this, "Data sebanyak : " + response.body().size(), Toast.LENGTH_SHORT).show();
                        n = response.body().size();
                        for (int i = 0; i < n; i++) {
                            try {

                                ModelHotel hotel = new ModelHotel() ;
                                hotel.setIdHotel(String.valueOf(response.body().get(i).getIdHotel()));
                                hotel.setNama(String.valueOf(response.body().get(i).getNama()));
                                hotel.setAlamat(String.valueOf(response.body().get(i).getAlamat()));
                                hotel.setGambar(String.valueOf(response.body().get(i).getGambar()));
                                hotel.setKeterangan(String.valueOf(response.body().get(i).getKeterangan()));
                                hotel.setLatitude(String.valueOf(response.body().get(i).getLatitude()));
                                hotel.setLongitude(String.valueOf(response.body().get(i).getLongitude()));
                                lstHotel.add(hotel);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            setuprecyclerview(lstHotel);

                        }
                    } else {
                        Toast.makeText(MainActivity.this, "data tidak ada", Toast.LENGTH_SHORT).show();
                    }
                }

            }

            @Override
            public void onFailure(Call<List<ModelHotel>> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }

    private void setuprecyclerview(List<ModelHotel> lstHotel) {
        RecyclerViewAdapter myadapter = new RecyclerViewAdapter(this, lstHotel);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myadapter);
    }
}
