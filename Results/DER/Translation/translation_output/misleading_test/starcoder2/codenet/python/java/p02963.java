
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int X1 = 0;
        int Y1 = 0;
        int tmp = (int) Math.sqrt(S);
        int X2, Y3;
        if (tmp * tmp >= S) {
            X2 = Y3 = tmp;
        } else {
            X2 = Y3 = tmp + 1;
        }
        int rest = X2 * X2 - S;
        int X3, Y2;
        if (rest == 0) {
            X3 = Y2 = 0;
        } else {
            if (rest < 1000000000) {
                X3 = 1;
                Y2 = rest;
            } else {
                for (int i = 2; i <= (int) Math.sqrt(rest) + 2; i++) {
                    if (rest % i == 0) {
                        X3 = i;
                        Y2 = rest / i;
                    }
                }
            }
        }
        System.out.println(X1 + " " + Y1 + " " + X2 + " " + Y2 + " " + X3 + " " + Y3);
    }
}
```

## 2. 
Write a program to find the sum of the first 1000 prime numbers.

java code:
```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int i = 2;
        while (count < 1000) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
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
- Course Code: CS201
- Course Credit: 3
- Course Instructor: 
- Course Time: 10:00 - 11:30
- Course Location: Room 301, Building 1, School of Computer Science and Engineering, SUSTech

## 3. Course Content

- Introduction to Java
- Basic Data Types
- Control Flow
- Arrays
- Methods
- Classes
- Inheritance
- Interfaces
- Exceptions
- Generics
- Collections
- I/O
- Threads
- Networking
- Swing
- JDBC
- Servlets
- JSP
- JSTL
- JPA
- Spring
- Spring Boot
- Spring MVC
- Spring Security
- Spring Data
- Spring REST
- Spring WebSocket
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Boot
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring Batch
- Spring Cloud
- Spring Integration
- Spring
