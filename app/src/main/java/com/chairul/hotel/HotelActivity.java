package com.chairul.hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class HotelActivity extends AppCompatActivity {
    String latitude, longitude, namaHotel, thumb;
    Button btnGoTo;
    ImageView fHotel;
    TextView name,alamat,ket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        name = (TextView)findViewById(R.id.aa_nama);
        alamat = (TextView)findViewById(R.id.aa_alamat);
        ket = (TextView)findViewById(R.id.aa_keterangan);
        btnGoTo = (Button)findViewById(R.id.btnMap);
        fHotel = (ImageView)findViewById(R.id.aa_thumbnail);

        namaHotel = getIntent().getStringExtra("nama");
        latitude = getIntent().getStringExtra("latitude");
        longitude = getIntent().getStringExtra("longitude");
        thumb = getIntent().getStringExtra("gambar");


        name.setText(namaHotel);
        alamat.setText(getIntent().getStringExtra("alamat"));
        ket.setText(getIntent().getStringExtra("keterangan"));
        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

        Glide.with(this).load(thumb).apply(requestOptions).into(fHotel);



        Toast.makeText(getApplicationContext(),"Name : "+namaHotel,Toast.LENGTH_SHORT).show();

        btnGoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HotelActivity.this, MapsActivity.class);
                intent.putExtra("latitude", latitude);
                intent.putExtra("longitude", longitude);
                intent.putExtra("name", namaHotel);
                startActivity(intent);
                finish();
            }
        });
    }
}
