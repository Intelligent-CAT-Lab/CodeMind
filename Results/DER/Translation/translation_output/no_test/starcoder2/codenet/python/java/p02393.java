
```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(s);
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first integer:");
        int a = scanner.nextInt();
        System.out.println("Please enter the second integer:");
        int b = scanner.nextInt()t.println("Please enter the third integer:");
        int c = scanner.nextInt();
        System.out.println("The maximum value is " + maxOfThreeNumbers(a, b, c));
    }

    /**
     * 给定三个整数a，b，c，请返回三个整数中的最大值。
     *
     * <p>例如，a=1,b=3,c=2，返回值就是3。
     *
     * @param a 整数a
     * @param b 整数b
     * @param c 整数c
     * @return 三个整数中的最大值
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
;
        System.out.println("Please enter the third integer:");
        in
