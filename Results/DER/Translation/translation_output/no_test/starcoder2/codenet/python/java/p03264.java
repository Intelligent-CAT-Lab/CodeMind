
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(Math.ceil(k/2)*(k/2));
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```
/01-01-2021/01-01-2021.md
# 01-01-2021

## 1.

Write a program that takes an integer n and prints the sum of the first n positive integers.

```python
n = int(input())
print(n*(n+1)//2)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(n+1)/2);
    }
}
```

## 2.

Write a program that takes an integer n and prints the sum of the squares of the first n positive integers.

```python
n = int(input())
print(n*(n+1)*(2*n+1)//6)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(n+1)*(2*n+1)/6);
    }
}
```

## 3.

Write a program that takes an integer n and prints the sum of the cubes of the first n positive integers.

```python
n = int(input())
print(n**2*(n+1)**2//4)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*n*(n+1)*(n+1)/4);
    }
}
```

## 4.

Write a program that takes an integer n and prints the sum of the first n positive odd integers.

```python
n = int(input())
print(n**2)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*n);
    }
}
```

## 5.

Write a program that takes an integer n and prints the sum of the first n positive even integers.

```python
n = int(input())
print(n*(n+1))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(n+1));
    }
}
```

## 6.

Write a program that takes an integer n and prints the sum of the squares of the first n positive odd integers.

```python
n = int(input())
print(n*(2*n-1)*(2*n+1)//3)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(2*n-1)*(2*n+1)/3);
    }
}
```

## 7.

Write a program that takes an integer n and prints the sum of the squares of the first n positive even integers.

```python
n = int(input())
print(n*(n+1)*(2*n+1)//3)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*(n+1)*(2*n+1)/3);
    }
}
```

## 8.

Write a program that takes an integer n and prints the sum of the cubes of the first n positive odd integers.

```python
n = int(input())
print(n**2*(2*n-1)**2//4)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*n*(2*n-1)*(2*n-1)/4);
    }
}
```

## 9.

Write a program that takes an integer n and prints the sum of the cubes of the first n positive even integers.

```python
n = int(input())
print(n**2*(2*n)**2//4)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n*n*(2*n)*(2*n)/4);
    }
}
```

## 10.

Write a program that takes an integer n and prints the sum of the first n positive integers that are divisible by 3.

```python
n = int(input())
print(3*n*(n+1)//2)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(3*n*(n+1)/2);
    }
}
```

## 11.

Write a program that takes an integer n and prints the sum of the first n positive integers that are divisible by 5.

```python
n = int(input())
print(5*n*(n+1)//2)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(5*n*(n+1)/2);
    }
}
```

## 12.

Write a program that takes an integer n and prints the sum of the first n positive integers that are divisible by 7.

```python
n = int(input())
print(7*n*(n+1)//2)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(7*n*(n+1)/2);
    }
}
```

## 13.

Write a program that takes an integer n and prints the sum of the first n positive integers that are divisible by 11.

```python
n = int(input())
print(11*n*(n+1)//2)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(11*n*(n+1)/2);
    }
}
```

## 14.

Write a program that takes an integer n and prints the sum of
