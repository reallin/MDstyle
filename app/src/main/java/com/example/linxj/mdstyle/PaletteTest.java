package com.example.linxj.mdstyle;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Window;

/**
 * Created by linxj on 2015/11/16.
 */
public class PaletteTest extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_palette);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
       /* getWindow().setEnterTransition(new Explode());
        getWindow().setEnterTransition(new Slide());
        getWindow().setEnterTransition(new Fade());
        getWindow().setExitTransition(new Explode());*/
        initToolBar();
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.palette_bg);
        Palette.generateAsync(bitmap,new Palette.PaletteAsyncListener(){

            @Override
            public void onGenerated(Palette palette) {
                Palette.Swatch v = palette.getLightVibrantSwatch();

               /* getActionBar().setBackgroundDrawable(new ColorDrawable(v.getRgb()));
                Window window = getWindow();
                window.setStatusBarColor(v.getRgb());*/
                toolbar.setBackgroundDrawable(new ColorDrawable(v.getRgb()));
            }
        });
    }
    public void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setActionBar(toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
       // toolbar.setBackgroundColor();
        toolbar.setTitle("Materia Design");
    }
}
