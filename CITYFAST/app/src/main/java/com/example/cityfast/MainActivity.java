package com.example.cityfast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView spisok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    spisok=findViewById(R.id.spisok_zakaz);
        ArrayList<zakaz> arrayList=new ArrayList<>();
        //заполнение
        //arrayList.add(new zakaz())


    }
}