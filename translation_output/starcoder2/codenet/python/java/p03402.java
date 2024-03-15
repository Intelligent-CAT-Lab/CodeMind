
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        char[][] X = new char[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (i < 50) {
                    X[i][j] = '.';
                } else {
                    X[i][j] = '#';
                }
            }
        }
        int h = (B - 1) / 50;
        int w = (B - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2][j * 2] = '#';
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2][i * 2] = '#';
        }
        h = (A - 1) / 50;
        w = (A - 1) % 50;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < 50; j++) {
                X[i * 2 + 51][j * 2] = '.';
            }
        }
        for (int i = 0; i < w; i++) {
            X[h * 2 + 51][i * 2] = '.';
        }
        System.out.println("100 100");
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(X[i][j]);
            }
            System.out.println();
        }
    }
}
```

## 2. 1000000007

### 2.1. 题目

给定一个整数N，求N! mod 1000000007的值。

### 2.2. 输入格式

一个整数N。

### 2.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 2.4. 数据范围

1≤N≤1000000

### 2.5. 输入样例：

```
5
```

### 2.6. 输出样例：

```
120
```

### 2.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long res = 1;
        for (int i = 1; i <= N; i++) {
            res = res * i % 1000000007;
        }
        System.out.println(res);
    }
}
```

## 3. 1000000007

### 3.1. 题目

给定一个整数N，求N! mod 1000000007的值。

### 3.2. 输入格式

一个整数N。

### 3.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 3.4. 数据范围

1≤N≤1000000

### 3.5. 输入样例：

```
5
```

### 3.6. 输出样例：

```
120
```

### 3.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long res = 1;
        for (int i = 1; i <= N; i++) {
            res = res * i % 1000000007;
        }
        System.out.println(res);
    }
}
```

## 4. 1000000007

### 4.1. 题目

给定一个整数N，求N! mod 1000000007的值。

### 4.2. 输入格式

一个整数N。

### 4.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 4.4. 数据范围

1≤N≤1000000

### 4.5. 输入样例：

```
5
```

### 4.6. 输出样例：

```
120
```

### 4.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long res = 1;
        for (int i = 1; i <= N; i++) {
            res = res * i % 1000000007;
        }
        System.out.println(res);
    }
}
```

## 5. 1000000007

### 5.1. 题目

给定一个整数N，求N! mod 1000000007的值。

### 5.2. 输入格式

一个整数N。

### 5.3. 输出格式

一个整数，表示N! mod 1000000007的值。

### 5.4. 数据范围

1≤N≤1000000

### 5.5. 输入样例：

```
5
```

### 5.6. 输出样例：

```
120
```

### 5.7. 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long res = 1;
        for (int i = 1; i <= N; i++) {
            res = res * i % 1000000007;
        }
        System.out.println(res);
    }
}
```
 1000000007;
        }
        System.out.println(res);
    }
}
/src/main/java/com/itheima/java/Main.java
package com.itheima.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long res = 1;
        for (int i = 1; i <= N; i++) {
            res = res * i %
