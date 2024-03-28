
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        int f = sc.nextInt();
        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```

## Question 2

Write a program to find the sum of the first 100 natural numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a program to find the sum of the first 100 even numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 4

Write a program to find the sum of the first 100 odd numbers.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 5

Write a program to find the sum of the first 100 multiples of 3.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 6

Write a program to find the sum of the first 100 multiples of 5.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 7

Write a program to find the sum of the first 100 multiples of 7.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 8

Write a program to find the sum of the first 100 multiples of 11.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 9

Write a program to find the sum of the first 100 multiples of 13.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## Question 10

Write a program to find the sum of the first 100 multiples of 17.

```java
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 17 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```


## Question 1

Write a program to find the sum of the first 100 natural numbers.

```python
sum = 0
for i in range(1, 101):
    sum += i
print(sum)
```

## Question 2

Write a program to find the sum of the first 100 even numbers.

```python
sum = 0
for i in range(1, 101):
    if i % 2 == 0:
        sum += i
print(sum)
```

## Question 3

Write a program to find the sum of the first 100 odd numbers.

```python
sum = 0
for i in range(1, 101):
    if i % 2 != 0:
        sum += i
print(sum)
```

## Question 4

Write a program to find the sum of the first 100 multiples of 3.

```python
sum = 0
for i in range(1, 101):
    if i % 3 == 0:
        sum += i
print(sum)
```

## Question 5

Write a program to find the sum of the first 100 multiples of 5.

```python
sum = 0
for i in range(1, 101):
    if i % 5 == 0:
        sum += i
print(sum)
```

## Question 6

Write a program to find the sum of the first 100 multiples of 7.

```python
sum = 0
for i in range(1, 101):
    if i % 7 == 0:
        sum += i
print(sum)
```

## Question 7

Write a program to find the sum of the first 100 multiples of 11.

```python
sum = 0
for i in range(1, 101):
    if i % 11 == 0:
        sum += i
print(sum)
```

## Question 8

Write a program to find the sum of the first 100 multiples of 13.

```python
sum = 0
for i in range(1, 101):
    if i % 13 == 0:
        sum += i
print(sum)
```

## Question 9

Write a program to find the sum of the first 100 multiples of 17.

```python
sum = 0
for i in range(1, 101):
    if i % 17 == 0:
        sum += i
print(sum)
```

## Question 10

Write a program to find the sum of the first 100 multiples of 19.

```python
sum = 0
for i in range(1, 101):
    if i % 19 == 0:
        sum += i
print(sum)
```
/python/README.md
# Python

## Question 1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 0 1

Expected output:
-24 64 -99 -38

```java
import java.
