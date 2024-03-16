
```python
a, b = map(int, input().split())
kuti = 1
tap = 0

while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

print(tap)
```

## 2.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC139_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(sc.next());
        }
        
        int max = 0;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (h[i] >= h[i + 1]) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        
        System.out.println(max);
    }
}
```

python code:
```python
n = int(input())
h = list(map(int, input().split()))

max = 0
count = 0
for i in range(n - 1):
    if h[i] >= h[i + 1]:
        count += 1
    else:
        max = max if max > count else count
        count = 0
max = max if max > count else count

print(max)
```

## 3.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC139_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        
        long ans = n * (n - 1) / 2;
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())

ans = n * (n - 1) // 2
print(ans)
```

## 4.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC139_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[n][n - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                a[i][j] = Integer.parseInt(sc.next()) - 1;
            }
        }
        
        int[] last = new int[n];
        for (int i = 0; i < n; i++) {
            last[i] = a[i][0];
        }
        
        int day = 0;
        while (true) {
            int[] next = new int[n];
            for (int i = 0; i < n; i++) {
                if (last[i] == -1) {
                    continue;
                }
                int j = last[i];
                next[j] = a[j][i];
            }
            if (next[0] == -1) {
                break;
            }
            for (int i = 0; i < n; i++) {
                last[i] = next[i];
            }
            day++;
        }
        
        System.out.println(day);
    }
}
```

python code:
```python
n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]

last = [a[i][0] for i in range(n)]

day = 0
while True:
    next = [-1] * n
    for i in range(n):
        if last[i] == -1:
            continue
        j = last[i]
        next[j] = a[j][i]
    if next[0] == -1:
        break
    for i in range(n):
        last[i] = next[i]
    day += 1

print(day)
```
 1000000007

print(ans)
```
/atcoder/ABC138/README.md
# AtCoder Beginner Contest 138

## 1.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC138_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        String s = sc.next();
        
        if (a >= 3200) {
            System.out.println(s);
        } else {
            System.out.println("red");
        }
    }
}
```

python code:
```python
a = int(input())
s = input()

if a >= 3200:
    print(s)
else:
    print('red')
```

## 2.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC138_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        
        double ans = 0;
        for (int i = 0; i < n; i++) {
            ans += 1.0 / a[i];
        }
        ans = 1.0 / ans;
        
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
a = list(map(int, input().split()))

ans = 0
for i in range(n):
    ans += 1 / a[i]
ans = 1 / ans

print(ans)
```

## 3.
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC138_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = Integer.parseInt(sc.next());
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (v[i] > v[j]) {
                    int tmp = v[i];
                    v[i] = v[j];
                    v[j] = tmp;
                }
            }
        }
        
        double ans = v[0];
        for (int i = 1; i < n; i++) {
            ans = (ans + v[i]) / 2;
        }
        
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
v = list(map(int, input().split()))

for i in range(n - 1):
    for j in range(i + 1, n):
        if v[i] > v[j]:
            v[i], v[j] = v[j], v[i]

ans = v[0]
for i in range(1, n):
    ans = (ans + v[i]) / 2

print(ans)
```
