package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoprimeTest {
    Coprime coprime = new Coprime();

    String isCoprime = "Hai so nguyen to cung nhau";
    String isNotCoprime = "Hai so khong nguyen to cung nhau";
    String inValid = "Khong hop le";

    @Test
    void test1(){
        assertEquals(coprime.CheckCoprime(-2, 5), inValid);
    }

    @Test
    void test2(){
        assertEquals(coprime.CheckCoprime(3, -6), inValid);
    }

    @Test
    void test3(){
        assertEquals(coprime.CheckCoprime(4, 8), isNotCoprime);
    }

    @Test
    void test4(){
        assertEquals(coprime.CheckCoprime(2, 3), isCoprime);
    }
}