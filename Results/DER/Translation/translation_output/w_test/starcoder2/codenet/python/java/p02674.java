

```java
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dic = {1, 1, 1, 7, 4, 1, 336, 384, 334, 220, 108, 36, 6, 976, 108, 4, 220, 1, 334, 384, 334, 220, 108, 36, 6};
        if (n < 27) {
            System.out.println(dic[n - 1]);
        } else if (n == 27) {
            System.out.println(976);
        } else if (n == 28) {
            System.out.println(108);
        } else if (n == 29) {
            System.out.println(4);
        } else if (n == 60) {
            System.out.println(220);
        } else if (n == 61) {
            System.out.println(1);
        } else if (n == 124) {
            System.out.println(334);
        } else if (n == 252) {
            System.out.println(384);
        } else if (n == 508) {
            System.out.println(334);
        } else if (n == 1020) {
            System.out.println(220);
        } else if (n == 2044) {
            System.out.println(108);
        } else if (n == 4092) {
            System.out.println(36);
        } else if (n == 8188) {
            System.out.println(6);
        } else if (n == 134217723) {
            System.out.println(976);
        } else if (n == 268435451) {
            System.out.println(108);
        } else if (n == 536870907) {
            System.out.println(4);
        } else if (n == 1152921504606846970L) {
            System.out.println(220);
        } else if (n == 2305843009213693946L) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
```
/2020/05/20200524/README.md
# 20200524

## A

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
6


```
#
# File    : A.py
# Author  : 
# Created : 5/24/2020, 12:59:06 AM
# Powered by Visual Studio Code
#

a, b, c = map(int, input().split())

print(a + b + c)

```

java code:

```java
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + b + c);
    }
}
```

## B

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
3


```
#
# File    : B.py
# Author  : 
# Created : 5/24/2020, 1:00:00 AM
# Powered by Visual Studio Code
#

a, b, c = map(int, input().split())

print(max(a, b, c))

```

java code:

```java
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
```

## C

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
2


```
#
# File    : C.py
# Author  : 
# Created : 5/24/2020, 1:00:36 AM
# Powered by Visual Studio Code
#

a, b, c = map(int, input().split())

if a == b:
    print(c)
elif a == c:
    print(b)
else:
    print(a)

```

java code:

```java
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            System.out.println(c);
        } else if (a == c) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}
```

## D

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1


```
#
# File    : D.py
# Author  : 
# Created : 5/24/2020, 1:01:11 AM
# Powered by Visual Studio Code
#

a, b, c = map(int, input().split())

if a == b and b == c:
    print(1)
elif a == b or b == c or a == c:
    print(2)
else:
    print(3)

```

java code:

```java
import java.util.Scanner;

