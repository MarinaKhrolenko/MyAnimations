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

/**
 * Created by Администратор on 13.02.2015.
 */
public class Fragment12 extends Fragment {
    Animation animSequential;
    ImageView iv;
    Button btn;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        animSequential = AnimationUtils.loadAnimation(getActivity(),
                R.anim.sequential);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv.setVisibility(View.VISIBLE);

                iv.startAnimation(animSequential);

            }
        });

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag_8_9_10_11_12_13, container, false);
        iv = (ImageView) v.findViewById(R.id.iv);
        btn = (Button) v.findViewById(R.id.btn);
        return v;
    }
}
