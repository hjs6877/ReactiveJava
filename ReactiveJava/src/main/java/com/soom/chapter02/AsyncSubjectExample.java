package com.soom.chapter02;

import io.reactivex.subjects.AsyncSubject;

/**
 * summary:
 * <p> description:
 * <p><b>History:</b>
 * - 작성자, 2017-10-18 최초 작성<br/>
 *
 * @author Kevin
 * @see
 */
public class AsyncSubjectExample {
    public static void main(String[] args){
        AsyncSubject<String> subject = AsyncSubject.create();
        subject.subscribe(data -> System.out.println("Subscriber #1 => " + data));
        subject.onNext("1");
        subject.onNext("3");
        subject.subscribe(data -> System.out.println("Subscriber #2 => " + data));
        subject.onNext("5");
        subject.onComplete();
    }
}
