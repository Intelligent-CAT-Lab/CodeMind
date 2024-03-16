<s> Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p02584 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = Long.parseLong(scan.next());
        long k = Long.parseLong(scan.next());
        long d = Long.parseLong(scan.next());
        scan.close();

        long ans = 0;
        long absX = Math.abs(x);
        if (absX / d >= k) {
            ans = absX - k * d;
        } else {
            long sho = absX / d;
            long amari = absX % d;
            if ((k - sho) % 2 == 0) {
                ans = amari;
            } else {
                ans = d - amari;
            }
        }

        System.out.println(ans);
    }
}

```

### 解答

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解説

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解答

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解説

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解答

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解説

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解答

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解説

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解答

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解説

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解答

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解説

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(x) / d >= k:
    ans = abs(x) - k * d
else:
    sho = abs(x) / d
    amari = abs(x) % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

### 解答

```python
import sys

x = int(sys.stdin.readline())
k = int(sys.stdin.readline())
d = int(sys.stdin.readline())

if abs(
