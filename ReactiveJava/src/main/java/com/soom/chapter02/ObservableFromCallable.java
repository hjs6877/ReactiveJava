package com.soom.chapter02;

import io.reactivex.Observable;

import java.util.concurrent.Callable;

/**
 * summary:
 * <p> description:
 * <p><b>History:</b>
 * - �ۼ���, 2017-10-17 ���� �ۼ�<br/>
 *
 * @author Kevin
 * @see
 */
public class ObservableFromCallable {
    public static void main(String[] args){
        Callable<String> callable = () -> {
            Thread.sleep(1000);
            return "Hello Callable";
        };

        Observable<String> source = Observable.fromCallable(callable);
        source.subscribe(System.out::println);
    }
}
