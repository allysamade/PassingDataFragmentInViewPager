package com.geeksfarm.fragmentwithviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity implements listChatFragment.SendMessage {

    ViewPagerAdapter mAdapterViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager vp = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter vpAdapter = new ViewPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        vp.setAdapter(vpAdapter);
        TabLayout tabs = (TabLayout) findViewById(R.id.tabLayout);
        tabs.setupWithViewPager(vp);
        getSupportActionBar().setTitle("WhatsApp");
    }


    @Override
    public void sendData(String message) {
        String tag = "android:switcher:" + R.id.viewPager + ":" + 2;
        statusFragment f = (statusFragment) getSupportFragmentManager().findFragmentByTag(tag);
        f.displayReceivedData(message);
    }


}
