package com.soom.chapter03;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());

        Function<Integer, Observable<String>> gugudan = num ->
                Observable.range(1, 9).map(row -> num + " * " + row + " = " + num * row);
        Observable<String> source = Observable.just(dan).flatMap(gugudan);
        source.subscribe(System.out::println);
    }
}
