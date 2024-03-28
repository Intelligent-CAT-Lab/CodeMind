
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(a * a);
    }
}
```

## 2.

Write a program that reads a number n and prints the sum of the first n even numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number n and prints the sum of the first n odd numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 2 * i + 1;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program that reads a number n and prints the sum of the first n prime numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int i = 0;
        int j = 0;
        while (i < n) {
            j++;
            boolean isPrime = true;
            for (int k = 2; k < j; k++) {
                if (j % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += j;
                i++;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 3 * i;
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 5 * i;
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 7.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 7 * i;
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 11.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 11 * i;
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 13.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 13 * i;
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 17.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 17 * i;
        }
        System.out.println(sum);
    }
}
```


## 10.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 17.

```python
n = int(input())
sum = 0
for i in range(n):
    sum += 17 * i
print(sum)
```
/python/01-loops.md
# Loops

## 1.

Write a program that reads a number n and prints the sum of the first n even numbers.

```python
n = int(input())
sum = 0
for i in range(n):
    sum += 2 * i
print(sum)
```

## 2.

Write a program that reads a number n and prints the sum of the first n odd numbers.

```python
n = int(input())
sum = 0
for i in range(n):
    sum += 2 * i + 1
print(sum)
```

## 3.

Write a program that reads a number n and prints the sum of the first n prime numbers.

```python
n = int(input())
sum = 0
i = 0
j = 0
while i < n:
    j += 1
    isPrime = True
    for k in range(2, j):
        if j % k == 0:
            isPrime = False
            break
    if isPrime:
        sum += j
        i += 1
print(sum)
```

## 4.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 3.

```python
n = int(input())
sum = 0
for i in range(n):
    sum += 3 * i
print(sum)
```

## 5.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 5.

```python
n = int(input())
sum = 0
for i in range(n):
    sum += 5 * i
print(sum)
```

## 6.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 7.

```python
n = int(input())
sum = 0
for i in range(n):
    sum += 7 * i
print(sum)
```

## 7.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 11.

```python
n = int(input())
sum = 0
for i in range(n):
    sum += 11 * i
print(sum)
```

## 8.

Write a program that reads a number n and prints the sum of the first n numbers that are divisible by 13.

```python
n = int(input())
sum = 0
for i in
