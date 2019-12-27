package com.example.dell.introscreen;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.List;

public class introViewPagerAdapter extends PagerAdapter {

    LottieAnimationView animationView;
    Context mContext;
    List<ScreenItem> mListScreen;

    public introViewPagerAdapter(Context mContext, List<ScreenItem> mListScreen) {
        this.mContext = mContext;
        this.mListScreen = mListScreen;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_screen,null);

//        ImageView imgslide = layoutScreen.findViewById(R.id.Intro_Image);
        animationView = layoutScreen.findViewById(R.id.Intro_Image);
        TextView title = layoutScreen.findViewById(R.id.textView);
        TextView description = layoutScreen.findViewById(R.id.textView2);

        title.setText(mListScreen.get(position).getTitle());
        description.setText(mListScreen.get(position).getDesciption());

        animationView.setAnimation(mListScreen.get(position).getScreenImg());

        container.addView(layoutScreen);

        return layoutScreen;
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
