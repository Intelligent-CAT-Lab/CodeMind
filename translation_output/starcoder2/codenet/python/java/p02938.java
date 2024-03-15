
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int MOD = 1000000007;
        int ans = 0;
        if(L > R) ans = 0;
        else if(L == 1) ans = (1 + solve(2, R)) % MOD;
        else ans = (solve(L/2,(R-1)/2) + solve((L+1)/2,R/2) + solve((L+1)/2,(R-1)/2)) % MOD;
        System.out.println(ans);
    }
}
```


```

java code:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(a[i] == a[j]) cnt++;
            }
            if(cnt > n/2) ans = a[i];
        }
        System.out.println(ans);
    }
}
```
/2020-09-28/README.md
# 2020-09-28

## 1.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
  cnt = 0
  for j in range(n):
    if a[i] == a[j]:
      cnt += 1
  if cnt > n//2:
    ans = a[i]
print(ans)

```

java code:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(a[i] == a[j]) cnt++;
            }
            if(cnt > n/2) ans = a[i];
        }
        System.out.println(ans);
    }
}
```
/2020-09-29/README.md
# 2020-09-29

## 1.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
  cnt = 0
  for j in range(n):
    if a[i] == a[j]:
      cnt += 1
  if cnt > n//2:
    ans = a[i]
print(ans)

```

java code:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(a[i] == a[j]) cnt++;
            }
            if(cnt > n/2) ans = a[i];
        }
        System.out.println(ans);
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
  cnt = 0
  for j in range(n):
    if a[i] == a[j]:
      cnt += 1
  if cnt > n//2:
    ans = a[i]
print(ans)/2020-09-25/README.md
# 2020-09-25

## 1.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
  cnt = 0
  for j in range(n):
    if a[i] == a[j]:
      cnt += 1
  if cnt > n//2:
    ans = a[i]
print(ans)

```

java code:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(a[i] == a[j]) cnt++;
            }
            if(cnt > n/2) ans = a[i];
        }
        System.out.println(ans);
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
a = list(map(int,input().split()))
ans = 0
for i in range(n):
  cnt = 0
  for j in range(n):
    if a[i] == a[j]:
      cnt += 1
  if cnt > n//2:
    ans = a[i]
print(ans)

```

java code:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < n; j++) {
                if(a[i] == a[j]) cnt++;
            }
            if(cnt > n
