package com.example.usingstrings;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i( "Lifecycle", "OnCreate() invoked");

        TextView TxtMsg2 = findViewById(R.id.TvMsg2);
        TxtMsg2.setText(R.string.Msg2);
    }


    public void onStart() {
        super.onStart();
        Log.i( "Lifecycle", "OnCreate() invoked");
    }

    public void onRestart() {
        super.onRestart();
        Log.i( "Lifecycle", "OnCreate() invoked");
    }

    public void onResume() {
        super.onResume();
        Log.i( "Lifecycle", "OnCreate() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i( "Lifecycle", "OnCreate() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i( "Lifecycle", "OnCreate() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i( "Lifecycle", "OnCreate() invoked");
    }
}