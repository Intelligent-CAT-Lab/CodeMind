

```python
import sys

s = sys.stdin.readline().strip()
last = [-1] * 26
for i in range(len(s)):
    ch = ord(s[i]) - ord('a')
    if last[ch] >= 0 and i - last[ch] < 3:
        print(last[ch] + 1, i + 1)
        break
    last[ch] = i
else:
    print("-1 -1")
```

## 04027

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.Scanner;

public class p04027 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = scanner.nextInt();
    }
    int[] c = new int[n + m];
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (a[i] < b[j]) {
        c[k++] = a[i++];
      } else {
        c[k++] = b[j++];
      }
    }
    while (i < n) {
      c[k++] = a[i++];
    }
    while (j < m) {
      c[k++] = b[j++];
    }
    System.out.println(c[n + m - 1]);
  }
}

```

python code:

```python
import sys

n, m = map(int, sys.stdin.readline().split())
a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))
c = []
i = j = 0
while i < n and j < m:
    if a[i] < b[j]:
        c.append(a[i])
        i += 1
    else:
        c.append(b[j])
        j += 1
c.extend(a[i:])
c.extend(b[j:])
print(c[-1])
```

## 04028

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.Scanner;

public class p04028 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = scanner.nextInt();
    }
    int[] c = new int[n + m];
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (a[i] < b[j]) {
        c[k++] = a[i++];
      } else {
        c[k++] = b[j++];
      }
    }
    while (i < n) {
      c[k++] = a[i++];
    }
    while (j < m) {
      c[k++] = b[j++];
    }
    System.out.println(c[n + m - 1]);
  }
}

```

python code:

```python
import sys

n, m = map(int, sys.stdin.readline().split())
a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))
c = []
i = j = 0
while i < n and j < m:
    if a[i] < b[j]:
        c.append(a[i])
        i += 1
    else:
        c.append(b[j])
        j += 1
c.extend(a[i:])
c.extend(b[j:])
print(c[-1])
```

## 04029

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.Scanner;

public class p04029 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = scanner.nextInt();
    }
    int[] c = new int[n + m];
    int i = 0, j = 0, k = 0;
    while (i < n && j < m) {
      if (a[i] < b[j]) {
        c[k++] = a[i++];
      } else {
        c[k++] = b[j++];
      }
    }
    while (i < n) {
      c[k++] = a[i++];
    }
    while (j < m) {
      c[k++] = b[j++];
    }
    System.out.println(c[n + m - 1]);
  }
}

```

python code:

```python
import sys

n, m = map(int, sys.stdin.readline().split())
a = list(map(int, sys.stdin.readline().split()))
b = list(map(int, sys.stdin.readline().split()))
c = []
i = j = 0
while i < n and j < m:
    if a[i] < b[j]:
        c.append(a[i])
        i += 1
    else:
        c.append(b[j])
        j += 1
c.extend(a[i:])
c.extend(b[j:])
print(c[-1])
```

## 04030

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
10

```
import java.util.Scanner;

public class p04030 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    int[] b = new int[m];
    for (int i = 0; i < m; i++) {
      b[i] = scanner.nextInt();
    }
    int[] c = new int[n + m];
    int i = 0, j = 0, k = 0;
   
