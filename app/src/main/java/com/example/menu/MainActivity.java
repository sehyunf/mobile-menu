package com.example.menu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("배경색 바꾸기");

        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.itemR) {
            baseLayout.setBackgroundColor(Color.RED);
            return true;
        } else if (itemId == R.id.itemG) {
            baseLayout.setBackgroundColor(Color.GREEN);
            return true;
        } else if (itemId == R.id.itemB) {
            baseLayout.setBackgroundColor(Color.BLUE);
            return true;
        } else if (itemId == R.id.subRotate) {
            button1.setRotation(45);
            return true;
        } else if (itemId == R.id.subSize) {
            button1.setScaleX(2);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}