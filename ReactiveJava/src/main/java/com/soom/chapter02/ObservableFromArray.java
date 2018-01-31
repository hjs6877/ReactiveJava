package com.soom.chapter02;

import io.reactivex.Observable;

/**
 * summary:
 * <p> description:
 * <p><b>History:</b>
 * - �ۼ���, 2017-10-17 ���� �ۼ�<br/>
 *
 * @author Kevin
 * @see
 */
public class ObservableFromArray {
    public static void main(String[] args){
        Integer[] arr = {100, 200, 300};
        Observable<Integer> source = Observable.fromArray(arr);
        source.subscribe(System.out::println);
    }
}
