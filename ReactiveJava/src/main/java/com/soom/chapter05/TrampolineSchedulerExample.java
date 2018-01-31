package com.soom.chapter05;

import com.soom.common.CommonUtils;
import com.soom.common.Log;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class TrampolineSchedulerExample {
    public static void main(String[] args){
        String[] orgs = {"1", "3", "5"};
        Observable<String> source = Observable.fromArray(orgs);

        source.subscribeOn(Schedulers.trampoline())
                .map(data -> "<<" + data + ">>")
                .subscribe(Log::i);

        source.subscribeOn(Schedulers.trampoline())
                .map(data -> "##" + data + "##")
                .subscribe(Log::i);

        CommonUtils.sleep(500);
    }
}
