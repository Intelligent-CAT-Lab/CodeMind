
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x0 = 0, y0 = 0, gcd = 0;
        if (a < b) {
            y0 = 1;
            x0 = 0;
            gcd = b;
        } else {
            x0 = 1;
            y0 = 0;
            gcd = a;
        }
        int dx = b / gcd;
        int dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        int x = x0;
        int y = y0;
        int mag = Math.abs(x) + Math.abs(y);
        while (true) {
            int x1 = x + dx;
            int y1 = y + dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }
        while (true) {
            int x1 = x - dx;
            int y1 = y - dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }
        System.out.println(x + " " + y);
    }
}
```

## 1000. 1000

### 题目描述

给定一个整数，请将该数各个位上数字反转得到一个新数。新数也应满足整数的常见形式，即除非给定的原数为零，否则反转后得到的新数的最高位数字不应为零（参见样例2）。

### 输入格式：

输入在一行中给出一个整数，如果是负数，则在一行中给出这个负整数的反转的正整数，即令该负整数的正数部分反转。

### 输出格式：

在一行中输出反转后的新整数。

### 输入样例：

-700000

### 输出样例：

7

### 思路

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            n = -n;
        }
        int res = 0;
        while (n != 0) {
            res = res * 10 + n % 10;
            n /= 10;
        }
        System.out.println(res);
    }
}
```

## 1001. 害死人不偿命的(3n+1)猜想

### 题目描述

卡拉兹(Callatz)猜想：

对任何一个自然数n，如果它是偶数，那么把它砍掉一半；如果它是奇数，那么把(3n+1)砍掉一半。这样一直反复砍下去，最后一定在某一步得到n=1。卡拉兹在1950年的世界数学家大会上公布了这个猜想，传说当时耶鲁大学师生齐动员，拼命想证明这个貌似很傻很天真的命题，结果闹得学生们无心学业，一心只证(3n+1)，以至于有人说这是一个阴谋，卡拉兹是在蓄意延缓美国数学界教学与科研的进展……

我们今天的题目不是证明卡拉兹猜想，而是对给定的任一不超过1000的正整数n，简单地数一下，需要多少步（砍几下）才能得到n=1？

### 输入格式：

每个测试输入包含1个测试用例，即给出自然数n的值。

### 输出格式：

输出从n计算到1需要的步数。

### 输入样例：

3

### 输出样例：

5

### 思路

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

### 题目描述

读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

### 输入格式：

每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10100。

### 输出格式：

在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。

### 输入样例：

1234567890987654321123456789

### 输出样例：

yi san wu

### 思路

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
        String[] str = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        String res = "";
        while (sum != 0) {
            res = str[sum % 10] + " " + res;
            sum /= 10;
        }
       
