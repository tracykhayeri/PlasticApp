package com.example.plasticapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class signInPlasticApp extends AppCompatActivity {
    private ImageView ivBinBottle;
    private Button bt_sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_plastic_app);


        bt_sign_in = (Button)findViewById(R.id.bt_sign_in);
      bt_sign_in.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              signUpActivity();
          }
      });
    }

    private void signUpActivity() {
        Intent intentSignUp =new Intent(this,signUpPlasticProject.class);
        startActivity(intentSignUp);
    }
}
