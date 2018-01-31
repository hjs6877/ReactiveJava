package com.soom.chapter02;

import com.soom.common.Order;
import io.reactivex.Observable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * summary:
 * <p> description:
 * <p><b>History:</b>
 * - 작성자, 2017-10-17 최초 작성<br/>
 *
 * @author Kevin
 * @see
 */
public class ObservableFromIterable {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Jerry", "William", "Bob");

        Observable<String> source = Observable.fromIterable(names);
        source.subscribe(System.out::println);

        Set<String> cities = new HashSet<>();
        cities.add("Seoul");
        cities.add("London");
        cities.add("Paris");

        Observable<String> source2 = Observable.fromIterable(cities);
        source2.subscribe(System.out::println);

        BlockingQueue<Order> orderQueue = new ArrayBlockingQueue<>(100);

        orderQueue.add(new Order("ORD-1"));
        orderQueue.add(new Order("ORD-2"));
        orderQueue.add(new Order("ORD-3"));

        Observable<Order> source3 = Observable.fromIterable(orderQueue);
        source3.subscribe(order -> System.out.println(order.getMid()));
    }
}
