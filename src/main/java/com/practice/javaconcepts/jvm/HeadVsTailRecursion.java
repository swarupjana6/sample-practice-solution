package com.practice.javaconcepts.jvm;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class HeadVsTailRecursion {

    public static void main(String[] args) {
        log.info("Head Recursion : {}", headRecursive(6));
        log.info("Tail Recursion : {}", tailRecursive(6, 1));
    }

    // After recursion returns another operation is performed -> n * (value of returned function)
    public static Integer headRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        else return n * headRecursive(n - 1);
    }

    // After recursion returns NO operation is performed -> (value of returned function)
    public static Integer tailRecursive(int n, int a) {
        if (n == 0 || n == 1) return 1;
        else return tailRecursive(n - 1, n * a);
    }
}
