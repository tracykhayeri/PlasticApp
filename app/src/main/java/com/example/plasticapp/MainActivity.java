package com.example.plasticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button nextActivity2;
    private ImageView imageView;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextActivity2 = (Button)findViewById(R.id.bt_to_other_activity_id);

        nextActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Activity2();
            }
        });
    }

    private void Activity2() {
        Intent intentActivity2 = new Intent(this,signInPlasticApp.class);
        startActivity(intentActivity2);
    }
}
