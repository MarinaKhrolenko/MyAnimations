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
import android.widget.TextView;

/**
 * Created by Администратор on 13.02.2015.
 */
public class Fragment7 extends Fragment {
    Animation animRotate;
    ImageView ivR;
    Button btn;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        animRotate = AnimationUtils.loadAnimation(getActivity(),
                R.anim.rotate);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ivR.setVisibility(View.VISIBLE);

                ivR.startAnimation(animRotate);

            }
        });

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag_7, container, false);
        ivR=(ImageView) v.findViewById(R.id.ivR);
        btn=(Button) v.findViewById(R.id.btn);
        return v;
    }
}

