
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int t = 0;
        if (a1 == 1 && a2 == 1) {
            System.out.println(0);
        } else {
            while (a1 > 0 && a2 > 0) {
                if (a1 > a2) {
                    a2 += 1;
                    a1 -= 2;
                } else {
                    a2 -= 2;
                    a1 += 1;
                }
                t += 1;
            }
            System.out.println(t);
        }
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max - min);
    }
}
```
/1000/1000.md
# 1000

## 题目描述

给定一个长度为n的整数数列，请你求出数列中最长连续不下降子序列的长度。

例如，数列{5, 3, 4, 8, 6, 7}的最长连续不下降子序列为{3, 4, 8}，长度为3。

## 输入格式

第一行包含整数n。

第二行包含n个整数，表示整数数列。

## 输出格式

输出一个整数，表示最长连续不下降子序列的长度。

## 数据范围

1≤n≤1000,
−109≤数列中的整数≤109

## 输入样例：

```
6
5 3 4 8 6 7
```

## 输出样例：

```
3  }
}
```
/1001/1001.md
# 1001

## 题目描述

给定一个长度为n的整数数列，请你计算数列中的逆序对的数量。

逆序对的定义如下：对于数列的第i个和第j个元素，如果满足i<j且a[i]>a[j]，则其为一个逆序对；否则不是。

## 输入格式

第一行包含整数n，表示数列的长度。

第二行包含n个整数，表示整个数列。

## 输出格式

输出一个整数，表示逆序对的个数。

## 数据范围

1≤n≤105,
1≤数列中的元素≤109

## 输入样例：

```
6
2 3 4 5 6 1
```

## 输出样例：

```
5
```

## 题解

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
  /1002/1002.md
# 1002

## 题目描述

给定一个长度为n的整数数列，请你计算数列中的逆序对的数量。

逆序对的定义如下：对于数列的第i个和第j个元素，如果满足i<j且a[i]>a[j]，则其为一个逆序对；否则不是。

## 输入格式

第一行包含整数n，表示数列的长度。

第二行包含n个整数，表示整个数列。

## 输出格式

输出一个整数，表示逆序对的个数。

## 数据范围

1≤n≤105,
1≤数列中的元素≤109

## 输入样例：

```
6
2 3 4 5 6 1
```

## 输出样例：

```
5
```

## 题解

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/1003/1003.md
# 1003

## 题目描述

给定一个长度为n的整数数列，请你计算数列中的逆序对的数量。

逆序对的定义如下：对于数列的第i个和第j个元素，如果满足i<j且a[i]>a[j]，则其为一个逆序对；否则不是。

## 输入格式

第一行包含整数n，表示数列的长度。

第二行包含n个整数，表示整个数列。

## 输出格式

输出一个整数，表示逆序对的个数。

## 数据范围

1≤n≤105,
1≤数列中的元素≤109

## 输入样例：

```
6
2 3 4 5 6 1
```

## 输出样例：

```
5
```

## 题解

```

```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```


## 输入样例：

```
6
2 3 4 5 6 1
```

## 输出样例：

```
5
```

## 题解

```

```

java code:
```java
import java.util.Scanner;

public class
