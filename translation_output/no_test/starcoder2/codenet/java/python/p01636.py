
```
a = input()
ans = 0
for i in range(len(a)):
    head = a[:i]
    tail = a[i:]
    if head == "":
        h = 0
    elif head == "-":
        continue
    else:
        h = int(head)
    if tail == "":
        t = 0
    elif tail[0] == "0":
        continue
    else:
        t = int(tail)
    if t < 0:
        continue
    if h > t:
        continue
    if (h + t) % 2 != 0:
        continue
    if (t - h) % 2 != 0:
        continue
    ans += 1
print(ans)
```

## 01637

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01637 {

    Scanner sc = new Scanner(System.in);
    int INF = 1 << 28;
    double EPS = 1e-10;

    public static void main(String[] args) {
        new p01637().run();
    }

    void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
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
a = [int(x) for x in input().split()]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

## 01638

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01638 {

    Scanner sc = new Scanner(System.in);
    int INF = 1 << 28;
    double EPS = 1e-10;

    public static void main(String[] args) {
        new p01638().run();
    }

    void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
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
a = [int(x) for x in input().split()]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

## 01639

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01639 {

    Scanner sc = new Scanner(System.in);
    int INF = 1 << 28;
    double EPS = 1e-10;

    public static void main(String[] args) {
        new p01639().run();
    }

    void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
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
a = [int(x) for x in input().split()]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

## 01640

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01640 {

    Scanner sc = new Scanner(System.in);
    int INF = 1 << 28;
    double EPS = 1e-10;

    public static void main(String[] args) {
        new p01640().run();
    }

    void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
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
a = [int(x) for x in input().split()]
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            ans += 1
print(ans)
```

## 01641

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01641 {

    Scanner sc = new Scanner(System.in);
    int INF = 1 << 28;
    double EPS = 1e-10;

    public static void main(String[] args) {
        new p01641().run();
    }

    void run() {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]
