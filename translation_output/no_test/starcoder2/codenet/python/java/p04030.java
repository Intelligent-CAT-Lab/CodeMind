
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                if (!a.equals("")) {
                    a = a.substring(0, a.length() - 1);
                }
            } else {
                a += s.charAt(i);
            }
        }
        System.out.println(a);
    }
}
```

## 2.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

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
# Java-Programming-and-Software-Engineering-Fundamentals

## Week 1

### 1.1 Introduction to Java

#### 1.1.1 What is Java?

- Java is a programming language
- Java is a platform
- Java is a language
- Java is a specification
- Java is a set of rules
- Java is a technology
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer language
- Java is a programming language
- Java is a computer
