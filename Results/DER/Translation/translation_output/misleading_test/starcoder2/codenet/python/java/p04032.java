
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("2");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }
        for (int i = 0; i < S.length() - 3; i++) {
            String s = S.substring(i, i + 3);
            if (s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2)) {
                System.out.println(i + 1 + " " + (i + 3));
                return;
            }
        }
        System.out.println("-1 -1");
    }
}
```

## 2. 1000000007

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

For example, 10 can be written as 10 = 1 + 2 + 3 + 4 or 10 = 5 + 6 or 10 = 7 + 8 + 9.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N.

Output:
For each test case, print the number of ways to write N as a sum of two or more consecutive positive integers.

Constraints:
1<=T<=100
1<=N<=1000000000

Example:
Input:
2
10
15

Output:
3
2

Explanation:
Testcase 1: 10 can be written as 10 = 1 + 2 + 3 + 4 or 10 = 5 + 6 or 10 = 7 + 8 + 9.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```

## 3. 1000000007

Given a number N, find the number of ways to write N as a sum of two or more consecutive positive integers.

For example, 10 can be written as 10 = 1 + 2 + 3 + 4 or 10 = 5 + 6 or 10 = 7 + 8 + 9.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer N.

Output:
For each test case, print the number of ways to write N as a sum of two or more consecutive positive integers.

Constraints:
1<=T<=100
1<=N<=1000000000

Example:
Input:
2
10
15

Output:
3
2

Explanation:
Testcase 1: 10 can be written as 10 = 1 + 2 + 3 + 4 or 10 = 5 + 6 or 10 = 7 + 8 + 9.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0 && (N / i - i + 1) % 2 == 0) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println("2");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }
        for (int i = 0; i < S.length() - 3; i++) {
            String s = S.substring(i, i + 3);
            if (s.charAt(0) == s.charAt(1) || s.charAt(1) == s.charAt(2) || s.charAt(0) == s.charAt(2)) {
                System.out.println(i + 1 + " " + (i + 3));
                return;
            }
        }
        System.out.println("-1 -1");
    }
}

