package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから
        double amount = 0;
        for(int i= 0; i<itemPrices.length; i++) {
            amount += itemPrices[i];
        }

        // System.out.println(amount);

        double A = amount;

        double B = 0;
        B = amount * 0.9;
        if(B < 5000) {
            B += 800;
        }

        double C = 0;
        for(int i= 0; i<itemPrices.length; i++) {
            if(itemPrices[i] >= 2000) {
                C += itemPrices[i] * 0.8;
            }
        }
        C = amount - C;
        if(C <5000) {
            C += 800;
        }

        if(A < B && A < C) {
            System.out.println("A");
        } else if(B < A && B < C) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        // ここまで
    }
}
