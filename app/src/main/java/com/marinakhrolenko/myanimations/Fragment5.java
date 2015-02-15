package com.marinakhrolenko.myanimations;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Администратор on 13.02.2015.
 */
public class Fragment5 extends Fragment {

    Animation animZoomIn;
    LinearLayout llf;
    Button btn;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        animZoomIn = AnimationUtils.loadAnimation(getActivity(),
                R.anim.zoom_in);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                llf.setVisibility(View.VISIBLE);

                llf.startAnimation(animZoomIn);

            }
        });

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag_5_6, container, false);
        llf=(LinearLayout) v.findViewById(R.id.llf);
        btn=(Button) v.findViewById(R.id.btn);
        return v;
    }
}