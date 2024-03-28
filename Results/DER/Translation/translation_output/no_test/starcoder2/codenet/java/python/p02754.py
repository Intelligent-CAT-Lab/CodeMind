
```
import sys

class FastScanner:
    def __init__(self, stream):
        self.stream = stream
        self.st = None

    def next(self):
        while self.st is None or not self.st:
            self.st = input().split()
        self.st, res = self.st[1:], self.st[0]
        return res

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

sc = FastScanner(sys.stdin)
n = sc.nextLong()
a = sc.nextLong()
b = sc.nextLong()
ans = 0
ans = (n // (a + b)) * a + min(a, n % (a + b))
print(ans)
```
/problems/p00001.md
# Problem 1

## Problem Description

Given two numbers, a and b, find their sum.

## Input

The first line of the input contains two integers a and b (1 ≤ a, b ≤ 1000).

## Output

Print one 

## Sample Input

```
1 2
```

## Sample Output

```
3
```

## Solution

```python
a, b = map(int, input().split())
print(a + b)
```
integer — the sum of a and b./problems/p00002.md
# Problem 2

## Problem Description

Given two numbers, a and b, find their sum.

## Input

The first line of the input contains two integers a and b (1 ≤ a, b ≤ 1000).

## Output

Print one integer — the sum of a and b.

## Sample Input

```
1 2
```

## Sample Output

```
3
```

## Solution

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 2

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 3

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 4

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 5

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 6

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 7

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 8

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 9

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 10

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 11

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 12

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 13

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 14

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 15

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 16

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 17

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 18

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 19

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 20

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 21

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 22

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 23

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 24

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 25

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 26

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 27

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 28

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 29

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 30

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 31

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 32

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 33

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 34

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 35

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 36

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 37

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 38

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 39

```python
a, b = map(int, input().split())
print(a + b)
```

## Solution 40

```python
a, b = map(int, input().split())
print(a + b)
