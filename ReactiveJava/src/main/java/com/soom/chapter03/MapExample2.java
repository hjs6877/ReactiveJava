package com.soom.chapter03;

import io.reactivex.Observable;
import io.reactivex.functions.Function;


public class MapExample2 {
    public static void main(String[] args){
        Function<String, Integer> balltoIndex = ball -> {
            switch(ball){
                case "RED":
                    return 1;
                case "YELLOW":
                    return 2;
                case "GREEN":
                    return 3;
                case "BLUE":
                    return 5;
                default:
                    return -1;
            }
        };

        String[] balls = {"RED", "YELLOW", "GREEN", "BLUE"};
        Observable<Integer> source = Observable.fromArray(balls)
                .map(balltoIndex);

        source.subscribe(System.out::println);
    }
}
