
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
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
/02-arrays/02-arrays-2d.md
# 2D arrays

## 2D arrays

### Task

Write a program that reads a two-dimensional array of integers and then prints the array in a transposed form.

### Input

The first line contains two integers n and m (1 ≤ n, m ≤ 100) — the number of rows and columns in the array.

Next n lines contain m integers each — the elements of the array.

### Output

Print m lines, each containing n integers — the transposed array.

### Examples

| Input | Output |
| ----- | ------ |
| 3 4<br>1 2 3 4<br>5 6 7 8<br>9 10 11 12 | 1 5 9<br>2 6 10<br>3 7 11<br>4 8 12 |
| 2 3<br>1 2 3<br>4 5 6 | 1 4<br>2 5<br>3 6 |

### Solution

```python
n, m = map(int, input().split())
a = [list(map(int, input().split())) for i in range(n)]
b = [[a[j][i] for j in range(n)] for i in range(m)]
for row in b:
    print(*row)
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

## 2D arrays

### Task

Write a program that reads a two-dimensional array of integers and then prints the array in a transposed form.

### Input

The first line contains two integers n and m (1 ≤ n, m ≤ 100) — the number of rows and columns in the array.

Next n lines contain m integers each — the elements of the array.

### Output

Print m lines, each containing n integers — the transposed array.

### Examples

| Input | Output |
| ----- | ------ |
| 3 4<br>1 2 3 4<br>5 6 7 8<br>9 10 11 12 | 1 5 9<br>2 6 10<br>3 7 11<br>4 8 12 |
| 2 3<br>1 2 3<br>4 5 6 | 1 4<br>2 5<br>3 6 |

### Solution

```python
n, m = map(int, input().split())
a = [list(map(int, input().split())) for i in range(n)]
b = [[a[j][i] for j in range(n)] for i in range(m)]
for row in b:
    print(*row)
```/01-basics/01-basics-1.md
# Basics

## Hello, world!

### Task

Write a program that prints "Hello, world!"

### Input

There is no input for this problem.

### Output

Print "Hello, world!"

### Examples

| Input | Output |
| ----- | ------ |
|       | Hello, world! |

### Solution

```python
print("Hello, world!")
```

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

## Sum of two numbers

### Task

Write a program that reads two integers and prints their sum.

### Input

The first line contains the first integer. The second line contains the second integer.

### Output

Print the sum of two integers.

### Examples

| Input | Output |
| ----- | ------ |
| 1<br>2 | 3 |
| 100<br>200 | 300 |

### Solution

```python
a = int(input())
b = int(input())
print(a + b)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```

## Sum of three numbers

### Task

Write a program that reads three integers and prints their sum.

### Input

The first line contains the first integer. The second line contains the second integer. The third line contains the third integer.

### Output

Print the sum of three integers.

### Examples

| Input | Output |
| ----- | ------ |
| 1<br>2<br>3 | 6 |
| 100<br>200<br>300 | 600 |

### Solution

```python
a = int(input())
b = int(input())
c = int(input())
print(a + b + c)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + b + c);
    }
}
```

## Sum of four numbers

### Task

Write a program that reads four integers and prints their sum.

### Input

The first line contains the first integer. The second line contains the second integer. The third line contains the third integer. The fourth line contains the fourth integer.

### Output

Print the sum of four integers.

### Examples

| Input | Output |
| ----- | ------ |
| 1<br>2<br>3<br>4 | 10 |
| 100<br>200<br>300<br>400 | 1000 |

### Solution

```python
a =
