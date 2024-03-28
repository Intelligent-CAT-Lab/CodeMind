

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        System.out.printf("%.5f %.5f", s, l);
    }
}
```


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
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```
/java/001.md
# 001. 最大值

## 题目描述

给定一个整数数组，请找出其中最大的元素。

## 输入格式

输入的第一行包含一个整数n，表示数组长度。

第二行包含n个整数（均在整型范围内），表示整个数组。

## 输出格式

输出一个整数，表示数组中最大的元素。

## 样例输入

```
4
1 3 -5 7
```

## 样例输出

```
7
```

## 数据规模与约定

1 <= n <= 10000。

## 解题思路

1. 读入数组长度n
2. 读入n个整数
3. 遍历数组，找出最大值
4. 输出最大值

## 参考代码

python code:

```python
n = int(input())
a = [int(i) for i in input().split()]
max = a[0]
for i in range(1, n):
    if a[i] > max:
        max = a[i]
print(max)
```

java code:/java/002.md
# 002. 计算阶乘

## 题目描述

给定一个正整数，请计算它的阶乘，并输出结果。

## 输入格式

输入包含一个整数n。

## 输出格式

输出一个整数，表示n的阶乘。

## 样例输入

```
5
```

## 样例输出

```
120
```

## 数据规模与约定

1 <= n <= 1000。

## 解题思路

1. 读入整数n
2. 计算n的阶乘
3. 输出结果

## 参考代码

python code:

```python
n = int(input())
f = 1
for i in range(1, n + 1):
    f *= i
print(f)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println(f);
    }
}
```

## 解题思路2

1. 读入整数n
2. 计算n的阶乘
3. 输出结果

## 参考代码2

python code:

```python
n = int(input())
f = 1
i = 1
while i <= n:
    f *= i
    i += 1
print(f)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        int i = 1;
        while (i <= n) {
            f *= i;
            i++;
        }
        System.out.println(f);
    }
}
```

## 解题思路3

1. 读入整数n
2. 计算n的阶乘
3. 输出结果

## 参考代码3

python code:

```python
n = int(input())
f = 1
i = 1
while True:
    f *= i
    i += 1
    if i > n:
        break
print(f)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        int i = 1;
        while (true) {
            f *= i;
            i++;
            if (i > n) {
                break;
            }
        }
        System.out.println(f);
    }
}
```

## 解题思路4

1. 读入整数n
2. 计算n的阶乘
3. 输出结果

## 参考代码4

python code:

```python
n = int(input())
f = 1
i = 1
while i <= n:
    f *= i
    i += 1
print(f)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        int i = 1;
        while (i <= n) {
            f *= i;
            i++;
        }
        System.out.println(f);
    }
}
```

## 解题思路5

1. 读入整数n
2. 计算n的阶乘
3. 输出结果

## 参考代码5

python code:

```python
n = int(input())
f = 1
i = 1
while i <= n:
    f *= i
    i += 1
print(f)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        int i = 1;
        while (i <= n) {
            f *= i;
            i++;
        }
        System.out.println(f);
    }
}
```

## 解题思路6

1. 读入整数n
2. 计算n的阶乘
3. 输出结果

## 参考代码6

python code:

```python
n = int(input())
f = 1
i = 1
while i <= n:
    f *= i
    i += 1
print(f)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;
        int i = 1;
        while (i <= n) {
            f *= i;
            i++;
        }
        System.out.println(f);
    }
}
```

## 解题思路7

1. 读入整数n
2. 计算n的阶乘
3. 输出结果

## 参考代码7

python code:

```python
n = int(input())
f = 1
i = 1
while i <= n:
    f *= i
    i += 1
print(f)
```

java code:

```java
import java.util.Scanner;

public class Main {
   
