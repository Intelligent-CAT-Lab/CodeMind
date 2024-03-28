
```

```

```

java code:
```

```/solutions/1000.md
# 1000. A+B

[http://acm.hdu.edu.cn/showproblem.php?pid=1000](http://acm.hdu.edu.cn/showproblem.php?pid=1000)

* 时间限制：1000 ms
* 内存限制：65536 kB
* 代码长度限制：8000 B

## 题目描述

Calculate a+b

## 输入

Two integer a,b (0<=a,b<=10)

## 输出

Output a+b

## 样例输入

```
1 2
```

## 样例输出

```
3/solutions/1001.md
# 1001. Sum Problem

[http://acm.hdu.edu.cn/showproblem.php?pid=1001](http://acm.hdu.edu.cn/showproblem.php?pid=1001)

* 时间限制：1000 ms
* 内存限制：65536 kB
* 代码长度限制：8000 B

## 题目描述

Hey, welcome to HDOJ(Hangzhou Dianzi University Online Judge).

In this problem, your task is to calculate SUM(n) = 1 + 2 + 3 + ... + n.

## 输入

The input will consist of a series of integers n, one integer per line.

## 输出

For each case, output SUM(n) in one line, followed by a blank line. You may assume the result will be in the range of 32-bit signed integer.

## 样例输入

```
1
100
```

## 样例输出

```
1

5050
```

java code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
```/solutions/1002.md
# 1002. A + B Problem II

[http://acm.hdu.edu.cn/showproblem.php?pid=1002](http://acm.hdu.edu.cn/showproblem.php?pid=1002)

* 时间限制：1000 ms
* 内存限制：65536 kB
* 代码长度限制：8000 B

## 题目描述

I have a very simple problem for you. Given two integers A and B, your job is to calculate the Sum of A + B.

## 输入

The first line of the input contains an integer T(1<=T<=20) which means the number of test cases. Then T lines follow, each line consists of two positive integers, A and B. Notice that the integers are very large, that means you should not process them by using 32-bit integer. You may assume the length of each integer will not exceed 1000.

## 输出

For each test case, you should output two lines. The first line is "Case #:", # means the number of the test case. The second line is the an equation "A + B = Sum", Sum means the result of A + B. Note there are some spaces int the equation. Output a blank line between two test cases.

## 样例输入

```
2
1 2
112233445566778899 998877665544332211
```

## 样例输出

```
Case 1:
1 + 2 = 3

Case 2:
112233445566778899 + 998877665544332211 = 1111111111111111110
```

java code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            String a = sc.next();
            String b = sc.next();
            int len = Math.max(a.length(), b.length());
            a = addZero(a, len);
            b = addZero(b, len);
            int[] c = new int[len + 1];
            for (int j = len - 1; j >= 0; j--) {
                c[j] = a.charAt(j) - '0' + b.charAt(j) - '0';
                if (c[j] >= 10) {
                    c[j] -= 10;
                    c[j - 1]  }
        return s;
    }
}
```++;
                }
            }
            System.out.println("Case " + i + ":");
            System.out.println(a + " + " + b + " = " + toString(c));
            if (i != t) {
                System.out.println();
            }
        }
    }

    private static String addZero(String s, int len) {
        while (s.length() < len) {
            s = "0" + s;
        }
        return s;
    }

    private static String toString(int[] c) {
        String s = "";
        for (int i : c) {
            s += i;
      /solutions/1003.md
# 1003. Max Sum

[http://acm.hdu.edu.cn/showproblem.php?pid=1003](http://acm.hdu.edu.cn/showproblem.php?pid=1003)

* 时间限制：1000 ms
* 内存限制：65536 kB
* 代码长度限制：8000 B

## 题目描述

Given a sequence a[1],a[2],a[3]......a[n], your job is to calculate the max sum of a sub-sequence. For example, given (6,-1,5,4,-7), the max sum in this sequence is 6 + (-1) + 5 + 4 = 14.

## 输入

The first line of the input contains an integer T(1<=T<=20) which means the number of test cases. Then T lines follow, each line starts with a number N(1<=N<=100000), then N integers followed(all the integers are between -1000 and 1000).

## 输出

For each test case, you should output two lines. The first line is "Case #:", # means the number of the test case. The second line contains three integers, the Max Sum in the sequence, the start position of the sub-sequence, the end position of the sub-sequence. If there are more than one result, output the first one. Output a blank line between two cases.

## 样例输入

```
2
5 6 -1 5 4 -7
7 0 6 -1 1 -6 7 -5
```

## 样
