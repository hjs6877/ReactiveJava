package com.soom.chapter05;

import com.soom.common.CommonUtils;
import com.soom.common.Log;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.util.concurrent.TimeUnit;

public class ComputationSchedulerExample {
    public static void main(String[] args){
        String[] orgs = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(orgs)
                 .zipWith(Observable.interval(100L, TimeUnit.MICROSECONDS), (a, b) -> a);

        // 구독 #1
        source.map(item -> "<<" + item + ">>")
                .subscribeOn(Schedulers.computation())
                .subscribe(Log::i);

        source.map(item -> "##" + item + "##")
                .subscribeOn(Schedulers.computation())
                .subscribe(Log::i);
        CommonUtils.sleep(1000);
    }
}
