package com.apps.tugasutsakb;

// tanggal pengerjaan : 07/05/2020
// nim                : 10117151
// nama               : prayoga maulana putra sugiharto
// kelas              : IF4
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class IntroViewPagerAdapter extends PagerAdapter {

    Context mContext ;
    List<screenwt> mListScreen;

    public IntroViewPagerAdapter(Context mContext, List<screenwt> mListScreen) {
        this.mContext = mContext;
        this.mListScreen = mListScreen;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View LayoutScreenwt = inflater.inflate(R.layout.layout_screenwt,null);

        ImageView imgslide = LayoutScreenwt.findViewById(R.id.intro_img);
        TextView title = LayoutScreenwt.findViewById(R.id.intro_title);
        TextView description = LayoutScreenwt.findViewById(R.id.intro_description);

        title.setText(mListScreen.get(position).getTitle());
        description.setText(mListScreen.get(position).getDescription());
        imgslide.setImageResource(mListScreen.get(position).getScreenImg());

        container.addView(LayoutScreenwt);

        return LayoutScreenwt;
    }

    @Override
    public int getCount() {
        return mListScreen.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
