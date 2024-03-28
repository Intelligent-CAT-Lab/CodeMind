

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (a < 0 && Math.min(b - a, -a) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
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
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
```
/java/1000000000/1000000000.md
# 1000000000

## 题目描述

给定两个升序排列的数组，求两个数组的交集。

## 输入格式

第一行输入两个整数n,m，分别表示两个数组的长度。

第二行输入n个整数，表示第一个数组。

第三行输入m个整数，表示第二个数组。

## 输出格式

输出一行，表示两个数组的交集。

## 输入样例

```
4 5
1 2 3 4
2 3 4 5 6
```

## 输出样例

```
2 3 4
```

## 数据范围

对于100%的数据，1≤n,m≤100000，数组中的元素均为不超过1000000000的非负整数。

## 题解

```
n, m = map ( int , input ( ) . split ( ) )
a = list ( map ( int , input ( ) . split ( ) ) )
b = list ( map ( int , input ( ) . split ( ) ) )
i = 0
j = 0
while i < n and j < m :
    if a [ i ] == b [ j ] :
        print ( a [ i ] , end = " " )
        i += 1
        j += 1
    elif a [ i ] < b [ j ] :
        i += 1
    else :
        j += 1/java/1000000000/1000000000.py
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
i = 0
j = 0
while i < n and j < m:
    if a[i] == b[j]:
        print(a[i], end=" ")
        i += 1
        j += 1
    elif a[i] < b[j]:
        i += 1
    else:
        j += 1
/java/1000000000/1000000000.cpp
#include <iostream>
using namespace std;
int main()
{
    int n, m;
    cin >> n >> m;
 0;
}    int a[n], b[m];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    for (int i = 0; i < m; i++)
    {
        cin >> b[i];
    }
    int i = 0, j = 0;
    while (i < n && j < m)
    {
    }
    return

## 题目描述

给定一个长度为n的数组，求数组中所有元素的和。

## 输入格式

第一行输入一个整数n，表示数组的长度。

第二行输入n个整数，表示数组中的元素。

## 输出格式

输出一行，表示数组中所有元素的和。

## 输入样例

```
5
1 2 3 4 5
```

## 输出样例

```
15
```

## 数据范围

对于100%的数据，1≤n≤100000，数组中的元素均为不超过1000000000的非负整数。

## 题解

```
n = int ( input ( ) )
a = list ( map ( int , input ( ) . split ( ) ) )
print ( sum ( a ) )
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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```
/java/1000000000/1000000000.md
# 1000000000

## 题目描述

给定一个长度为n的数组，求数组中所有元素的和。  }
    }
    return 0;
}/java/1000000000/1000000000.c
#include <stdio.h>
int main()
{
    int n, m;
    scanf("%d%d", &n, &m);
    int a[n], b[m];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    for (int i = 0; i < m; i++)
    {
        scanf("%d", &b[i]);
    }
    int i = 0, j = 0;
    while (i < n && j < m)
    {
        if (a[i] == b[j])
        {
            printf("%d ", a[i]);
            i++;
            j++;
        }
        else if (a[i] < b[j])
        {
            i++;
        }
        else
        {
            j++;
        }
    }
    if (i == n)
    {
        while (j < m)
        {
            printf("%d ", b[j]);
       0;
}/java/1000000000/1000000000.c
#include <stdio.h>
int main()
{
    int n;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += a[i];
    }
    printf("%d", sum);
    return  }
    }
    return 0;
}/java/1000000
