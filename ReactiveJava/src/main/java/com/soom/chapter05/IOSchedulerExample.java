package com.soom.chapter05;

import com.soom.common.CommonUtils;
import com.soom.common.Log;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

import java.io.File;

public class IOSchedulerExample {
    public static void main(String[] args){
        String root = "C:\\";
        File[] files = new File(root).listFiles();

        Observable<String> source = Observable.fromArray(files)
                .filter(f -> !f.isDirectory())
                .map(f -> f.getAbsolutePath())
                .subscribeOn(Schedulers.io());

        source.subscribe(Log::i);
        CommonUtils.sleep(500);
    }
}
