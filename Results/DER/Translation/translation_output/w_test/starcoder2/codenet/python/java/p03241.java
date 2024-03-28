
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        double MN = (double)M/N;
        int max_gcd = 0;
        for (int i = 1; i <= Math.sqrt(M); i++) {
            if (M % i == 0) {
                if (i <= MN && i >= max_gcd) {
                    max_gcd = i;
                }
                if (i != M/i && M/i <= MN && M/i >= max_gcd) {
                    max_gcd = M/i;
                }
            }
        }
        System.out.println(max_gcd);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

Test input:

```
apple
```

Expected output:

```
1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/README.md
# 2020-2-Java-Programming

## 1. Introduction

### 1.1. Course Overview

- Course Overview
- Course Syllabus
- Course Schedule
- Course Materials
- Course Grading
- Course Policies

### 1.2. Course Introduction

- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction
- Course Introduction

