package com.stdio.emptyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.stdio.placepicker.utilities.Constants;
import com.stdio.placepicker.utilities.PlacePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new PlacePicker.IntentBuilder()
                .setGoogleMapApiKey("AIzaSyBBPHUjkr9HB4xvIN3-T-CuYAsanBgLA7E")
                .setLatLong(18.520430, 73.856743)
                .setMapZoom(19.0f)
                .showSearchBar(false)
                .setAddressRequired(true)
                .build(this);
        startActivityForResult(intent, Constants.PLACE_PICKER_REQUEST);
    }
}
