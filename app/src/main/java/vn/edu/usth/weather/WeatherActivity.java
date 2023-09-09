package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //Create a new fragment to be placed in activity
//        ForecastFragment firstFragment = new ForecastFragment();

        // Add the fragment to the 'container' FrameLayout
//        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();

        Log.i("WeatherActivity", "Created");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.i("WeatherActivity", "Started");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i("WeatherActivity", "Resumed");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i("WeatherActivity", "Paused");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("WeatherActivity", "Stopped");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("WeatherActivity", "Destroyed");
    }


}