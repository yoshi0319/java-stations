package com.example.coupon;

public class CouponC {
    public float calculate(int[] cartItems) {
        float total = 0;
        for(int i= 0; i< cartItems.length; i++) {
            total += cartItems[i];
        }
        for(int i= 0; i< cartItems.length; i++) {
            if(cartItems[i] >= 2000) {
                total -= cartItems[i] * 0.2;
            }
        }
        if(total < 5000) {
            total += 800;
        }
        return total;
    }
}
