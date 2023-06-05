package com.example.materialdesign;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Product#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Product extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ArrayList< ProductData > mProductList = new ArrayList<>();
    ProductData mProductData;
    CardAdapter adapter;
    Context context;

    public Product() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Product.
     */
    // TODO: Rename and change types and number of parameters
    public static Product newInstance(String param1, String param2) {
        Product fragment = new Product();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_product, container, false);
        setHasOptionsMenu(true);
        setUpToolbar(view);
        context=getActivity();
        /*RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);*/
      /*  recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
        CardAdapter adapter = new CardAdapter(getActivity().getApplicationContext(),
            mProductList);
        recyclerView.setAdapter(adapter);*/
        /*int largePadding = getResources().getDimensionPixelSize(R.dimen.grid_vertical);
        int smallPadding = getResources().getDimensionPixelSize(R.dimen.grid);
        recyclerView.addItemDecoration(new ProductGridItemDecoration(largePadding, smallPadding));
*/


       RecyclerView rv = view.findViewById(R.id.recycler_view);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new GridLayoutManager(getActivity(), 2, GridLayoutManager.VERTICAL, false));

    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);
    mProductData = new ProductData("Rose",
            R.drawable.product1, 15);
    mProductList.add(mProductData);


        adapter =  new CardAdapter(context,mProductList);
         rv.setAdapter(adapter);
        return view;
    }
    private void setUpToolbar(View view) {
        Toolbar toolbar = view.findViewById(R.id.app_bar);
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        if (activity != null) {
            activity.setSupportActionBar(toolbar);
        }
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.toolbar_menu, menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }
}