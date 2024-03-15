
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(n * n * n);
        }
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int[][] b = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[j][i];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
/2019-2020/01/README.md
# 2019-2020, 1st semester, 1st problem set

## 1.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` natural numbers.

```python
n = int(input())
s = 0
for i in range(1, n + 1):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 2.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` odd natural numbers.

```python
n = int(input())
s = 0
for i in range(1, 2 * n + 1, 2):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 1; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 3.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` even natural numbers.

```python
n = int(input())
s = 0
for i in range(2, 2 * n + 1, 2):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 4.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` even natural numbers.

```python
n = int(input())
s = 0
for i in range(2, 2 * n + 1, 2):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 5.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` even natural numbers.

```python
n = int(input())
s = 0
for i in range(2, 2 * n + 1, 2):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 6.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` even natural numbers.

```python
n = int(input())
s = 0
for i in range(2, 2 * n + 1, 2):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 7.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` even natural numbers.

```python
n = int(input())
s = 0
for i in range(2, 2 * n + 1, 2):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 8.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` even natural numbers.

```python
n = int(input())
s = 0
for i in range(2, 2 * n + 1, 2):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 9.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` even natural numbers.

```python
n = int(input())
s = 0
for i in range(2, 2 * n + 1, 2):
    s += i
print(s)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        for (int i = 2; i <= 2 * n; i += 2) {
            s += i;
        }
        System.out.println(s);
    }
}
```

## 10.

Write a program that reads a number ```n``` and prints the sum of the first ```n``` even natural numbers.

```python
n = int
