package com.soom.chapter03;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

public class FlatMapExample {
    public static void main(String[] args){
        Function<String, Observable<String>> getDoubleDialmonds =
                ball -> Observable.just(ball + "d", ball + "d");

        String[] balls = {"1", "3", "5"};

        Observable<String> source = Observable.fromArray(balls)
                .flatMap(getDoubleDialmonds);

        source.subscribe(System.out::println);
    }
}
