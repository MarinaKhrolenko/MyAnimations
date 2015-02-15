package com.marinakhrolenko.myanimations;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private DrawerLayout mDrawerLayout;
    private ScrollView mItems;
    private Intent intent;
    private ActionBarDrawerToggle mDrawerToggle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mItems = (ScrollView) findViewById(R.id.items);

        findViewById(R.id.tv1).setOnClickListener(this);
        findViewById(R.id.tv2).setOnClickListener(this);
        findViewById(R.id.tv3).setOnClickListener(this);
        findViewById(R.id.tv4).setOnClickListener(this);
        findViewById(R.id.tv5).setOnClickListener(this);
        findViewById(R.id.tv6).setOnClickListener(this);
        findViewById(R.id.tv7).setOnClickListener(this);
        findViewById(R.id.tv8).setOnClickListener(this);
        findViewById(R.id.tv9).setOnClickListener(this);
        findViewById(R.id.tv10).setOnClickListener(this);
        findViewById(R.id.tv11).setOnClickListener(this);
        findViewById(R.id.tv12).setOnClickListener(this);
        findViewById(R.id.tv13).setOnClickListener(this);

        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close) {
        };

        mDrawerLayout.setDrawerListener(mDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }

    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.tv1:
                Fragment1 fragment1 = new Fragment1();
                fragmentTransaction.replace(R.id.frame, fragment1);
                break;

            case R.id.tv2:
                Fragment2 fragment2 = new Fragment2();
                fragmentTransaction.replace(R.id.frame, fragment2);
                break;

            case R.id.tv3:
                Fragment3 fragment3 = new Fragment3();
                fragmentTransaction.replace(R.id.frame, fragment3);
                break;

            case R.id.tv4:
                Fragment4 fragment4 = new Fragment4();
                fragmentTransaction.replace(R.id.frame, fragment4);
                break;

            case R.id.tv5:
                Fragment5 fragment5 = new Fragment5();
                fragmentTransaction.replace(R.id.frame, fragment5);
                break;

            case R.id.tv6:
                Fragment6 fragment6 = new Fragment6();
                fragmentTransaction.replace(R.id.frame, fragment6);
                break;

            case R.id.tv7:
                Fragment7 fragment7 = new Fragment7();
                fragmentTransaction.replace(R.id.frame, fragment7);
                break;

            case R.id.tv8:
                Fragment8 fragment8 = new Fragment8();
                fragmentTransaction.replace(R.id.frame, fragment8);
                break;

            case R.id.tv9:
                Fragment9 fragment9 = new Fragment9();
                fragmentTransaction.replace(R.id.frame, fragment9);
                break;

            case R.id.tv10:
                Fragment10 fragment10 = new Fragment10();
                fragmentTransaction.replace(R.id.frame, fragment10);
                break;

            case R.id.tv11:
                Fragment11 fragment11 = new Fragment11();
                fragmentTransaction.replace(R.id.frame, fragment11);
                break;

            case R.id.tv12:
                Fragment12 fragment12 = new Fragment12();
                fragmentTransaction.replace(R.id.frame, fragment12);
                break;

            case R.id.tv13:
                Fragment13 fragment13 = new Fragment13();
                fragmentTransaction.replace(R.id.frame, fragment13);
                break;
        }

        fragmentTransaction.commit();
        mDrawerLayout.closeDrawer(mItems);
    }
}


