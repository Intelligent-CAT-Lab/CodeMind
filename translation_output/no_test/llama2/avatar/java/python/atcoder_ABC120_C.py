<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC120_C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] s1 = sc.next().toCharArray();
        int ans = 0;
        int c1 = 0;
        int c0 = 0;
        
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] == '1') {
                if (c0 > 0) {
                    c0--;
                    ans++;
                } else {
                    c1++;
                }
            } else {
                if (c1 > 0) {
                    c1--;
                    ans++;
                } else {
                    c0++;
                }
            }
        }
        
        System.out.println(ans * 2);
    }
}
```

### 解答

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解説

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解答

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解説

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解答

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解説

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解答

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解説

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解答

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解説

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解答

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解説

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

### 解答

```python
import sys

s1 = sys.stdin.readline().strip()

c0 = 0
c1 = 0

for c in s1:
    if c == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 
