
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int[] l = new int[R - L + 1];
            for (int i = 0; i < l.length; i++) {
                l[i] = (L + i) * (L + i + 1) % 2019;
            }
            int min = l[0];
            for (int i = 1; i < l.length; i++) {
                if (l[i] < min) {
                    min = l[i];
                }
            }
            System.out.println(min);
        }
    }
}
```

## 1000. A+B

### Description

Calculate the sum of two integers.

### Input

The first line contains an integer $a$, the second line contains an integer $b$.

### Output

Output the sum of $a$ and $b$.

### Sample Input

```
1
2
```

### Sample Output

```
3
```

### Hint

$0 \leq a, b \leq 10000$

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```


### Solution

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
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}
```

## 1002. 最大子列和

### Description

给定 $K$ 个整数组成的序列 $ { N_1, N_2, ..., N_K } $，“连续子列”被定义为 $ { N_i, N_{i+1}, ..., N_j } $，其中 $ 1 \leq i \leq j \leq K $。“最大子列和”则被定义为所有连续子列元素的和中最大者。例如给定序列 $ { -2, 11, -4, 13, -5, -2 } $，其连续子列 $ { 11, -4, 13 } $ 的和最大，为 $ 20 $。现要求你编写程序，计算给定整数序列的最大子列和。

本题旨在测试各种不同的算法在各种数据情况下的表现。各组测试数据特点如下：

- 数据1：与样例等价，测试基本正确性；
- 数据2：102个随机整数；
- 数据3：103个随机整数；
- 数据4：104个随机整数；
- 数据5：105个随机整数；

### Input

输入第1行给出正整数 $K$（$ \leq 100000 $）；第2行给出 $K$ 个整数，其间以空格分隔。

### Output

在一行中输出最大子列和。如果序列中所有整数皆为负数，则输出0。

### Sample Input

```
6
-2 11 -4 13 -5 -2
```

### Sample Output

```
20
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
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
/docs/PAT/Basic/1001-1005.md
# 1001-1005

## 1001. 害死人不偿命的(3n+1)猜想

### Description

卡拉兹(Callatz)猜想：

对任何一个自然数 $n$，如果它是偶数，那么把它砍掉一半；如果它是奇数，那么把(3n+1)砍掉一半。这样一直反复砍下去，最后一定在某一步得到 $n=1$。卡拉兹在1950年的世界数学家大会上公布了这个猜想，传说当时耶鲁大学师生齐动员，拼命想证明这个貌似很傻很天真的命题，结果闹得学生们无心学业，一心只证(3n+1)，以至于有人说这是一个阴谋，卡拉兹是在蓄意延缓美国数学界教学与科研的进展……

我们今天的题目不是证明卡拉兹猜想，而是对给定的任一不超过1000的正整数 $n$，简单地数一下，需要多少步（砍几下）才能得到 $n=1$？

### Input

每个测试输入包含1个测试用例，即给出自然数 $n$ 的值。

### Output

输出从 $n$ 计算到 $1$ 需要的步数。

### Sample Input

```
3
```

### Sample Output

```
5
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n + 1) / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
```

## 1002. 写出这个数

### Description

读入一个自然数 $n$，计算其各位数字之和，用汉语拼音写出和的每一位数字。

### Input

每个测试输入包含1个测试用例，即给出自然数 $n$ 的值。这里保证 $n$ 小于10100。

### Output

在一行内输出 $n$ 的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音
