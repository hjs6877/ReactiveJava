package com.soom.chapter03;

import io.reactivex.Observable;

import java.util.Scanner;

public class Gugudan3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());

        Observable<String> source = Observable.just(dan)
                .flatMap(gugu -> Observable.range(1,9),
                        (gugu, i) -> gugu + " * " + i + " = " + gugu * i);
        source.subscribe(System.out::println);
        in.close();
    }
}
