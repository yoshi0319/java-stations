package com.example.coupon;

public class CouponB {
    public float calculate(int[] cartItems) {
        float total = 0;
        for(int i= 0; i< cartItems.length; i++) {
            total += cartItems[i];
        }
        total = total * 0.9f;
        if(total < 5000) {
            total += 800;
        }
        
        return total;
    }
}
