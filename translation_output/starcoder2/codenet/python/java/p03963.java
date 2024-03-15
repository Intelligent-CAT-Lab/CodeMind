
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(k * (k - 1) * Math.pow(k - 1, n - 1));
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/java/01-basic/01-basic-01.md
# 01-basic-01

## 1. 题目描述

给定一个长度为n的整数序列a1,a2,...,an，以及一个整数k，请问该序列中有多少个元素的值恰好为k。

## 2. 输入格式

第一行包含两个整数n和k，分别表示序列的长度和整数k。

第二行包含n个整数，依次表示a1,a2,...,an。

## 3. 输出格式

一个整数，表示答案。

## 4. 样例输入

```
5 1
1 2 3 1 1
```

## 5. 样例输出

```
3
```

## 6. 样例解释

a1,a4,a5的值均为1，因此答案为3。

## 7. 数据范围

对于100%的数据，1≤n≤100000,1≤k≤100000,1≤ai≤100000。

## 8. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 10. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 12. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 13. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 14. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 15. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 16. 解题思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                count++;
            }
