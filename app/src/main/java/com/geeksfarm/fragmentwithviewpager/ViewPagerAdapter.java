package com.geeksfarm.fragmentwithviewpager;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

//class ViewPagerAdapter is a class for  initialize Fragment that extended from FragmentPagerAdapter class
public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public final int PAGE_COUNT = 4;
    public String tabTitles[] = new String[]{"","CHATS", "STATUS", "CALLS"};


    public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fr = null;
        switch (position) {
            case 1:
                fr = new listChatFragment();
                break;
            case 2:
                fr = new statusFragment();
                break;
            case 3:
                fr = new logCallFragment();
                break;
            case 0:
                fr = new logCallFragment();
                break;
        }
        return fr;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        Drawable image = context.getResources().getDrawable(android.R.drawable.ic_menu_camera);
        image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
        // Replace blank spaces with image icon
        SpannableString sb = new SpannableString("   " + tabTitles[position]);
        ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
        if(position == 0){
            sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        }
        return sb;
    }


}

