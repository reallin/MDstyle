package com.example.linxj.mdstyle;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;

/**
 * Created by linxj on 2015/11/16.
 */
public class ShareAnim extends AppCompatActivity {
   // private Toolbar toolbar;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shareanim);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        imageView = (ImageView)super.findViewById(R.id.image);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animator animator = ViewAnimationUtils.createCircularReveal(imageView,imageView.getWidth()/2,imageView.getHeight()/2,imageView.getWidth(),0);
                animator.setInterpolator(new AccelerateDecelerateInterpolator());
                animator.setDuration(2000);
                animator.start();
            }
        });
       /* getWindow().setEnterTransition(new Explode());
        getWindow().setEnterTransition(new Slide());
        getWindow().setEnterTransition(new Fade());
        getWindow().setExitTransition(new Explode());*/
        //initToolBar();

    }

}
