package com.felix.myappprotfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.build_it).setOnClickListener(this);
        findViewById(R.id.capstone).setOnClickListener(this);
        findViewById(R.id.library).setOnClickListener(this);
        findViewById(R.id.scores).setOnClickListener(this);
        findViewById(R.id.spotify).setOnClickListener(this);
        findViewById(R.id.xyz).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "lunch my app", Toast.LENGTH_SHORT).show();
        switch (v.getId()) {
            case R.id.build_it:

                break;

            case R.id.capstone:
                break;

            case R.id.library:
                break;

            case R.id.scores:
                break;

            case R.id.spotify:

                break;

            case R.id.xyz:

                break;
        }
    }
}
