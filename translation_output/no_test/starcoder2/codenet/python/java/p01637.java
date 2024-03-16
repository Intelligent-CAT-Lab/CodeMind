
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int rd = sc.nextInt();
        int rr = sc.nextInt();
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        int ex = cd * 100 / rd;
        if (ex * rd < 100 * cd) {
            ex++;
        }
        int ey = cr * 100 / rr;
        if (ey * rr < 100 * cr) {
            ey++;
        }
        System.out.println(m - ex - ey >= 0 ? m - ex - ey : -1);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int rd = sc.nextInt();
        int rr = sc.nextInt();
        int cd = sc.nextInt();
        int cr = sc.nextInt();
        int ex = cd * 100 / rd;
        if (ex * rd < 100 * cd) {
            ex++;
        }
        int ey = cr * 100 / rr;
        if (ey * rr < 100 * cr) {
            ey++;
        }
        System.out.println(m - ex - ey >= 0 ? m - ex - ey : -1);
    }

    // 请根据题意，编写一个返回值类型为boolean的方法，方法接受三个参数：
    // 第一个参数为任意数字；
    // 第二个参数为不大于100的正整数；
    // 第三个参数为不大于100的正整数。
    //
    // 如果第一个参数是第二个参数的倍数，或者是第三个参数的倍数，则返回true，否则返回false。
    //
    // 例如，
    //
    // f(100, 25, 3) = true
    // f(99, 3, 7) = false
    public static boolean f(int a, int b, int c) {
        return a % b == 0 || a % c == 0;
    }

    // 请根据题意，编写一个返回值类型为int的方法，方法接受三个参数：
    // 第一个参数为不大于100的正整数；
    // 第二个参数为不大于100的正整数；
    // 第三个参数为不大于100的正整数。
    //
    // 该方法返回以下结果：
    // 如果第一个参数是第二个参数的倍数，或者是第三个参数的倍数，则返回1；
    // 如果第一个参数不是第二个参数的倍数，并且也不是第三个参数的倍数，则返回0；
    // 如果第一个参数是第二个参数和第三个参数的公倍数，则返回2。
    //
    // 例如，
    //
    // g(100, 25, 3) = 1
    // g(99, 3, 7) = 0
    // g(45, 3, 5) = 2
    public static int g(int a, int b, int c) {
        if (a % b == 0 || a % c == 0) {
            return 1;
        } else if (a % b == 0 && a % c == 0) {
            return 2;
        } else {
            return 0;
        }
    }

    // 请根据题意，编写一个返回值类型为int的方法，方法接受三个参数：
    // 第一个参数为不大于100的正整数；
    // 第二个参数为不大于100的正整数；
    // 第三个参数为不大于100的正整数。
    //
    // 该方法返回以下结果：
    // 如果第一个参数是第二个参数的倍数，或者是第三个参数的倍数，则返回1；
    // 如果第一个参数不是第二个参数的倍数，并且也不是第三个参数的倍数，则返回0；
    // 如果第一个参数是第二个参数和第三个参数的公倍数，则返回2。
    //
    // 例如，
    //
    // h(100, 25, 3) = 1
    // h(99, 3, 7) = 0
    // h(45, 3, 5) = 2
    public static int h(int a, int b, int c) {
        if (a % b == 0 || a % c == 0) {
            return 1;
        } else if (a % b == 0 && a % c == 0) {
            return 2;
        } else {
            return 0;
        }
    }

    // 请根据题意，编写一个返回值类型为int的方法，方法接受三个参数：
    // 第一个参数为不大于100的正整数；
    // 第二个参数为不大于100的正整数；
    // 第三个参数为不大于100的正整数。
    //
    // 该方法返回以下结果：
    // 如果第一个参数是第二个参数的倍数，或者是第三个参数的倍数，则返回1；
    // 如果第一个参数不是第二个参数的倍数，并且也不是第三个参数的倍数，则返回0；
    // 如果第一个参数是第二个参数和第三个参数的公倍数，则返回2。
    //
    // 例如，
    //
    // i(100, 25, 3) = 1
    // i(99, 3, 7) = 0
    // i(45, 3, 5) = 2
    public static int i(int a, int b, int c) {
        if (a % b == 0 || a % c == 0) {
            return 1;
        } else if (a % b == 0 && a % c == 0) {
            return 2;
        } else {
            return 0;
        }
    }

    // 请根据题意，编写一个返回值类型为int的方法，方法接受三个参数：
    // 第一个参数为不大于100的正整数；
    // 第二个参数为不大于100的正整数；
    // 第三个参数为不大于100的正整数。
    //
    // 该方法返回以下结果：
    // 如果第一个参数是第二个参数的倍数，或者是第三个参数的倍数，则返回1；
    // 如果第一个参数不是第二个参数的倍数，并且也不是第三个参数的倍数，则返回0；
    // 如果第一个参数是第二个参数和第三个参数的公倍数，则返回2。
    //
    // 例如，
    //
    // j(100, 25, 3) = 1
    // j(99, 3, 7) = 0
    // j(45, 3, 5) = 2
    public static int j(int a, int b, int c) {
        if (a % b == 0 || a % c == 0) {
            return 1;
        } else if (a % b == 0 && a % c == 0) {
            return 2;
        } else {
            return 0;
        }
    }

    // 请根据题意，编写一个返回值类型为int的方法，方法接受三个参数：
    // 第一个参数为不大于100的正整数；
    // 第二个参数为不大于100的正整数；
    // 第三个参数为不大于100的正整数。
    //
    // 该方法返回以下结果：
    // 如果第一个参数是第二个参数的倍数，或者是第三个参数的倍数，则返回1；
    // 如果第一个参数不是第二个参数的倍数，并且也不是第三个参数的倍数，则返回0；
    // 如果第一个参数是第二个参数和第三个参数的公倍数，则返回2。
    //
