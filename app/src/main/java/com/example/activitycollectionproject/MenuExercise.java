package com.example.activitycollectionproject;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.Random;

public class MenuExercise extends AppCompatActivity {
    Button btnChanger;
    int image = 0, size = 0;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransformingButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choice_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Drawable drawable = btnChanger.getBackground();
        Random rnd = new Random();
        if (item.getItemId() == R.id.mItemChange) {
            Toast.makeText(this, "Edit Object Item is clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemReset) {
            btnChanger.setBackgroundResource(R.drawable.circle);
            Toast.makeText(this, "Reset Object Item is clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemChangeColor) {
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            btnChanger.setTextColor(color);
        } else if (item.getItemId() == R.id.mItemChangeImage) {
            int[] images = {R.drawable.a,R.drawable.c, R.drawable.d, R.drawable.f,R.drawable.g};
            btnChanger.setBackgroundResource(images[image]);
            image++;
            if(image == images.length){
                image = 0;
            }
        } else if (item.getItemId() == R.id.mItemChangeShape) {

        } else if (item.getItemId() == R.id.mItemChangeSize) {
            int [] height = {500, 600, 700};
            int [] width = {500, 600, 700};
            btnChanger.setLayoutParams(new LinearLayout.LayoutParams(width[size], height[size]));

            Toast.makeText(this, "Size Index: " + size, Toast.LENGTH_SHORT).show();
            size++;
            if(size == height.length) {
                size = 0;
            }
        } else if (item.getItemId() == R.id.mItemChangeBold) {
            btnChanger.setTypeface(null, Typeface.BOLD);
        } else if (item.getItemId() == R.id.mItemExit) {
            finish();
        }
        return true;
    }




}
