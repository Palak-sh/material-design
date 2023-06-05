package com.example.materialdesign;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {


    public ArrayList< ProductData > mProductList;
    public ViewHolder holder;
    private int position;
    Context context;


    CardAdapter(Context applicationContext, ArrayList<ProductData> mProductList) {

        this.mProductList =  mProductList;
        this.context = applicationContext;
    }

    @NonNull
    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card, parent, false);
        ViewHolder viewHolder = new ViewHolder(mView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CardAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        this.holder = holder;

        this.position = position;
        final ProductData p = mProductList.get(position);

if(p!=null) {
    holder.mImage.setImageResource(mProductList.get(position).productImage);
    holder.mTitle.setText(mProductList.get(position).productName);

}else{
    Toast.makeText(context, "p.productName", Toast.LENGTH_SHORT).show();
}
      /*  if(p!=null) {
            Toast.makeText(context, p.productName, Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "p.productName", Toast.LENGTH_SHORT).show();

        }*/
    }

    @Override
    public int getItemCount() {

        return mProductList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       ImageView mImage;
        TextView mTitle;
        TextView mprice;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mImage = (ImageView) itemView.findViewById(R.id.image);
            mTitle = (TextView) itemView.findViewById(R.id.product_title);
            mprice = (TextView) itemView.findViewById(R.id.product_price);
        }
    }
}
