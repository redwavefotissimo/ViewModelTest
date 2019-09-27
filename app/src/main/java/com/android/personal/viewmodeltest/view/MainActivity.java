package com.android.personal.viewmodeltest.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.android.personal.viewmodeltest.R;
import com.android.personal.viewmodeltest.databinding.ActivityMainBinding;
import com.android.personal.viewmodeltest.viewmodel.MyViewModel;

public class MainActivity extends AppCompatActivity {

    MyViewModel scoreViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        scoreViewModel = ViewModelProviders.of(this).get(MyViewModel.class);

        binding.scoreView.setText(String.valueOf(scoreViewModel.getScore()));

        binding.addScoreBTN.setOnClickListener(v -> {
            scoreViewModel.addScore(2);
            binding.scoreView.setText(String.valueOf(scoreViewModel.getScore()));
        });
    }
}
