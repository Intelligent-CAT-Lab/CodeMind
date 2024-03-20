import java.util.Scanner;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean CielWon = false;
        while (y > 1 && x * 10 + y > 21) {
            int t = Math.min(x, 2);
            x -= t;
            y -= (2 - t) * 10 + 2;
            if (y < 2 || 10 * x + y < 22) {
                CielWon = true;
                break;
            }
            y -= 2;
            t = Math.min(2, y / 10);
            y -= 10 * t;
            x -= 2 - t;
        }
        System.out.println(CielWon ? "Ciel" : "Hanako");
    }
}

/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input x and y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(fizzBuzz(x, y));
    }

    /**
     * 打印从x到y的数字，遇到3的倍数打印"Fizz"，5的倍数打印"Buzz"，既是3的倍数又是5的倍数打印"FizzBuzz"。
     *
     * <p>例如，x=1,y=15，则打印1,2,Fizz,4,Buzz,Fizz,7,8,Fizz,Buzz,11,Fizz,13,14,FizzBuzz。
     *
     * @param x 起始数字，包含在结果之中
     * @param y 结束数字，包含在结果之中
     */
    public static void fizzBuzz(int x, int y) {
        for (int i = x; i <= y; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}