
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 0;
        for (int i = 0; i < 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```

## 1002

### 题目描述

给定一个长度为N的整数序列，求出最长单调递增子序列的长度。

### 输入格式

第一行包含整数N。

第二行包含N个整数，表示整数序列。

### 输出格式

输出一个整数，表示最大长度。

### 数据范围

1≤N≤1000，
−109≤整数≤109

### 输入样例：

```
7
3 1 2 1 8 5 6
```

### 输出样例：

```
4
```

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int[] f = new int[N];
        int res = 0;
        for (int i = 0; i < N; i++) {
            f[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            res = Math.max(res, f[i]);
        }
        System.out.println(res);
    }
}
```

## 1003

### 题目描述

给定一个长度为N的整数序列，请找出最长的不下降子序列。

例如：给定一个长度为6的序列{ 5， 6， 7， 1， 2， 8 }，

最长的不下降子序列为{ 5， 6， 7， 8 }，长度为4。

### 输入格式

第一行包含整数N。

第二行包含N个整数，表示整数序列。

### 输出格式

输出一个整数，表示最大长度。

### 数据范围

1≤N≤1000，
−109≤整数≤109

### 输入样例：

```
6
5 6 7 1 2 8
```

### 输出样例：

```
4
```

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int[] f = new int[N];
        int res = 0;
        for (int i = 0; i < N; i++) {
            f[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] <= a[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            res = Math.max(res, f[i]);
        }
        System.out.println(res);
    }
}
```

## 1004

### 题目描述

给定一个长度为N的数列，求数值严格单调递增的子序列的长度。

### 输入格式

第一行包含整数N。

第二行包含N个整数，表示给定序列。

### 输出格式

输出一个整数，表示最大长度。

### 数据范围

1≤N≤1000，
−109≤整数≤109

### 输入样例：

```
7
3 1 2 1 8 5 6
```

### 输出样例：

```
4
```

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int[] f = new int[N];
        int res = 0;
        for (int i = 0; i < N; i++) {
            f[i] = 1;
            for (int j = 0; j < i; j++) {
                if (a[j] < a[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
            res = Math.max(res, f[i]);
        }
        System.out.println(res);
    }
}
```

## 1005

### 题目描述

给定一个长度为N的数列，数列中每个数都是1到6的整数。

现在要将数列分成若干段，每段的和是K的倍数，可能有多种分法，求分法的数目。

例如，N=8，数列为2 2 1 1 1 2 5 6，K=6。

可以分成{ 2，2，1，1，1，2 }和{ 5，6 }，

也可以分成{ 2，2，1 }和{ 1，2，5，6 }，

还可以分成{ 2，2，1，1 }和{ 1，2，5，6 }。

### 输入格式

第一行包含两个整数N和K。

第二行包含N个整数，表示给定数列。

### 输出格式

输出一个整数，表示分法的数目。

### 数据范围

1≤N≤1000，
2≤K≤6

### 输入样例：

```
8 6
2 2 1 1 1 2 5 6
```

### 输出样例：

```
3
```

### 题解

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int[][] f = new int[N][K];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                f[i][j] = 0;
            }
        }
        f[0][a[0] % K] = 1;
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < K; j++) {
                f[i][j] = f[i - 1][j];
            }
            f[i][a[i] % K] += 
