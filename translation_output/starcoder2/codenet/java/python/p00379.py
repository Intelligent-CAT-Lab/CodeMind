
```
import math

a = int(input())
n = int(input())
m = int(input())
max = int(math.pow(m, 1 / n))

ans = 0
for i in range(1, max + 1):
    x = int(math.pow(i, n))
    str = str(x)
    y = 0
    for j in range(0, len(str)):
        y += int(str[j])

    if y + a == i:
        ans += 1

print(ans)
```

## 00380
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00380{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i % 2 == 1 && j % 2 == 1) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
m = int(input())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1 and j % 2 == 1:
            ans += 1

print(ans)
```

## 00381
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00381{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i % 2 == 0 && j % 2 == 0) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
m = int(input())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 0 and j % 2 == 0:
            ans += 1

print(ans)
```

## 00382
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00382{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i % 2 == 1 && j % 2 == 0) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
m = int(input())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1 and j % 2 == 0:
            ans += 1

print(ans)
```

## 00383
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00383{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i % 2 == 0 && j % 2 == 1) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
m = int(input())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 0 and j % 2 == 1:
            ans += 1

print(ans)
```

## 00384
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00384{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i % 2 == 1 && j % 2 == 1) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
m = int(input())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1 and j % 2 == 1:
            ans += 1

print(ans)
```

## 00385
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00385{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                if(i % 2 == 0 && j % 2 == 0) {
                    ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}

```

python code:
```
n = int(input())
m = int(input())

ans = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 0 and j % 2 == 0:
            ans += 1

print(ans)
```

## 00386
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00386{
    public static void main(String[] args) {
