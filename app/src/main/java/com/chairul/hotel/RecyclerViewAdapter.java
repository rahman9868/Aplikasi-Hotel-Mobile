package com.chairul.hotel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.chairul.hotel.Model.ModelHotel;

import java.util.List;

class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context mContext ;
    private List<ModelHotel> mData;
    RequestOptions option;

    public RecyclerViewAdapter(Context mContext, List<ModelHotel> mData) {
        this.mContext = mContext;
        this.mData = mData;
        option = new RequestOptions().centerCrop().placeholder(R.drawable.akun).error(R.drawable.akun);
    }


    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.hotel_row_item,parent,false);
        final MyViewHolder viewHolder = new MyViewHolder(view);
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,HotelActivity.class);
                intent.putExtra("idHotel",mData.get(viewHolder.getAdapterPosition()).getIdHotel());
                intent.putExtra("nama",mData.get(viewHolder.getAdapterPosition()).getNama());
                intent.putExtra("alamat",mData.get(viewHolder.getAdapterPosition()).getAlamat());
                intent.putExtra("gambar",mData.get(viewHolder.getAdapterPosition()).getGambar());
                intent.putExtra("keterangan",mData.get(viewHolder.getAdapterPosition()).getKeterangan());
                intent.putExtra("latitude",mData.get(viewHolder.getAdapterPosition()).getLatitude());
                intent.putExtra("longitude",mData.get(viewHolder.getAdapterPosition()).getLongitude());
                mContext.startActivity(intent);

            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.ht_nama.setText(mData.get(position).getNama());
        holder.ht_alamat.setText(mData.get(position).getAlamat());
        holder.ht_keterangan.setText(mData.get(position).getKeterangan());
        Glide.with(mContext).load(mData.get(position).getGambar()).apply(option).into(holder.img_thumbnail);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{



        TextView ht_nama ;
        TextView ht_alamat ;
        TextView ht_keterangan ;
        ImageView img_thumbnail;
        LinearLayout view_container;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view_container = itemView.findViewById(R.id.container);
            ht_nama =itemView.findViewById(R.id.nama);
            ht_alamat =itemView.findViewById(R.id.alamat);
            ht_keterangan = itemView.findViewById(R.id.keterangan);
            img_thumbnail = itemView.findViewById(R.id.thumbnail);
        }
    }
}
