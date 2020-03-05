package org.sample.androidservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlay, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlay = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);

    }

    public void playMusic(View view) {
        startService(new Intent(this, MyService.class));
    }

    public void stopMusic(View view) {
        stopService(new Intent(this, MyService.class));
    }
}
