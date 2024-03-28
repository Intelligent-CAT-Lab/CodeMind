

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j < n; j++) {
                int x = i ^ j;
                int ct = 0;
                while (x > 0) {
                    x /= 2;
                    ct++;
                }
                System.out.print(ct + " ");
            }
            System.out.println();
        }
    }
}
```

## Question 2

Write a program to find the sum of all the numbers in a given list.

```
Input:
[1,2,3,4,5]

Output:
15
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a program to find the sum of all the numbers in a given list.

```
Input:
[1,2,3,4,5]

Output:
15
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## Question 4

Write a program to find the sum of all the numbers in a given list.

```
Input:
[1,2,3,4,5]

Output:
15
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```
/README.md
# Java-Programming

## Introduction

This repository contains the solutions to the Java Programming course offered by Coding Blocks.

## Contents

- [Java Programming](https://github.com/coding-blocks-archives/Java-Programming)
- [Java Programming - II](https://github.com/coding-blocks-archives/Java-Programming-II)
- [Java Programming - III](https://github.com/coding-blocks-archives/Java-Programming-III)
- [Java Programming - IV](https://github.com/coding-blocks-archives/Java-Programming-IV)
- [Java Programming - V](https://github.com/coding-blocks-archives/Java-Programming-V)
- [Java Programming - VI](https://github.com/coding-blocks-archives/Java-Programming-VI)
- [Java Programming - VII](https://github.com/coding-blocks-archives/Java-Programming-VII)
- [Java Programming - VIII](https://github.com/coding-blocks-archives/Java-Programming-VIII)
- [Java Programming - IX](https://github.com/coding-blocks-archives/Java-Programming-IX)
- [Java Programming - X](https://github.com/coding-blocks-archives/Java-Programming-X)
- [Java Programming - XI](https://github.com/coding-blocks-archives/Java-Programming-XI)
- [Java Programming - XII](https://github.com/coding-blocks-archives/Java-Programming-XII)
- [Java Programming - XIII](https://github.com/coding-blocks-archives/Java-Programming-XIII)
- [Java Programming - XIV](https://github.com/coding-blocks-archives/Java-Programming-XIV)
- [Java Programming - XV](https://github.com/coding-blocks-archives/Java-Programming-XV)
- [Java Programming - XVI](https://github.com/coding-blocks-archives/Java-Programming-XVI)
- [Java Programming - XVII](https://github.com/coding-blocks-archives/Java-Programming-XVII)
- [Java Programming - XVIII](https://github.com/coding-blocks-archives/Java-Programming-XVIII)
- [Java Programming - XIX](https://github.com/coding-blocks-archives/Java-Programming-XIX)
- [Java Programming - XX](https://github.com/coding-blocks-archives/Java-Programming-XX)
- [Java Programming - XXI](https://github.com/coding-blocks-archives/Java-Programming-XXI)
- [Java Programming - XXII](https://github.com/coding-blocks-archives/Java-Programming-XXII)
- [Java Programming - XXIII](https://github.com/coding-blocks-archives/Java-Programming-XXIII)
- [Java Programming - XXIV](https://github.com/coding-blocks-archives/Java-Programming-XXIV)
- [Java Programming - XXV](https://github.com/coding-blocks-archives/Java-Programming-XXV)
- [Java Programming - XXVI](https://github.com/coding-blocks-archives/Java-Programming-XXVI)
- [Java Programming - XXVII](https://github.com/coding-blocks-archives/Java-Programming-XXVII)
- [Java Programming - XXVIII](https://github.com/coding-blocks-archives/Java-Programming-XXVIII)
- [Java Programming - XXIX](https://github.com/coding-blocks-archives/Java-Programming-XXIX)
- [Java Programming - XXX](https://github.com/coding-blocks-archives/Java-Programming-XXX)
- [Java Programming - XXXI](https://github.com/coding-blocks-archives/Java-Programming-XXXI)
- [Java Programming - XXXII](https://github.com/coding-blocks-archives/Java-Programming-XXXII)
- [Java Programming - XXXIII](https://github.com/coding-blocks-archives/Java-Programming-XXXIII)
- [Java Programming - XXXIV](https://github.com/coding-blocks-archives/Java-Programming-XXXIV)
- [Java Programming - XXXV](https://github.com/coding-blocks-archives/Java-Programming-XXXV)
- [Java Programming - XXXVI](https://github.com/coding-blocks-archives/Java-Programming-XXXVI)
- [Java Programming - XXXVII](https://github.com/coding-blocks-archives/Java-Programming-XXXVII)
- [Java Programming - XXXVIII](https://github.com/coding-blocks-archives/Java-Programming-XXXVIII)
- [Java Programming - XXXIX](https://github.com/coding-blocks-archives/Java-Programming-XXXIX)
- [Java Programming - XL](https://github.com/coding-blocks-archives/Java-Programming-XL)
- [Java Programming - XLI](https://github.com/coding-blocks-archives/Java-Programming-XLI)
- [Java Programming - XLII](https://github.com/coding-blocks-archives/Java-Programming-XLII)
- [Java Programming - XLIII](https://github.com/coding-blocks-archives/Java-Programming-
