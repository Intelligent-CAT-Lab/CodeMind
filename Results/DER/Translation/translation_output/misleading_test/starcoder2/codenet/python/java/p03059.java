
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        System.out.println((t / a) * b);
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n / a + (n % a > 0 ? 1 : 0)) * (m / a + (m % a > 0 ? 1 : 0)));
    }
}
```
/01-basic-syntax/02-division/README.md
# Division

## Problem

You are given a rectangle of size n × m. You need to cut the rectangle into square pieces with side a. How many squares will you get as a result?

## Input

The input consists of three positive integers n, m, and a (1 ≤ n, m, a ≤ 109).

## Output

Print one integer — the number of square pieces you will get.

## Sample

Test input:
6 6 4

Expected output:
4

Test input:
2 5 3

Expected output:
2

## Solution

```
n, m, a = map(int, input().split())
print((n // a + (n % a > 0)) * (m // a + (m % a > 0)))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n / a + (n % a > 0 ? 1 : 0)) * (m / a + (m % a > 0 ? 1 : 0)));
    }
}
```

## Solution 2

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 3

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 4

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 5

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 6

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 7

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 8

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 9

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 10

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n + a - 1) / a * (m + a - 1) / a);
    }
}
```

## Solution 11

```
n, m, a = map(int, input().split())
print((n + a - 1) // a * (m + a - 1) // a)
```

java code:
```java
