package com.example.linxj.mdstyle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.Window;


/**
 * Created by linxj on 2015/11/16.
 */
public class SVG extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shareanim);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
       /* imageView = (ImageView)super.findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animator animator = ViewAnimationUtils.createCircularReveal(imageView, imageView.getWidth() / 2, imageView.getHeight() / 2, imageView.getWidth(), 0);
                animator.setInterpolator(new AccelerateDecelerateInterpolator());
                animator.setDuration(2000);
                animator.start();
            }
        });*/
    }
}
