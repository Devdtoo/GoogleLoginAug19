package com.example.googleloginone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {

    Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        logoutBtn = findViewById(R.id.logOutBtn);
    }

    public void logoutTapped(View view) {
        FirebaseAuth.getInstance().signOut();
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                startActivity(new Intent(SecondActivity.this, MainActivity.class));

                Toast.makeText(SecondActivity.this,"Signed Out Successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
