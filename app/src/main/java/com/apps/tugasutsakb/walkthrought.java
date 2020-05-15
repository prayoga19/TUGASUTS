package com.apps.tugasutsakb;


import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;


// tanggal pengerjaan : 07/05/2020
// nim                : 10117151
// nama               : prayoga maulana putra sugiharto
// kelas              : IF4

public class walkthrought extends Activity {

        private ViewPager screenPager;
        IntroViewPagerAdapter introViewPagerAdapter;
        TabLayout tabIndicator;
        Button btnNext;
        int position = 0;
        Button btnGetStarted;
        Animation btnAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrought);

        //ini view
        btnNext = findViewById(R.id.btn_next);
        btnGetStarted = findViewById(R.id.btn_get_started);
        tabIndicator = findViewById(R.id.tab_indicator);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);
        // isi list screen
        final List<screenwt> mList = new ArrayList<>();
        mList.add(new screenwt("PROFILE","DI FITUR INI ANDA DAPAT MELIHAT FOTO DIRI SAYA \n" +
                "DAN DESKRIPSI TENTANG DIRI SAYA ",R.drawable.artboard1));
        mList.add(new screenwt("DAILY ACTIVITY","DENGAN ADANYA FITUR INI ANDA \n"+
                " DAPAT MENGETAHUI AKTIVITAS KESEHARIAN SAYA ",R.drawable.kalender));
        mList.add(new screenwt("GALLERY","TERDAPAT BEBERAPA KOLEKSI FOTO SAYA \n"+
                "PADA FITUR INI",R.drawable.kamera));

         //setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);


        //setup tablayout dengan viewpager
        tabIndicator.setupWithViewPager(screenPager);

        //next button click listener
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()){

                    position++;

                        screenPager.setCurrentItem(position);
                }

                if (position == mList.size()-1) {

                loaddLastScreen();
            }

            }
        });
        //tablayout add change listener
        tabIndicator.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() ==  mList.size()-1) {

                    loaddLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        // getstarted set onclik listener
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //buka home activity
                Intent home = new Intent(getApplicationContext(), main_menu.class);
                startActivity(home);

            }
        });
    }

    private void  loaddLastScreen() {
        btnNext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);

        //setup animasi
        btnGetStarted.setAnimation(btnAnim);


    }
}
