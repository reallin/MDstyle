package com.example.linxj.mdstyle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Outline;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;

/**
 * Created by linxj on 2015/11/16.
 */
public class CutView extends AppCompatActivity {
    private Toolbar toolbar;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_palette);
        initToolBar();
        image = (ImageView)super.findViewById(R.id.id_image);
       /* ViewOutlineProvider out = new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setOval(0,0,view.getWidth(),view.getHeight());
            }
        };
       // Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.palette_bg);
        image.setOutlineProvider(out);*/

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
