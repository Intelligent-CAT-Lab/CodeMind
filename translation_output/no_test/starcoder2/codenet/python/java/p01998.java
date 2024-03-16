
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int root = (int) Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[n + 3];
        for (int i = 4; i < n + 3; i += 2) {
            isPrime[i] = false;
        }
        int ans = 0;
        int prePrime = -1;
        for (int i = 3; i < n + 3; i += 2) {
            if (isPrime[i]) {
                if (prePrime + 2 == i) {
                    ans += 2;
                }
                prePrime = i;
                if (i > root) {
                    continue;
                }
                for (int j = i * i; j < n + 3; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 1001. 3n+1

### 题目描述

卡拉兹(Callatz)猜想：

对任何一个自然数n，如果它是偶数，那么把它砍掉一半；如果它是奇数，那么把(3n+1)砍掉一半。这样一直反复砍下去，最后一定在某一步得到n=1。卡拉兹在1950年的世界数学家大会上公布了这个猜想，传说当时耶鲁大学师生齐动员，拼命想证明这个貌似很傻很天真的命题，结果闹得学生们无心学业，一心只证(3n+1)，以至于有人说这是一个阴谋，卡拉兹是在蓄意延缓美国数学界教学与科研的进展……

我们今天的题目不是证明卡拉兹猜想，而是对给定的任一不超过1000的正整数n，简单地数一下，需要多少步（砍几下）才能得到n=1？

### 输入格式

每个测试输入包含1个测试用例，即给出自然数n的值。

### 输出格式

输出从n计算到1需要的步数。

### 输入样例

```
3
```

### 输出样例

```
5
```

### 题目分析

这道题目是一道非常简单的题目，只需要按照题目所给的规则进行计算即可。

### 参考代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (3 * n + 1) / 2;
            }
            ans++;
        }
        System.out.println(ans);
    }
}
```

## 1002. 写出这个数

### 题目描述

读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

### 输入格式

每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10100。

### 输出格式

在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。

### 输入样例

```
1234567890987654321123456789
```

### 输出样例

```
yi san wu
```

### 题目分析

这道题目是一道非常简单的题目，只需要按照题目所给的规则进行计算即可。

### 参考代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        String[] num = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        String ans = "";
        while (sum != 0) {
            ans = num[sum % 10] + " " + ans;
            sum /= 10;
        }
        System.out.println(ans.substring(0, ans.length() - 1));
    }
}
```

## 1003. 我要通过！

### 题目描述

“答案正确”是自动判题系统给出的最令人欢喜的回复。本题属于PAT的“答案正确”大派送 —— 只要读入的字符串满足下列条件，系统就输出“答案正确”，否则输出“答案错误”。

得到“答案正确”的条件是：

1. 字符串中必须仅有P, A, T这三种字符，不可以包含其它字符；
2. 任意形如 xPATx 的字符串都可以获得“答案正确”，其中 x 或者是空字符串，或者是仅由字母 A 组成的字符串；
3. 如果 aPbTc 是正确的，那么 aPbATca 也是正确的，其中 a, b, c 均或者是空字符串，或者是仅由字母 A 组成的字符串。

现在就请你为PAT写一个自动裁判程序，判定哪些字符串是可以获得“答案正确”的。

### 输入格式

每个测试输入包含1个测试用例。第1行给出一个自然数n (<10)，是需要检测的字符串个数。接下来每个字符串占一行，字符串长度不超过100，且不包含空格。

### 输出格式

每个字符串的检测结果占一行，如果该字符串可以获得“答案正确”，则输出YES，否则输出NO。

### 输入样例

```
8
PAT
PAAT
AAPATAA
AAPAATAAAA
xPATx
PT
Whatever
APAAATAA
```

### 输出样例

```
YES
YES
YES
YES
NO
NO
NO
NO
```

### 题目分析

这道题目是一道非常简单的题目，只需要按照题目所给的规则进行计算即可。

### 参考代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int p = s.indexOf('P');
            int t = s.indexOf('T');
            if (p == -1 || t == -1 || p == t - 1 || p == t + 1 || t == s.length() - 1) {
                System.out.println("NO");
                continue;
            }
            int a = p;
            int b = t - p - 1;
            int c = s.length() - t - 1;
            if (b == 0) {
                System.out.println("NO");
                continue;
            }
            if (a * b == c) {
               
