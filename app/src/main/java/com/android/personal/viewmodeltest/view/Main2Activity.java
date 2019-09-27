package com.android.personal.viewmodeltest.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.android.personal.viewmodeltest.R;
import com.android.personal.viewmodeltest.databinding.ActivityMain2Binding;
import com.android.personal.viewmodeltest.model.ScoreModel;

public class Main2Activity extends AppCompatActivity {

    ScoreModel scoreModel;
    ActivityMain2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        if(scoreModel == null) {
            scoreModel = new ScoreModel();
        }

        binding.scoreView.setText(String.valueOf(scoreModel.getScore()));

        binding.addScoreBTN.setOnClickListener(v -> {
            scoreModel.setScore(2 + scoreModel.getScore());
            binding.scoreView.setText(String.valueOf(scoreModel.getScore()));
        });
    }
}
