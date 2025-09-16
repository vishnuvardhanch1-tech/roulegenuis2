package com.roulegenuis;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle s) {
        super.onCreate(s);
        setContentView(R.layout.activity_main);

        RecyclerView hotCold = findViewById(R.id.rvHotCold);
        List<String> hc = Arrays.asList("7","12","23","34","5","18","29","0","14","21");
        hotCold.setLayoutManager(new GridLayoutManager(this,5,RecyclerView.HORIZONTAL,false));
        hotCold.setAdapter(new HotColdAdapter(hc));

        RecyclerView history = findViewById(R.id.rvHistory);
        List<String> h = Arrays.asList("12","7","29","18","5","34","0","23");
        history.setLayoutManager(new LinearLayoutManager(this));
        history.setAdapter(new HistoryAdapter(h));

        TextView pred = findViewById(R.id.tvPredictionValue);
        pred.setText(new PredictionEngine().getNextPrediction());

        FloatingActionButton fab = findViewById(R.id.fabSessionSummary);
        fab.setOnClickListener(v -> { /* TODO: Session summary */ });
    }
}
