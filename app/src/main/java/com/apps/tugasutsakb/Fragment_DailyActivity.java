package com.apps.tugasutsakb;
// tanggal pengerjaan : 11/05/2020
// nim                : 10117151
// nama               : prayoga maulana putra sugiharto
// kelas              : IF4
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;



public class Fragment_DailyActivity extends Fragment {
    View v;
    private RecyclerView myrecyclerview ;
    private List<DailyActivity> lstdaily ;

    public Fragment_DailyActivity() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_daily_activity, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.recyclerviewlist);
        RecyclerViewAdapter recyclerviewadapter = new RecyclerViewAdapter (getContext(),lstdaily);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerviewadapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstdaily = new ArrayList<>();
        lstdaily.add(new DailyActivity("PAGI","Bangun Tidur",R.drawable.wakeupp));
        lstdaily.add(new DailyActivity("PAGI","Sarapan",R.drawable.makan));
        lstdaily.add(new DailyActivity("SIANG","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("SIANG","Makan Siang",R.drawable.makan));
        lstdaily.add(new DailyActivity("SIANG","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("SORE","Olahraga",R.drawable.olahraga));
        lstdaily.add(new DailyActivity("MALAM","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("MALAM","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("MALAM","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("MALAM","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("MALAM","Tidur",R.drawable.tidur));
        lstdaily.add(new DailyActivity("REPEAT","REPEAT",R.drawable.repeat));
        lstdaily.add(new DailyActivity("PAGI","Bangun Tidur",R.drawable.wakeupp));
        lstdaily.add(new DailyActivity("PAGI","Sarapan",R.drawable.makan));
        lstdaily.add(new DailyActivity("SIANG","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("SIANG","Makan Siang",R.drawable.makan));
        lstdaily.add(new DailyActivity("SIANG","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("SORE","Olahraga",R.drawable.olahraga));
        lstdaily.add(new DailyActivity("MALAM","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("MALAM","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("MALAM","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("MALAM","Nugas",R.drawable.belajar));
        lstdaily.add(new DailyActivity("MALAM","Tidur",R.drawable.tidur));
        lstdaily.add(new DailyActivity("REPEAT","REPEAT",R.drawable.repeat));

    }
}
