package com.example.taskmanagement;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private boolean isReady;


    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }
}
