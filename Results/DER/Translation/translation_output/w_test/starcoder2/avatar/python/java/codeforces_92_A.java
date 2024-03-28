

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int i = 0;
        while (true) {
            if (i + 1 > m) {
                int ans = m;
                System.out.println(ans);
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
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
        int i = 0;
        while (true) {
            if (i + 1 > m) {
                int ans = m;
                System.out.println(ans);
                break;
            }
            m -= i + 1;
            i += 1;
            i %= n;
        }
    }
}
```
/README.md
# 2020-2-OOP-Java-2

## 1. 题目描述

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
24 7440

Expected output:
9

```
import sys
input = sys . stdin . readline
n , m = map ( int , input ( ) . split ( ) )
i = 0
while True :
    if i + 1 > m :
        ans = m
        break
    m -= i + 1
    i += 1
    i %= n
print ( ans )

