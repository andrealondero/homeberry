package com.example.homeberry4;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.homeberry4.FRAGMENTS.FragmentAllarm;
import com.example.homeberry4.FRAGMENTS.FragmentDoor;
import com.example.homeberry4.FRAGMENTS.FragmentFan;
import com.example.homeberry4.FRAGMENTS.FragmentLight;

public class MainHome extends AppCompatActivity {

    ViewPager viewPagerFrag;
    FragmentAdapter adapterFragment;

    Fragment frgLight = new FragmentLight();
    Fragment frgDoor = new FragmentDoor();
    Fragment frgAlarm = new FragmentAllarm();
    Fragment frgFan = new FragmentFan();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_main);

        viewPagerFrag = (ViewPager) findViewById(R.id.fragment_container);
        adapterFragment = new FragmentAdapter(getSupportFragmentManager());

        adapterFragment.AddFragment(frgLight, "LIGHTS");
        adapterFragment.AddFragment(frgDoor, "DOORS");
        adapterFragment.AddFragment(frgAlarm, "ALLARM SYS");
        adapterFragment.AddFragment(frgFan, "FAN SYS");
        viewPagerFrag.setAdapter(adapterFragment);

    }

    public void ToLights(View view) {
        viewPagerFrag.setCurrentItem(0);
    }

    public void ToDoors(View view) {
        viewPagerFrag.setCurrentItem(1);
    }

    public void ToAlarms(View view) {
        viewPagerFrag.setCurrentItem(2);
    }

    public void ToFans(View view) {
        viewPagerFrag.setCurrentItem(3);
    }
}
