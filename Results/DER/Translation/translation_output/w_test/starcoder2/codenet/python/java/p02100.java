

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] p = new int[6];
        int cur = 0;
        int l = s.length();
        while (cur < l) {
            char op = '+';
            while (true) {
                term(op, p, s, cur);
                if (cur == l) {
                    break;
                }
                op = s.charAt(cur);
                cur++;
            }
        }
        int d = 5;
        while (p[d] == 0) {
            d--;
        }
        int[] r = new int[2000];
        for (int x = 2000; x >= -2000; x--) {
            if (f(p, x) == 0) {
                r[x + 2000] = x;
            }
        }
        for (int i = 0; i < r.length; i++) {
            if (r[i] != 0) {
                System.out.print("(x" + r[i] + ")");
            }
        }
    }

    public static void term(char op, int[] p, String s, int cur) {
        int k = 1;
        if (s.charAt(cur) != 'x') {
            k = num(s, cur);
        }
        int d = 0;
        if (cur < s.length() && s.charAt(cur) == 'x') {
            cur++;
            d = 1;
            if (cur < s.length() && s.charAt(cur) == '^') {
                cur++;
                d = num(s, cur);
            }
        }
        p[d] = op == '+' ? k : -k;
    }

    public static int num(String s, int cur) {
        int v = 0;
        while (cur < s.length() && s.charAt(cur) >= '0' && s.charAt(cur) <= '9') {
            v = 10 * v + (s.charAt(cur) - '0');
            cur++;
        }
        return v;
    }

    public static int f(int[] p, int x) {
        int res = 0;
        for (int i = 0; i < 6; i++) {
            res += p[i] * (int) Math.pow(x, i);
        }
        return res;
    }
}
```

## 2.

Write a program to find the number of ways to express a number as a sum of consecutive numbers.

For example, 15 can be expressed as 1+2+3+4+5, 4+5+6, 7+8, 15.

The number of ways to express 15 is 4.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    res++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
```

## 3.

Write a program to find the number of ways to express a number as a sum of consecutive numbers.

For example, 15 can be expressed as 1+2+3+4+5, 4+5+6, 7+8, 15.

The number of ways to express 15 is 4.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    res++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
```

## 4.

Write a program to find the number of ways to express a number as a sum of consecutive numbers.

For example, 15 can be expressed as 1+2+3+4+5, 4+5+6, 7+8, 15.

The number of ways to express 15 is 4.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    res++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
```

## 5.

Write a program to find the number of ways to express a number as a sum of consecutive numbers.

For example, 15 can be expressed as 1+2+3+4+5, 4+5+6, 7+8, 15.

The number of ways to express 15 is 4.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    res++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] p = new int[6];
        int cur = 0;
        int l = s.length();
        while (cur < l) {
            char op = '+';
            while (true) {
                term(op, p, s
