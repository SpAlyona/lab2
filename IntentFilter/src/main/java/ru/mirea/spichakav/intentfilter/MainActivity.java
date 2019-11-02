package ru.mirea.spichakav.intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.net.URL;
import android.util.*;
import android.content.*;
import android.net.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Uri address = Uri.parse("https://www.mirea.ru/");
        Intent openLinkIntent = new Intent(Intent.ACTION_VIEW, address);
        if (openLinkIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(openLinkIntent);
        } else {
            Log.d("Intent", "Проблема с намерением!");
        }


    }
}
