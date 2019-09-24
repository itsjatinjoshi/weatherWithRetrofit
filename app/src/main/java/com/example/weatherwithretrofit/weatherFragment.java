package com.example.weatherwithretrofit;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.json.JSONArray;


/**
 * A simple {@link Fragment} subclass.
 */
public class weatherFragment extends Fragment {
    TextView tvWelcome, currentWeatherDay, minTemp,feelsLike, maxTemp, weatherState, currentTemp, humidity, predictability,

    ivDay1Max, ivDay2Max, ivDay3Max, ivDay4Max, ivDay5Max,
            ivDay1Min, ivDay2Min, ivDay3Min, ivDay4Min, ivDay5Min,

    tvDay1, tvDay2, tvDay3, tvDay4, tvDay5,

    lastLogin;


    Button btnLogout;
    ImageView weatherImage, ivDay1, ivDay2, ivDay3, ivDay4, ivDay5;
//    FirebaseFirestore db;
//    FirebaseUser user;
//    FirebaseAuth auth;
    JSONArray wArray;


    public weatherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather, container, false);
    }

}
