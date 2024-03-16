
```java

```


```

java code:
```java

```
/atcoder/abc/abc170/abc170_d/README.md
# AtCoder Beginner Contest 170 D - Not Divisible

## 問題文

整数の列が与えられます。
この列の中で、どの整数もその他の整数の約数ではないような整数の個数を求めてください。

## 制約

- 1≤N≤2×10^5
- 1≤A_i≤10^9
- 同じ整数が複数回与えられることはない

## 解法

## 解答

```python
import sys
input = sys.stdin.readline

N = int(input())
A = list(map(int,input().split()))

A.sort()

ans = 0

for i in range(N):
    if i == N-1 or A[i] != A[i+1]:
        ans += 1
    else:
        continue
    for j in range(i+1,N):
        if A[j] % A[i] == 0:
            ans -= 1
            break

print(ans)/atcoder/abc/abc170/abc170_c/README.md
# AtCoder Beginner Contest 170 C - Forbidden List

## 問題文

整数 X が与えられます。
整数 X からちょうど K 個の整数を引いた値が、整数 A_1,A_2,...,A_N のいずれかと等しくなるような最小の整数 X を求めてください。

## 制約

- 1≤N≤10^5
- 1≤K≤10^5
- 1≤A_i≤10^9
- 入力はすべて整数である
- 同じ整数が複数回与えられることはない

## 解法

## 解答

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X+1):
    if i not in A:
        print(i)
        break

```

java code:
```java

```

## 解説

```python
import sys
input = sys.stdin.readline

N,X = map(int,input().split())
A = list(map(int,input().split()))

A.sort()

for i in range(X
