package com.example.sum2numbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText etA, etB;
    TextView tV;
    List<String> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movies = Arrays.asList(getResources().getStringArray(R.array.movies));
//        etA = findViewById(R.id.numA);
//        etB = findViewById(R.id.numB);
//        tV = findViewById(R.id.sum);
    }

    public void onClick(View v) {
//        try {
//            String strA = etA.getText().toString();
//            String strB = etB.getText().toString();
//            int a = Integer.parseInt(strA);
//            int b = Integer.parseInt(strB);
//            String strSum = Integer.toString(a + b);
//            tV.setText(strSum);
//        } catch (Exception e) {
//            e.printStackTrace();
//            tV.setText("Введите оба числа");
//        }
        try {
            Random rand = new Random();
            int randIndex = rand.nextInt(movies.size());
            String randomElement = movies.get(randIndex);
            Toast.makeText(this, randomElement + movies.size(), Toast.LENGTH_LONG).show();
            movies.remove(randIndex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
