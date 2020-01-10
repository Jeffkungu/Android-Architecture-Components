package com.androidtutz.anushka.lifecycledemo;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {
    private int clickCount=0;
    private int sum=0;
    private MutableLiveData<Integer> countLiveData = new MutableLiveData<>();

    public MutableLiveData<Integer> getInitialCount(){

        countLiveData.setValue(clickCount);
        return countLiveData;
    }

    public void getCurrentCount(){
        clickCount+=1;
        countLiveData.setValue(clickCount);
    }



    public int add(int x, int y){
        sum = x+y;
        return sum;
    }
}
