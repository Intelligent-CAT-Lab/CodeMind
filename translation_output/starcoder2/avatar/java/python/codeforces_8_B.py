
```
import sys

s = sys.stdin.readline().strip()
co = [[0 for i in range(101)] for j in range(2)]
x = 0
y = 0
k = 0
co[0][k] = x
co[1][k] = y
k += 1

for i in range(len(s)):
    if s[i] == 'L':
        x -= 1
    elif s[i] == 'R':
        x += 1
    elif s[i] == 'U':
        y += 1
    elif s[i] == 'D':
        y -= 1
    co[0][k] = x
    co[1][k] = y
    k += 1

flag = True
for i in range(k - 3):
    for j in range(i + 3, k):
        dx = co[0][i] - co[0][j]
        dy = co[1][i] - co[1][j]
        if dx < 0:
            dx *= (-1)
        if dy < 0:
            dy *= (-1)
        if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
            flag = False
            break
    if not flag:
        break

if flag:
    print("OK")
else:
    print("BUG")
```

## 9. [Codeforces 1005A](https://codeforces.com/problemset/problem/1005/A)

### 9.1. Description

You are given a sequence of positive integers $a_1, a_2, \dots, a_n$.

You have to perform the following operation exactly once: choose an element of the sequence and delete it; after that, if the remaining sequence is non-empty, choose the smallest element among the remaining elements and delete it too.

For example, if the sequence is $[2, 4, 1, 5, 3]$, then you can delete the element $5$, then the sequence will be $[2, 4, 1, 3]$ and you will delete the element $1$.

After performing the operation, print the number of elements deleted from the sequence.

### 9.2. Input

The first line of the input contains one integer $n$ ($1 \le n \le 100$) — the number of elements in $a$.

The second line of the input contains $n$ integers $a_1, a_2, \dots, a_n$ ($1 \le a_i \le 100$) — the elements of $a$.

### 9.3. Output

Print one integer — the number of elements deleted from the sequence.

### 9.4. Examples

#### 9.4.1. input
```
5
2 4 1 5 3
```

#### 9.4.2. output
```
2
```

#### 9.4.3. input
```
4
1 2 3 4
```

#### 9.4.4. output
```
4
```

### 9.5. Note

In the first example, the answer is $2$, because you can delete the elements $5$ and $1$.

In the second example, you can delete all the elements.

### 9.6. Solution

```
import sys

n = int(sys.stdin.readline().strip())
a = list(map(int, sys.stdin.readline().strip().split()))

ans = 0
for i in range(n):
    if i == 0 or a[i] < a[i - 1]:
        ans += 1

print(ans)
```

## 10. [Codeforces 1005B](https://codeforces.com/problemset/problem/1005/B)

### 10.1. Description

You are given two strings $s$ and $t$.

In one operation, you can delete the last character of the string.

Your task is to find the minimum number of operations needed to make the strings equal.

### 10.2. Input

The first line of the input contains a string $s$ ($1 \le |s| \le 100$), and the second line of the input contains a string $t$ ($1 \le |t| \le 100$).

Both strings consist of lowercase Latin letters.

### 10.3. Output

Print one integer — the minimum number of operations needed to make the strings equal.

### 10.4. Examples

#### 10.4.1. input
```
abacaba
abacab
```

#### 10.4.2. output
```
2
```

#### 10.4.3. input
```
aaaaa
aaaa
```

#### 10.4.4. output
```
4
```

### 10.5. Note

In the first example, you can delete the last two characters of the string $s$.

In the second example, you can delete all characters of the string $s$.

### 10.6. Solution

```
import sys

s = sys.stdin.readline().strip()
t = sys.stdin.readline().strip()

ans = 0
i = len(s) - 1
j = len(t) - 1
while i >= 0 and j >= 0:
    if s[i] == t[j]:
        i -= 1
        j -= 1
    else:
        break

ans = len(s) - i - 1 + len(t) - j - 1
print(ans)
```

## 11. [Codeforces 1005C](https://codeforces.com/problemset/problem/1005/C)

### 11.1. Description

You are given an array $a$ consisting of $n$ integers.

You have to find the maximum number of elements in a subsegment of the array $a$ such that the sum of these elements is divisible by $3$.

### 11.2. Input

The first line of the input contains one integer $n$ ($1 \le n \le 2 \cdot 10^5$) — the number of elements in $a$.

The second line of the input contains $n$ integers $a_1, a_2, \dots, a_n$ ($1 \le a_i \le 10^9$) — the elements of $a$.

### 11.3. Output

Print one integer — the maximum number of elements in a subsegment of the array $a$ such that the sum of these elements is divisible by $3$.

### 11.4. Examples

####
