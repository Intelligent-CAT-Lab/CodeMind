

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
        if (f(ex, rd, cd)) {
            ex += 1;
        }
        int ey = cr * 100 / rr;
        if (f(ey, rr, cr)) {
            ey += 1;
        }
        System.out.println(m - ex - ey >= 0 ? m - ex - ey : -1);
    }

    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }
}
```

## 2. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## 3. 
Write a program to find the sum of the first 1000 prime numbers.

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < n) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```
/README.md
# 2020-2021-Java-Programming-Course

## 1. Introduction

This is a repository for the Java Programming Course in 2020-2021.

## 2. Course Information

- Course Name: Java Programming
- Course Code: CSE2001
- Course Credit: 3
- Course Instructor: 
- Course Teaching Assistant: 
- Course Time: 10:00 - 11:30
- Course Location: Room 301, 3rd Floor, CSE Building

## 3. Course Content

The course content will be updated as the course progresses.

## 4. Course Materials

The course materials will be updated as the course progresses.

## 5. Course Schedule

The course schedule will be updated as the course progresses.

## 6. Course Evaluation

The course evaluation will be updated as the course progresses.

## 7. Course Resources

The course resources will be updated as the course progresses.

## 8. Course Policies

The course policies will be updated as the course progresses.

## 9. Course Contact

For any questions or concerns regarding the course, please contact the course instructor or teaching assistant.

## 10. Course Acknowledgements

The course would like to thank all the students, teachers, and staff who have contributed to the success of the course.

## 11. Course Disclaimer

The course materials and information provided on this repository are for educational purposes only and should not be used for any commercial or personal gain.

## 12. Course License

The course materials and information provided on this repository are licensed under the MIT License.

## 13. Course Copyright

Copyright © 2021 Java Programming Course. All rights reserved.


## 2. 
Write a program to find the sum of the first 1000 prime numbers.

## 3. 
Write a program to find the sum of the first 1000 prime numbers.
/Lab 01/README.md
# Lab 01

## 1. 
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
M r

Expected output:
9333

```
