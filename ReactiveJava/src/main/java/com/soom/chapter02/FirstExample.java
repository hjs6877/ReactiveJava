package com.soom.chapter02;

import io.reactivex.Observable;

/**
 * summary:
 * <p> description:
 * <p><b>History:</b>
 * - 작성자, 2017-09-08 최초 작성<br/>
 *
 * @author Kevin
 * @see
 */
public class FirstExample {
    public static void main(String args[]){
        FirstExample demo = new FirstExample();
        demo.emit();
    }

    private void emit() {
        Observable<Integer> source = Observable.just(1, 2, 3, 4, 5, 6);
        source.subscribe(System.out::println);
    }
}
