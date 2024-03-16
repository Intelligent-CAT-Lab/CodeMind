
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        solve(s);
    }

    public static void solve(int s) {
        int m = 1;
        int pre = s;
        Set<Integer> st = new HashSet<>();
        st.add(s);
        while (true) {
            m++;
            int tmp;
            if (pre % 2 == 0) {
                tmp = pre / 2;
            } else {
                tmp = 3 * pre + 1;
            }
            if (st.contains(tmp)) {
                System.out.println(m);
                return;
            }
            pre = tmp;
            st.add(tmp);
        }
    }
}
```

## 1003

### 题目描述

本题要求计算$f(0),f(1),f(2),\dots,f(n)$。

### 输入格式

输入第一行给出一个正整数$n$（$\le 40$）。

### 输出格式

在一行中输出$f(0),f(1),f(2),\dots,f(n)$，数字间以空格分隔，但行末不能有多余空格。

### 输入样例

```in
3
```

### 输出样例

```out
1 0 1 1
```

### 思路

递归

### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n + 1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i <= n; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(f[i]);
        }
    }
}
```

## 1004

### 题目描述

读入$n$名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。

### 输入格式

每个测试输入包含$1$个测试用例，格式为

```
第1行：正整数n
第2行：第1个学生的姓名 学号 成绩
第3行：第2个学生的姓名 学号 成绩
  ... ... ...
第n+1行：第n个学生的姓名 学号 成绩
```

其中`姓名`和`学号`均为不超过$10$个字符的字符串，成绩为$0$到$100$之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。

### 输出格式

对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。

### 输入样例

```in
3
Joe Math990112 89
Mike CS991301 100
Mary EE990830 95
```

### 输出样例

```out
Mike CS991301
Joe Math990112
```

### 思路

### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = "";
        String id = "";
        int score = 0;
        int max = 0;
        int min = 100;
        for (int i = 0; i < n; i++) {
            String name_ = sc.next();
            String id_ = sc.next();
            int score_ = sc.nextInt();
            if (score_ > max) {
                max = score_;
                name = name_;
                id = id_;
            }
            if (score_ < min) {
                min = score_;
                name = name_;
                id = id_;
            }
        }
        System.out.println(name + " " + id);
        System.out.println(name + " " + id);
    }
}
```

## 1005

### 题目描述

给定区间$[-2^31, 2^31)$内的$3$个整数$A$、$B$和$C$，请判断$A+B$是否大于$C$。

### 输入格式

输入第1行给出正整数$T(T\le 10)$，是测试用例的个数。随后给出$T$组测试用例，每组占一行，顺序给出$A$、$B$和$C$。整数间以空格分隔。

### 输出格式

对每组测试用例，在一行中输出`Case #X: true`如果$A+B>C$，否则输出`Case #X: false`，其中`X`是测试用例的编号（从$1$开始）。

### 输入样例

```in
4
1 2 3
2 3 4
2147483647 0 2147483646
0 -2147483648 -2147483647
```

### 输出样例

```out
Case #1: false
Case #2: true
Case #3: true
Case #4: false
```

### 思路

### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            System.out.println("Case #" + (i + 1) + ": " + (a + b > c));
        }
    }
}
```

## 1006

### 题目描述

本题要求将输入的任意3位正整数分解为数字。

### 输入格式

输入在一行中给出一个不超过999的正整数。

### 输出格式

在一行中按逆序输出每个数字对应的拼音，数字间以空格分隔，行首尾不得有多余空格。

### 输入样例

```in
123
```

### 输出样例

```out
bai shi er
```

### 思路

### 代码

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        String[] s = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "
