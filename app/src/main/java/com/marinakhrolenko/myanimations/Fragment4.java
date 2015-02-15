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
import android.widget.TextView;

/**
 * Created by Администратор on 13.02.2015.
 */
public class Fragment4 extends Fragment {

    Animation animBlink;
    TextView tv;
    Button btn;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        animBlink = AnimationUtils.loadAnimation(getActivity(),
                R.anim.blink);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv.setVisibility(View.VISIBLE);

                tv.startAnimation(animBlink);

            }
        });

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag_1_2_4, container, false);
        tv=(TextView) v.findViewById(R.id.tv);
        btn=(Button) v.findViewById(R.id.btn);
        return v;
    }
}
