package org.example;

public class Coprime {
    public String CheckCoprime(int m, int n) {
        String coprime = "Hai so nguyen to cung nhau";
        String notCoprime = "Hai so khong nguyen to cung nhau";
        String notValid = "Khong hop le";

        if (m > 0 && n > 0) {
            while (m != n) {
                if (m > n) {
                    m = m - n;
                } else {
                    n = n - m;
                }
            }
            // uoc chung lon nhat cua m, n bang 1
            if (m == 1) {
                return coprime;
            } else {
                return notCoprime;
            }
        }
        return notValid;
    }
}
