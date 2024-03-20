
```python
a = input()
ans = 0
for i in range(len(a)):
    head = a[:i]
    tail = a[i:]
    h, t = 0, 0
    if head == '':
        h = 0
    elif head == '-':
        continue
    else:
        h = int(head)
    if tail == '':
        t = 0
    elif tail[0] == '0':
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

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1

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
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    if n % i == 0:
        ans += 1
print(ans)
```

## 01638

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1

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
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    if n % i == 0:
        if i % 2 == 0:
            ans += 1
print(ans)
```

## 01639

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1

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
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 == 1) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    if n % i == 0:
        if i % 2 == 1:
            ans += 1
print(ans)
```

## 01640

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1

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
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 3 == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    if n % i == 0:
        if i % 3 == 0:
            ans += 1
print(ans)
```

## 01641

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1

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
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 3 == 1) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    if n % i == 0:
        if i % 3 == 1:
            ans += 1
print(ans)
```

## 01642


