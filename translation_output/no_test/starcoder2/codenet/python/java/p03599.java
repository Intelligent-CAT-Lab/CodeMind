
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int maxsugar = 0;
        int maxwater = 100 * a;
        for (int i = 0; i <= 30; i++) {
            for (int j = 0; j <= 30; j++) {
                for (int k = 0; k <= 3000; k++) {
                    int water = 100 * a * i + 100 * b * j;
                    int sugar = c * k;
                    if (water + sugar > f) {
                        continue;
                    }
                    if (sugar > (a * i + b * j) * e) {
                        continue;
                    }
                    sugar += Math.min((f - (water + sugar)) / d * d, ((a * i + b * j) * e - c * k) / d * d);
                    if (100 * maxsugar * (water + sugar) < 100 * sugar * (maxsugar + maxwater)) {
                        maxsugar = sugar;
                        maxwater = water;
                    }
                }
            }
        }
        System.out.println(maxsugar + maxwater + " " + maxsugar);
    }
}
```

## 1005. 螺旋矩阵

### 题目描述

给定一个正整数N，输出一个N*N的螺旋矩阵。

### 输入格式

一个正整数N。

### 输出格式

一个N*N的螺旋矩阵。

### 样例输入

```
3
```

### 样例输出

```
1 2 3
8 9 4
7 6 5
```

### 题解

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int x = 0, y = 0;
        int dx = 0, dy = 1;
        for (int i = 1; i <= n * n; i++) {
            a[x][y] = i;
            if (x + dx < 0 || x + dx >= n || y + dy < 0 || y + dy >= n || a[x + dx][y + dy] != 0) {
                int temp = dx;
                dx = dy;
                dy = -temp;
            }
            x += dx;
            y += dy;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

## 1006. 最大子段和

### 题目描述

给定一个整数序列，求出最大子段和。

### 输入格式

第一行包含一个整数N。

第二行包含N个整数，表示整数序列。

### 输出格式

输出一个整数，表示最大子段和。

### 样例输入

```
5
1 -2 3 5 -2
```

### 样例输出

```
8
```

### 题解

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
```

## 1007. 最大子段和II

### 题目描述

给定一个整数序列，求出最大子段和。

### 输入格式

第一行包含一个整数N。

第二行包含N个整数，表示整数序列。

### 输出格式

输出一个整数，表示最大子段和。

### 样例输入

```
5
1 -2 3 5 -2
```

### 样例输出

```
8
```

### 题解

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
```

## 1008. 最大子段和III

### 题目描述

给定一个整数序列，求出最大子段和。

### 输入格式

第一行包含一个整数N。

第二行包含N个整数，表示整数序列。

### 输出格式

输出一个整数，表示最大子段和。

### 样例输入

```
5
1 -2 3 5 -2
```

### 样例输出

```
8
```

### 题解

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
```

## 1009. 最大子段和IV

### 题目描述

给定一个整数序列，求出最大子段和。

### 输入格式

第一行包含一个整数N。

第二行包含N个整数，表示整数序列。

### 输出格式

输出一个整数，表示最大子段和。

### 样例输入

```
5
1 -2 3 5 -2
```

### 样例输出

```
8
```

### 题解

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int
