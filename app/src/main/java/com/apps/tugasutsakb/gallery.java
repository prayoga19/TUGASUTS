package com.apps.tugasutsakb;

// tanggal pengerjaan : 15/05/2020
// nim                : 10117151
// nama               : prayoga maulana putra sugiharto
// kelas              : IF4
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class gallery extends Fragment {
    View v;
    private RecyclerView staggeredRv;
    private SteggeredRecyclerAdapter adapter;
    private GridLayoutManager manager;
    Context mcontext;

    private List<row> lstrow ;

    public gallery (){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_gallery, container, false);
        staggeredRv = v.findViewById(R.id.staggered_rv);
        SteggeredRecyclerAdapter steggeredRecyclerAdapter = new SteggeredRecyclerAdapter (getContext(),lstrow);
        manager = new GridLayoutManager(mcontext, 2, GridLayoutManager.VERTICAL, false);
        staggeredRv.setLayoutManager(manager);
        staggeredRv.setAdapter(steggeredRecyclerAdapter);
        return v;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

         lstrow = new ArrayList<>();
        lstrow.add(new row(R.drawable.gallery1));
        lstrow.add(new row(R.drawable.gallery2));
        lstrow.add(new row(R.drawable.gallery3));
        lstrow.add(new row(R.drawable.gallery4));
        lstrow.add(new row(R.drawable.yoga));
        lstrow.add(new row(R.drawable.gallery1));
        lstrow.add(new row(R.drawable.gallery2));
        lstrow.add(new row(R.drawable.gallery3));
        lstrow.add(new row(R.drawable.gallery4));
        lstrow.add(new row(R.drawable.yoga));

    }
}


