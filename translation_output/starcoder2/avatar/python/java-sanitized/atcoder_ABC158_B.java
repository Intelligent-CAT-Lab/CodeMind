import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans = N / (A + B) * A;
        int rem = N % (A + B);
        ans += Math.min(rem, A);
        System.out.println(ans);
    }
}

/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = scanner.nextInt();
        System.out.println("请输入一个数字");
        int a = scanner.nextInt();
        System.out.println("请输入一个数字");
       n, a, b);
    }

    /**
     * 给定三个整数a,b,c，返回其中最大的那个。
     *
     * @param a 整数a
     * @param b 整数b
     * @param c 整数c
     * @return 最大的那个整数
     */
    public static int maxOfThreeNumbers(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}
 int b = scanner.nextInt();
        System.out.println(maxOfThreeNumbers(