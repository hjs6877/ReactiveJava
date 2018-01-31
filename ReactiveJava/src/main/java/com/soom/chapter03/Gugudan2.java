package com.soom.chapter03;

import io.reactivex.Observable;

import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());

        Observable<String> source = Observable.just(dan)
                .flatMap(
                        num -> Observable.range(1, 9)
                                .map(row -> num + " * " + row + " = " + num * row)
                );
        source.subscribe(System.out::println);
    }
}
