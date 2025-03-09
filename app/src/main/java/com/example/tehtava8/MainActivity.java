package com.example.tehtava8;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.tehtava8.databinding.ActivityMainBinding;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private EditText numberInput;
    private TextView numberOutput;

    final double GDP = 0.83;
    final double USD = 1.05;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
        numberInput = findViewById(R.id.EuroInput);
        numberOutput = findViewById(R.id.ResultText);
        }
        public void EurotoGDP(View view){
        double pound = GDP*Double.parseDouble(numberInput.getText().toString());
        numberOutput.setText(String.format("£%.2f",pound));
    }
        public void EurotoUSD(View view) {
            double dollar = USD * Double.parseDouble(numberInput.getText().toString());
            numberOutput.setText(String.format("$%.2f", dollar));
        }





}