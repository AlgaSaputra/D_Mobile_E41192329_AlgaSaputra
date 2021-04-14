package com.alga.fragment_bkpm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnFragmnetPertama;
    private Button btnFragmnetKedua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragmnetPertama = findViewById(R.id.btn_first_page);
        btnFragmnetKedua = findViewById(R.id.btn_second_page);

        btnFragmnetPertama.setOnClickListener(v -> loadFragment(new FirstFragment()));
        btnFragmnetKedua.setOnClickListener(v -> loadFragment(new SecondFragment()));

    }

    private void loadFragment(Fragment fragment) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        if (fragment != null) {
            transaction.replace(R.id.frame_layout, fragment);
            transaction.commit();
        }
    }
}