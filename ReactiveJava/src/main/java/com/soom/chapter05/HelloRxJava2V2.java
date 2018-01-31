package com.soom.chapter05;

import com.soom.common.Log;
import io.reactivex.Observable;

public class HelloRxJava2V2 {
    public static void main(String[] args){
        Observable<String> source = Observable.just("Hello", "RxJava 2!!");
        source.subscribe(Log::i);
    }
}
