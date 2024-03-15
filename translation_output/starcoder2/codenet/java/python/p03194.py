
```

```


```
/p03194.md
# p03194

## 题目描述

给定一个正整数n和一个正整数p，求满足条件的最小的正整数x，使得x^n<=p。

## 输入格式

一行，两个正整数n和p。

## 输出格式

一行，一个正整数x。

## 样例输入

```
2 100
```

## 样例输出

```
5
```

## 数据范围

对于100%的数据，1<=n<=1000000000，1<=p<=1000000000。

## 题解

```
import java.util.*;

class p03194{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        if (n == 1) {
            System.out.println(p);
            return;
        }
        long res = 1;
        for (int i = 2; Math.pow(i, n) <= p; i++) {
            if (p % Math.pow(i, n) == 0) res = i;
        }
        System.out.println(res);
    }
}
```

python code:
```
n, p = map(int, input().split())
if n == 1:
    print(p)
else:
    res = 1
    for i in range(2, int(p ** (1 / n)) + 1):
        if p % i ** n == 0:
            res = i
    print(res)/p03195.md
# p03195

## 题目描述

给定一个正整数n，求满足条件的最小的正整数x，使得x^2<=n。

## 输入格式

一行，一个正整数n。

## 输出格式

一行，一个正整数x。

## 样例输入

```
100
```

## 样例输出

```
10
```

## 数据范围

对于100%的数据，1<=n<=1000000000。

## 题解

```
import java.util.*;

class p03195{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i * i == 0) res = i;
        }
        System.out.println(res);
    }
}
```

python code:
```
n = int(input())
res = 1
for i in range(2, int(n ** 0.5) + 1):
    if n % i ** 2 == 0:
        res = i
print(res)

```
/p03196.md
# p03196

## 题目描述

给定一个正整数n，求满足条件的最小的正整数x，使得x^3<=n。

## 输入格式

一行，一个正整数n。

## 输出格式

一行，一个正整数x。

## 样例输入

```
100
```

## 样例输出

```
4
```

## 数据范围

对于100%的数据，1<=n<=1000000000。

## 题解

```
import java.util.*;

class p03196{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 1;
        for (int i = 2; i * i * i <= n; i++) {
            if (n % i * i * i == 0) res = i;
        }
        System.out.println(res);
    }
}
```

pyn ** (1 / 3)) + 1):
    if n % i ** 3 == 0:
        res = i
print(res)

```
thon code:
```
n = int(input())
res = 1
for i in range(2, int(

```

## 样例输出

```
1
```

## 数据范围

对于100%的数据，1<=n<=1000000000。

## 题解

```
import java.util.*;

class p03197{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 1;
        for (int i = 2; i * i * i * i <= n; i++) {
            if (n % i * i * i * i == 0) res = i;
        }
        System.out.println(res);
    }
}
```

python code:
```
n = int(input())
res = 1
for i in range(2, int(n ** 0.25) + 1):
    if n % i ** 4 == 0:
        res = i
print(res)

```
/p03197.md
# p03197

## 题目描述

给定一个正整数n，求满足条件的最小的正整数x，使得x^4<=n。

## 输入格式

一行，一个正整数n。

## 输出格式

一行，一个正整数x。

## 样例输入

```
100
