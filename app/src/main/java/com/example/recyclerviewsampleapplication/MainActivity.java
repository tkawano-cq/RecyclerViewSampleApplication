package com.example.recyclerviewsampleapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.main_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MainAdapter adapter = new MainAdapter(createRowData());
        recyclerView.setAdapter(adapter);
    }

    private List<RowData> createRowData() {
        List<RowData> dataSet = new ArrayList<>();
        int i = 0;
        while (i < 20) {
            RowData data = new RowData();

            data.text1 = "HogeTitle!!";
            data.text2 = "hoge";

            dataSet.add(data);
            i = i + 1;
        }
        return dataSet;
    }

    class RowData {
        String text1;
        String text2;
    }
}
