
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (string.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```

## 2.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number.

Test input:
5

Expected output:
15

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 3.
Write a program that takes a number as input and prints the sum of all the even numbers from 1 to that number.

Test input:
5

Expected output:
6

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 4.
Write a program that takes a number as input and prints the sum of all the odd numbers from 1 to that number.

Test input:
5

Expected output:
9

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3.

Test input:
5

Expected output:
3

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 6.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 5.

Test input:
5

Expected output:
5

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 7.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 or 5.

Test input:
5

Expected output:
8

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 8.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

Test input:
5

Expected output:
0

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 9.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

Test input:
5

Expected output:
0

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3 and 5.

Test input:
5

Expected output:
0

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```


## 1.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number.

Test input:
5

Expected output:
15

```python
n = int(input())
sum = 0
for i in range(1, n + 1):
    sum += i
print(sum)
```

## 2.
Write a program that takes a number as input and prints the sum of all the even numbers from 1 to that number.

Test input:
5

Expected output:
6

```python
n = int(input())
sum = 0
for i in range(1, n + 1):
    if i % 2 == 0:
        sum += i
print(sum)
```

## 3.
Write a program that takes a number as input and prints the sum of all the odd numbers from 1 to that number.

Test input:
5

Expected output:
9

```python
n = int(input())
sum = 0
for i in range(1, n + 1):
    if i % 2 == 1:
        sum += i
print(sum)
```

## 4.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 3.

Test input:
5

Expected output:
3

```python
n = int(input())
sum = 0
for i in range(1, n + 1):
    if i % 3 == 0:
        sum += i
print(sum)
```

## 5.
Write a program that takes a number as input and prints the sum of all the numbers from 1 to that number that are divisible by 5.

Test input:
5

Expected output:
5

```
