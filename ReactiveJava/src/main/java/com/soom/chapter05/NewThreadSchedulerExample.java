package com.soom.chapter05;

import com.soom.common.CommonUtils;
import com.soom.common.Log;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class NewThreadSchedulerExample {
    public static void main(String[] args){
        String[] orgs = {"1", "3", "5"};

        Observable.fromArray(orgs)
                .doOnNext(data -> Log.v("Original data: " + data))
                .map(data -> "<<" + data + ">>")
                .subscribeOn(Schedulers.newThread())
                .subscribe(Log::i);
        CommonUtils.sleep(500);

        Observable.fromArray(orgs)
                .doOnNext(data -> Log.v("Original data: " + data))
                .map(data -> "##" + data + "##")
                .subscribeOn(Schedulers.newThread())
                .subscribe(Log::i);
        CommonUtils.sleep(500);
    }
}
