

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            System.out.println(new StringBuilder(l).reverse().toString());
        }
    }
}
```

## Question 2

Write a program to find the sum of the digits of a number.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a program to find the sum of the digits of a number.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
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
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a program to find the sum of the digits of a number.

Test input:
12345

Expected output:
15

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```
/README.md
# Java-Assignment-1

## Question 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba


```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            System.out.println(new StringBuilder(l).reverse().toString());
        }
    }
}
```

## Question 2

Write a program to find the sum of the digits of a number.

Test input:
12345

Expected output:
15
