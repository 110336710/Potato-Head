package com.example.ilse.potato_head;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class PotatoMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_potato_main, menu);
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
    //http://developer.android.com/guide/topics/ui/controls/checkbox.html
    public void onCheckboxClicked(View view) {
        ImageView showarms = (ImageView)findViewById(R.id.arms);
        ImageView showears = (ImageView)findViewById(R.id.ears);
        ImageView showeyebrows = (ImageView)findViewById(R.id.eyebrows);
        ImageView showeyes = (ImageView)findViewById(R.id.eyes);
        ImageView showglasses = (ImageView)findViewById(R.id.glasses);
        ImageView showhat = (ImageView)findViewById(R.id.hat);
        ImageView showmouth = (ImageView)findViewById(R.id.mouth);
        ImageView showmustache = (ImageView)findViewById(R.id.mustache);
        ImageView shownose = (ImageView)findViewById(R.id.nose);
        ImageView showshoes = (ImageView)findViewById(R.id.shoes);
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.armsBox:
                if (checked) {
                    showarms.setVisibility(View.VISIBLE);
                } else {
                    showarms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.earsBox:
                if (checked) {
                    showears.setVisibility(View.VISIBLE);
                } else {
                    showears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.eyebrowsBox:
                if (checked) {
                    showeyebrows.setVisibility(View.VISIBLE);
                } else {
                    showeyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.eyesBox:
                if (checked) {
                    showeyes.setVisibility(View.VISIBLE);
                } else {
                    showeyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.glassesBox:
                if (checked) {
                    showglasses.setVisibility(View.VISIBLE);
                } else {
                    showglasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.hatBox:
                if (checked) {
                    showhat.setVisibility(View.VISIBLE);
                } else {
                    showhat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mouthBox:
                if (checked) {
                    showmouth.setVisibility(View.VISIBLE);
                } else {
                    showmouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.mustacheBox:
                if (checked) {
                    showmustache.setVisibility(View.VISIBLE);
                } else {
                    showmustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.noseBox:
                if (checked) {
                    shownose.setVisibility(View.VISIBLE);
                } else {
                    shownose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.shoesBox:
                if (checked) {
                    showshoes.setVisibility(View.VISIBLE);
                } else {
                    showshoes.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }

}
