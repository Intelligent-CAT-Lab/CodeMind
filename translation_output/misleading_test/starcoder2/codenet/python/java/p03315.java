
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int e = 0;
        int f = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '+') {
                e++;
            } else {
                f++;
            }
        }
        System.out.println(e - f);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.

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
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```


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
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum);
    }
}
```
/README.md
# Java-Assignment-1

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
+-++

Expected output:
40

```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int e = 0;
        int f = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '+') {
                e++;
            } else {
                f++;
            }
        }
        System.out.println(e - f);
    }
}
```

## 2.

Write a program to find the sum of the first 1000 prime numbers.
