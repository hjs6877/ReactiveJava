package com.soom.common;

/**
 * summary:
 * <p> description:
 * <p><b>History:</b>
 * - �ۼ���, 2017-10-17 ���� �ۼ�<br/>
 *
 * @author Kevin
 * @see
 */
public class Order {
    private String mid;

    public Order(String mid) {
        this.mid = mid;
    }

    public String getMid() {
        return mid;
    }

    @Override
    public String toString() {
        return "Order{" +
                "mid='" + mid + '\'' +
                '}';
    }
}


