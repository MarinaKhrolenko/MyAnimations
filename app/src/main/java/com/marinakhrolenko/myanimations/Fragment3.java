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
public class Fragment3 extends Fragment {

    Animation animFadein,animFadeout;
    TextView tv1,tv2;
    Button btn;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        animFadein = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fade_in);

        animFadeout = AnimationUtils.loadAnimation(getActivity(),
                R.anim.fade_out);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv2.setVisibility(View.VISIBLE);

                tv2.startAnimation(animFadein);

                tv1.startAnimation(animFadeout);

            }
        });

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag_3, container, false);
        tv1=(TextView) v.findViewById(R.id.tv1);
        tv2=(TextView) v.findViewById(R.id.tv2);
        btn=(Button) v.findViewById(R.id.btn);
        tv2.setVisibility(View.INVISIBLE);
        return v;
    }
}
