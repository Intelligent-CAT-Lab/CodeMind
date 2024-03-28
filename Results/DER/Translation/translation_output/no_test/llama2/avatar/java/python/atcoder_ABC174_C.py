<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 7;
        int res = 1;

        while (num < n) {
            num = num * 10 + 7;
            res++;
        }

        Set<Integer> set = new HashSet<>();

        while (true) {
            if (num % n == 0)
                break;
            num %= n;
            res++;
            if (!set.add(num)) {
                res = -1;
                break;
            }
            num = num * 10 + 7;
        }

        System.out.println(res);
    }
}
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解説

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解説

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解説

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解説

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解説

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解説

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set = set()

while True:
    if num % n == 0:
        break
    num = num % n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7
    set.add(num)

print(res)
```

### 解答

```python
import sys

n = int(sys.stdin.readline())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

set
