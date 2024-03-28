
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = sc.nextInt();
        }
        int max = S[0];
        int index = 0;
        for (int i = 1; i < 3; i++) {
            if (S[i] > max) {
                max = S[i];
                index = i;
            }
        }
        if (index == 0) {
            System.out.println("A");
        } else if (index == 1) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
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
- Course
