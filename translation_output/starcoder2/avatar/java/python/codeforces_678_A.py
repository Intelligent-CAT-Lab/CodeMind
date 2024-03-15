
```python
n, k = map(int, input().split())
print((n // k + 1) * k)
```

## 2. 1000A - Bear and Big Brother

### 2.1. Problem

Limak is a little bear. He has a little brother called Bob.

Limak and Bob play a game. Limak writes down a number and Bob makes several (possibly zero) steps. In each step, Bob can multiply the number he has by 2 or by 3. Bob's goal is to make the number as large as possible.

Limak thinks that Bob plays optimally. That is, he thinks that Bob will never make a move that is strictly worse for Bob. Help Limak and tell him what the largest number Bob can make.

### 2.2. Input

The only line of the input contains two integers $a$ and $b$ ($1 \le a \le b \le 10$) — the number Limak starts with and the maximum allowed number.

### 2.3. Output

Print one integer — the largest number Bob can make.

### 2.4. Example

#### 2.4.1. Input

```
4 4
```

#### 2.4.2. Output

```
4
```

#### 2.4.3. Input

```
4 10
```

#### 2.4.4. Output

```
8
```

#### 2.4.5. Input

```
4 1000
```

#### 2.4.6. Output

```
512
```

### 2.5. Solution

```python
a, b = map(int, input().split())
while a < b:
    if a * 2 <= b:
        a *= 2
    else:
        a *= 3
print(a)
```

## 3. 1000B - Polycarp and Div 3

### 3.1. Problem

Polycarp is a student at the university. He is going to take part in a programming contest.

The contest consists of $n$ problems and Polycarp has already solved $k$ of them. He wants to participate in the contest, but he is afraid that he will not be able to solve the problems.

The jury made a decision that if a participant solves at least one problem, then he will be awarded a certificate.

The $i$-th problem is divisible by $a_i$.

Polycarp wants to know if he can take part in the contest (i.e. solve at least one problem) or he will have to watch the contest from home.

### 3.2. Input

The first line of the input contains two integers $n$ and $k$ ($1 \le n \le 100$, $0 \le k \le n$) — the number of problems in the contest and the number of problems Polycarp has already solved.

The second line of the input contains $n$ integers $a_1, a_2, \dots, a_n$ ($1 \le a_i \le 100$), where $a_i$ is the divisor of the $i$-th problem.

### 3.3. Output

Print "Yes" (without quotes) if Polycarp can take part in the contest. Otherwise, print "No" (without quotes).

You can print each letter in any case (upper or lower).

### 3.4. Example

#### 3.4.1. Input

```
3 1
2 3 4
```

#### 3.4.2. Output

```
Yes
```

#### 3.4.3. Input

```
3 2
2 3 4
```

#### 3.4.4. Output

```
Yes
```

#### 3.4.5. Input

```
3 3
2 3 4
```

#### 3.4.6. Output

```
No
```

### 3.5. Solution

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

if k == n:
    print('Yes')
else:
    for i in range(n):
        if a[i] % 3 == 0 or a[i] % 2 == 0:
            k += 1
            if k == n:
                print('Yes')
                break
    else:
        print('No')
```

## 4. 1000C - Three Indices

### 4.1. Problem

You are given an array $a$ consisting of $n$ integers.

Let's call a triplet of indices $(i, j, k)$ good if the following conditions are satisfied:

- $1 \le i < j < k \le n$;
- $a_i < a_j$ and $a_j > a_k$.

Your task is to find the number of good triplets.

### 4.2. Input

The first line of the input contains one integer $n$ ($3 \le n \le 2 \cdot 10^5$) — the number of elements in $a$.

The second line of the input contains $n$ integers $a_1, a_2, \dots, a_n$ ($1 \le a_i \le 10^9$), where $a_i$ is the $i$-th element of $a$.

### 4.3. Output

Print one integer — the number of good triplets.

### 4.4. Example

#### 4.4.1. Input

```
5
1 2 3 2 1
```

#### 4.4.2. Output

```
2
```

#### 4.4.3. Input

```
5
1 2 1 2 1
```

#### 4.4.4. Output

```
0
```

### 4.5. Solution

```python
n = int(input())
a = list(map(int, input().split()))

left = [0] * n
right = [0] * n

for i in range(1, n):
    if a[i - 1] < a[i]:
        left[i] = left[i - 1] + 1
    else:
        left[i] = 0

for i in range(n - 2, -1, -1):
    if a[i + 1] > a[i]:
        right[i] = right[i + 1] + 1
    else:
        right[i] = 0

ans = 0
for i in range(1, n - 1):
    ans += left[i] * right[i]

print(ans)
```

## 5. 1000D - Three Religions

### 5.1. Problem

There are $n$ cities in Berland, some pairs of cities are connected by bidirectional roads. It is possible to reach any city from any other city using these roads.

There are three religions in Berland: Judaism, Christianity and Islam. Each city has exactly one religion.

The cities of Berland are numbered from $1$ to $n$. The religion of the $i$-th city is denoted by $a_i$. If $a_i = 1$, then the $i$-th city is Jewish. If $a_i = 2$, then the $i$-th city is Christian. If $a_i = 3$, then the $i$-th city is Muslim.

The cities of Berland are very superstitious. That's why they believe that if two cities have the same religion, then they will attack each other.

The cities of Berland are very superstitious. That's why they believe that if two cities have the same religion, then they will attack each other.

The cities of Berland are very superstitious. That's why they believe that if two cities have the same religion, then they will attack each other.

The cities of Berland are very superstitious. That's why
