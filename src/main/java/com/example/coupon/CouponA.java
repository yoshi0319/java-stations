package com.example.coupon;

public class CouponA {
    public float calculate(int[] cartItems) {
        float total = 0;        
        for(int i= 0; i< cartItems.length; i++) {
            total += cartItems[i];
        }
        return total;
    }
}
