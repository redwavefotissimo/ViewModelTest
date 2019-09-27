package com.android.personal.viewmodeltest.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.android.personal.viewmodeltest.model.ScoreModel;


public class MyViewModel extends AndroidViewModel {

    ScoreModel scoreModel;

    public MyViewModel(@NonNull Application application) {
        super(application);
        scoreModel = new ScoreModel();
    }

    public void addScore(long value){
        scoreModel.setScore(value + scoreModel.getScore());
    }

    public long getScore(){
        return scoreModel.getScore();
    }
}
