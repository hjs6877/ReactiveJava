package com.soom.chapter03;

import io.reactivex.Observable;

public class FilterExample1 {
    public static void main(String[] args){
        String[] objs = {"1 CIRCLE", "2 DIAMOND", "3 TRIANGLE", "4 DIAMOND", "5 CIRCLE", "6 HEXAGON"};
        Observable<String> source = Observable.fromArray(objs)
                .filter(obj -> obj.endsWith("CIRCLE"));
        source.subscribe(System.out::println);
    }
}
