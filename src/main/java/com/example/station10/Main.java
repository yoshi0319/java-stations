package com.example.station10;

public class Main {
    public static void main(String[] args) {
        // テストする場合、以下の「//」を消してください。
        System.out.println("商品合計: 1000, 支払額: " + new Main().applyTaxAndShippingFee(1000));
        System.out.println("商品合計: 10000, 支払額: " + new Main().applyTaxAndShippingFee(10000));
        System.out.println("商品合計: 9999, 支払額: " + new Main().applyTaxAndShippingFee(9999));
    }

    // ここから
    float applyTaxAndShippingFee(int noTaxSubtotal) {
        float result = noTaxSubtotal;

        if (noTaxSubtotal >= 10000) {
            result += (noTaxSubtotal * 0.1);
        } else if (noTaxSubtotal < 10000) {
            result += 800;
            double tax = (result * 0.1);
            result += tax;
        }

        return result;
    }
    // ここまで
}
