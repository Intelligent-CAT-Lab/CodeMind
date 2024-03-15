
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51};
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println(nums[index]);
    }
}
```

## 2.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 3.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the even numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
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
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the odd numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 5.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the numbers that are divisible by 3.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
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
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the numbers that are divisible by 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
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
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the numbers that are divisible by 3 and 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
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

## 8.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the numbers that are divisible by 3 or 5.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
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

## 9.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the numbers that are divisible by 3 or 5, but not both.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 10.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the numbers that are divisible by 3 or 5, but not both, and the numbers are in descending order.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = n; i >= 1; i--) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```


## 1.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number.

```python
n = int(input())
sum = 0
for i in range(1, n + 1):
    sum += i
print(sum)
```

## 2.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the even numbers.

```python
n = int(input())
sum = 0
for i in range(1, n + 1):
    if i % 2 == 0:
        sum += i
print(sum)
```

## 3.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but this time, only the odd numbers.

```python
n = int(input())
sum = 0
for i in range(1, n + 1):
    if i % 2 != 0:
        sum += i
print(sum)
```

## 4.
Write a program that reads a number from the user and prints the sum of all the numbers from 1 to that number, but
