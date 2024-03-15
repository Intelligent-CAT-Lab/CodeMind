
```python
import sys

def solve(is, os):
    n, a, b = map(int, is.readline().split())
    os.write(str(min(a * n, b)) + '\n')

solve(sys.stdin, sys.stdout)
```

## 2. 1000

### 2.1. Problem

[1000](https://www.acmicpc.net/problem/1000)

### 2.2. Solution

```python
import sys

def solve(is, os):
    a, b = map(int, is.readline().split())
    os.write(str(a + b) + '\n')

solve(sys.stdin, sys.stdout)
```

## 3. 1001

### 3.1. Problem

[1001](https://www.acmicpc.net/problem/1001)

### 3.2. Solution

```python
import sys

def solve(is, os):
    a, b = map(int, is.readline().split())
    os.write(str(a - b) + '\n')

solve(sys.stdin, sys.stdout)
```

## 4. 1002

### 4.1. Problem

[1002](https://www.acmicpc.net/problem/1002)

### 4.2. Solution

```python
import sys
import math

def solve(is, os):
    t = int(is.readline())
    for _ in range(t):
        x1, y1, r1, x2, y2, r2 = map(int, is.readline().split())
        d = math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)
        if d == 0:
            if r1 == r2:
                os.write('-1\n')
            else:
                os.write('0\n')
        else:
            if d > r1 + r2 or d < abs(r1 - r2):
                os.write('0\n')
            elif d == r1 + r2 or d == abs(r1 - r2):
                os.write('1\n')
            else:
                os.write('2\n')

solve(sys.stdin, sys.stdout)
```

## 5. 1003

### 5.1. Problem

[1003](https://www.acmicpc.net/problem/1003)

### 5.2. Solution

```python
import sys

def solve(is, os):
    t = int(is.readline())
    for _ in range(t):
        n = int(is.readline())
        if n == 0:
            os.write('1 0\n')
        elif n == 1:
            os.write('0 1\n')
        else:
            a, b = 0, 1
            for _ in range(n - 1):
                a, b = b, a + b
            os.write(str(a) + ' ' + str(b) + '\n')

solve(sys.stdin, sys.stdout)
```

## 6. 1008

### 6.1. Problem

[1008](https://www.acmicpc.net/problem/1008)

### 6.2. Solution

```python
import sys

def solve(is, os):
    a, b = map(int, is.readline().split())
    os.write(str(a / b) + '\n')

solve(sys.stdin, sys.stdout)
```

## 7. 1009

### 7.1. Problem

[1009](https://www.acmicpc.net/problem/1009)

### 7.2. Solution

```python
import sys

def solve(is, os):
    t = int(is.readline())
    for _ in range(t):
        a, b = map(int, is.readline().split())
        os.write(str(pow(a, b, 10)) + '\n')

solve(sys.stdin, sys.stdout)
```

## 8. 1010

### 8.1. Problem

[1010](https://www.acmicpc.net/problem/1010)

### 8.2. Solution

```python
import sys

def solve(is, os):
    t = int(is.readline())
    for _ in range(t):
        n, m = map(int, is.readline().split())
        os.write(str(pow(m - n + 1, n, 1000000007)) + '\n')

solve(sys.stdin, sys.stdout)
```

## 9. 1011

### 9.1. Problem

[1011](https://www.acmicpc.net/problem/1011)

### 9.2. Solution

```python
import sys
import math

def solve(is, os):
    t = int(is.readline())
    for _ in range(t):
        x, y = map(int, is.readline().split())
        d = y - x
        n = int(math.sqrt(d))
        if n * n == d:
            os.write(str(2 * n - 1) + '\n')
        elif n * n < d and d <= n * n + n:
            os.write(str(2 * n) + '\n')
        else:
            os.write(str(2 * n + 1) + '\n')

solve(sys.stdin, sys.stdout)
```

## 10. 10171

### 10.1. Problem

[10171](https://www.acmicpc.net/problem/10171)

### 10.2. Solution

```python
import sys

def solve(is, os):
    os.write('\\    /\n')
    os.write(' )  ( \')\n')
    os.write('(  /  )\n')
    os.write(' \\(__)|\n')

solve(sys.stdin, sys.stdout)
```

## 11. 10172

### 11.1. Problem

[10172](https://www.acmicpc.net/problem/10172)

### 11.2. Solution

```python
import sys

def solve(is, os):
    os.write('|\\_/|\n')
    os.write('|q p|   /}\n')
    os.write('( 0 )\"\"\"\\\n')
    os.write('|\"^\"`    |\n')
    os.write('||_/=\\\\__|\n')

solve(sys.stdin, sys.stdout)
```

## 12. 10173

### 12.1. Problem

[10173](https://www.acmicpc.net/problem/10173)

### 12.2. Solution

```python
import sys

def solve(is, os):
    while True:
        s = is.readline().strip()
        if s == 'EOI':
            break
        if 'nemo' in s.lower():
            os.write('Found\n')
        else:
            os.write('Missing\n')

solve(sys.stdin, sys.stdout)
```

## 13. 10174

### 13.1. Problem

[10174](https://www.acmicpc.net/problem/10174)

### 13.2. Solution

```python
import sys

def solve(is, os):
    t
