package com.androidtutz.anushka.lifecycledemo;


import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.support.annotation.Nullable;

public class MainActivityViewModel extends ViewModel {
    private int clickCount = 0;
    private int sum = 0;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public MutableLiveData<Integer> getInitialCount() {

        countLiveData.setValue(clickCount);
        return countLiveData;
    }

    public void getCurrentCount() {

        clickCount += 1;
        countLiveData.setValue(clickCount);
    }

    public int getCurrentSum() {
        return sum;
    }

    public int add(Integer x, Integer y) {
        if (x == null && y == null) {

        } else {
            sum = x + y;
        }
        return sum;
    }
}
