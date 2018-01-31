package com.soom.chapter05;

import com.soom.common.CommonUtils;
import com.soom.common.Log;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class SingleSchedulerExample {
    public static void main(String[] args){
        Observable<Integer> numbers = Observable.range(100, 5);
        Observable<String> chars = Observable.range(0, 5)
                .map(CommonUtils::numberToAlphabet);

        numbers.subscribeOn(Schedulers.single())
            .subscribe(Log::i);

        chars.subscribeOn(Schedulers.single())
                .subscribe(Log::i);
        CommonUtils.sleep(500);
    }
}
