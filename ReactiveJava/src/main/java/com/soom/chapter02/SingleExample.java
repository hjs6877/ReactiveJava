package com.soom.chapter02;

import com.soom.common.Order;
import io.reactivex.Observable;
import io.reactivex.Single;

/**
 * summary:
 * <p> description:
 * <p><b>History:</b>
 * - 작성자, 2017-10-17 최초 작성<br/>
 *
 * @author Kevin
 * @see
 */
public class SingleExample {
    public static void main(String[] args){
        Observable<String> source = Observable.just("Hello Single");
        Single.fromObservable(source).subscribe(System.out::println);

        Observable.just("Hello Single")
                .single("default item")
                .subscribe(System.out::println);

        String[] colors = {"Red", "Blue", "Gold"};
        Observable.fromArray(colors)
                .first("default value")
                .subscribe(System.out::println);

        Observable.empty()
                .single("default value")
                .subscribe(System.out::println);

        Observable.just(new Order("ORD-1"), new Order("ORD-2"))
                .take(1)
                .single(new Order("default order"))
                .subscribe(System.out::println);
    }
}
