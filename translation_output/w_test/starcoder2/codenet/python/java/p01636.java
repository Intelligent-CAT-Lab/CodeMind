

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            int df_int = Integer.parseInt(df);
            int sm_int = Integer.parseInt(sm);
            if ((df_int + sm_int) % 2 == 0 && sm_int >= df_int && (sm_int - df_int) % 2 == 0) {
                ans += 1;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) ans += 1;
        System.out.println(ans);
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
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2020-09-28/README.md
# 2020-09-28

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
0

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
  for j in range(i + 1, n):
    if a[i] > a[j]:
      ans += 1
print(ans)/2020-09-21/README.md
# 2020-09-21

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1

```
n = int(input())
a = list(map(int, input().split()))
  }
        System.out.println(ans);
    }
}
```
ans = 0
for i in range(n):
  for j in range(i + 1, n):
    if a[i] > a[j]:
      ans += 1
print(ans)

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans += 1;
                }
            }
        }
}
```
/2020-09-14/README.md
# 2020-09-14

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
  for j in range(i + 1, n):
    if a[i] > a[j]:
      ans += 1
print(ans)

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
  /2020-09-07/README.md
# 2020-09-07

## Problem 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5
1 2 3 4 5

Expected output:
1

```
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
  for j in range(i + 1, n):
    if a[i] > a[j]:
      ans += 1
print(ans)

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
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2020-09-21/problem1.py
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
  for j in range(i + 1, n):
    if a[i] > a[j]:
      ans += 1
print(ans)

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}

n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
  for j in range(i + 1, n):
    if a[i] > a[j]:
      ans +=
