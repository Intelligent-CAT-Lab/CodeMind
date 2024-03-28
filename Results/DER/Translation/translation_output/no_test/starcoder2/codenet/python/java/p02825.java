
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println(-1);
            return;
        }
        if (n == 3) {
            System.out.println("abb");
            System.out.println("a.c");
            System.out.println("ddc");
            return;
        }
        if (n == 5) {
            System.out.println("aabbc");
            System.out.println("hi..c");
            System.out.println("hi..d");
            System.out.println("g.jjd");
            System.out.println("gffee");
            return;
        }
        if (n == 7) {
            System.out.println("..abc..");
            System.out.println("..abc..");
            System.out.println("aax..aa");
            System.out.println("bbx..bb");
            System.out.println("cc.yycc");
            System.out.println("..abc..");
            System.out.println("..abc..");
            return;
        }
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = '.';
            }
        }
        if (n % 2 == 1) {
            a[n - 5][n - 5] = 'a';
            a[n - 5][n - 4] = 'a';
            a[n - 5][n - 3] = 'b';
            a[n - 5][n - 2] = 'b';
            a[n - 5][n - 1] = 'c';
            a[n - 4][n - 5] = 'h';
            a[n - 4][n - 4] = 'i';
            a[n - 4][n - 3] = '.';
            a[n - 4][n - 2] = '.';
            a[n - 4][n - 1] = 'c';
            a[n - 3][n - 5] = 'h';
            a[n - 3][n - 4] = 'i';
            a[n - 3][n - 3] = '.';
            a[n - 3][n - 2] = '.';
            a[n - 3][n - 1] = 'd';
            a[n - 2][n - 5] = 'g';
            a[n - 2][n - 4] = '.';
            a[n - 2][n - 3] = 'j';
            a[n - 2][n - 2] = 'j';
            a[n - 2][n - 1] = 'd';
            a[n - 1][n - 5] = 'g';
            a[n - 1][n - 4] = 'f';
            a[n - 1][n - 3] = 'f';
            a[n - 1][n - 2] = 'e';
            a[n - 1][n - 1] = 'e';
            n -= 5;
        }
        for (int i = 0; i < n; i += 2) {
            a[i][i] = 'a';
            a[i][i + 1] = 'a';
            a[i + 1][i] = 'b';
            a[i + 1][i + 1] = 'b';
        }
        if (n % 4 == 0) {
            for (int i = 0; i < n; i += 2) {
                a[n - i - 2][i] = 'c';
                a[n - i - 2][i + 1] = 'd';
                a[n - i - 1][i] = 'c';
                a[n - i - 1][i + 1] = 'd';
            }
        } else {
            for (int i = 0; i < n - 2; i += 2) {
                a[i][i + 2] = 'c';
                a[i][i + 3] = 'd';
                a[i + 1][i + 2] = 'c';
                a[i + 1][i + 3] = 'd';
            }
            a[n - 2][0] = 'c';
            a[n - 2][1] = 'd';
            a[n - 1][0] = 'c';
            a[n - 1][1] = 'd';
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
```

## 2. 1000000007

### 2.1. 题目

给定一个整数n，求n的阶乘除以1000000007的余数。

### 2.2. 输入格式

一个整数n。

### 2.3. 输出格式

一个整数，表示n的阶乘除以1000000007的余数。

### 2.4. 样例

#### 2.4.1. 输入

```
10
```

#### 2.4.2. 输出

```
3628800
```

### 2.5. 数据范围

0≤n≤10^6

### 2.6. 题解

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
       
