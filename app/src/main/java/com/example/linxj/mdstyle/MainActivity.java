package com.example.linxj.mdstyle;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private  Toolbar toolbar;
    private Button btn1 ,btn2,btn3,btn4;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initToolBar();
        initView();

    }

    public void initView(){
        btn1 = (Button)super.findViewById(R.id.id_btn1);
        btn2 = (Button)super.findViewById(R.id.id_btn2);
        btn3 = (Button)super.findViewById(R.id.id_btn3);
        btn4 = (Button)super.findViewById(R.id.id_btn4);
        imageView = (ImageView)super.findViewById(R.id.id_share);
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);
        btn3.setOnClickListener(clickListener);
        btn4.setOnClickListener(clickListener);
    }

    OnClickListener clickListener = new OnClickListener(){

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.id_btn1:
                    Intent i = new Intent(MainActivity.this, PaletteTest.class);
                    startActivity(i, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());break;
                case R.id.id_btn2:
                    Intent i1 = new Intent(MainActivity.this, CutView.class);
                    startActivity(i1);break;
                case R.id.id_btn3:
                    Intent i2 = new Intent(MainActivity.this, CutView.class);
                    startActivity(i2,ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,imageView,"image").toBundle());break;
                case R.id.id_btn4:
                    Intent i3 = new Intent(MainActivity.this, CutView.class);
                    startActivity(i3);break;
            }
        }
    };


    public void initToolBar(){

            toolbar = (Toolbar) findViewById(R.id.toolbar);
            //setActionBar(toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            toolbar.setTitle("Materia Design");

            // toolbar.setSubtitle("CSDC");

            //toolbar.setOnMenuItemClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
