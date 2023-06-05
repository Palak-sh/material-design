package com.example.materialdesign;

import androidx.recyclerview.widget.RecyclerView;

public class ProductGridItemDecoration extends RecyclerView.ItemDecoration {

    int largepadding, smallPadding;
    public ProductGridItemDecoration(int largePadding, int smallPadding) {

        this.largepadding = largePadding;
        this.smallPadding = smallPadding;

    }
}
