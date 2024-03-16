
```
s1 = input()
won  = 0
lose = 0
g = 0
p = 0

for i in range(len(s1)):
    if s1[i] == 'g':
        if p == g:
            g += 1
        elif p < g:
            p += 1
            won += 1
    elif s1[i] == 'p':
        if p == g:
            g += 1
            lose += 1
        elif p < g:
            p += 1
        else:
            g += 1
            lose += 1

print(won-lose)
```

## 4. 1000000007

### 4.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 4.2. Input

The first line contains the number of test cases T. Each of the next T lines contains a number n.

### 4.3. Output

Output T lines, one for each test case, containing the required answer for the corresponding test case.

### 4.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 4.5. Sample Input

```
3
4
5
6
```

### 4.6. Sample Output

```
1
2
3
```

### 4.7. Explanation

For the first test case, 4 can only be written as 1+2+1.

For the second test case, 5 can be written as 1+2+2 or 2+3.

For the third test case, 6 can be written as 1+2+3, 2+4 or 3+3.

### 4.8. Solution

```
def solve(n):
    ans = 0
    for i in range(1, n+1):
        if n % i == 0:
            ans += 1
    return ans

t = int(input())
for i in range(t):
    n = int(input())
    print(solve(n))
```

## 5. 1000000007

### 5.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 5.2. Input

The first line contains the number of test cases T. Each of the next T lines contains a number n.

### 5.3. Output

Output T lines, one for each test case, containing the required answer for the corresponding test case.

### 5.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 5.5. Sample Input

```
3
4
5
6
```

### 5.6. Sample Output

```
1
2
3
```

### 5.7. Explanation

For the first test case, 4 can only be written as 1+2+1.

For the second test case, 5 can be written as 1+2+2 or 2+3.

For the third test case, 6 can be written as 1+2+3, 2+4 or 3+3.

### 5.8. Solution

```
def solve(n):
    ans = 0
    for i in range(1, n+1):
        if n % i == 0:
            ans += 1
    return ans

t = int(input())
for i in range(t):
    n = int(input())
    print(solve(n))
```

## 6. 1000000007

### 6.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 6.2. Input

The first line contains the number of test cases T. Each of the next T lines contains a number n.

### 6.3. Output

Output T lines, one for each test case, containing the required answer for the corresponding test case.

### 6.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 6.5. Sample Input

```
3
4
5
6
```

### 6.6. Sample Output

```
1
2
3
```

### 6.7. Explanation

For the first test case, 4 can only be written as 1+2+1.

For the second test case, 5 can be written as 1+2+2 or 2+3.

For the third test case, 6 can be written as 1+2+3, 2+4 or 3+3.

### 6.8. Solution

```
def solve(n):
    ans = 0
    for i in range(1, n+1):
        if n % i == 0:
            ans += 1
    return ans

t = int(input())
for i in range(t):
    n = int(input())
    print(solve(n))
```

## 7. 1000000007

### 7.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 7.2. Input

The first line contains the number of test cases T. Each of the next T lines contains a number n.

### 7.3. Output

Output T lines, one for each test case, containing the required answer for the corresponding test case.

### 7.4. Constraints

1 ≤ T ≤ 100000

1 ≤ n ≤ 1000000000

### 7.5. Sample Input

```
3
4
5
6
```

### 7.6. Sample Output

```
1
2
3
```

### 7.7. Explanation

For the first test case, 4 can only be written as 1+2+1.

For the second test case, 5 can be written as 1+2+2 or 2+3.

For the third test case, 6 can be written as 1+2+3, 2+4 or 3+3.

### 7.8. Solution

```
def solve(n):
    ans = 0
    for i in range(1, n+1):
        if n % i == 0:
            ans += 1
    return ans

t = int(input())
for i in range(t):
    n = int(input())
    print(solve(n))
```

## 8. 1000000007

### 8.1. Description

Given a number n, find the number of ways to write n as a sum of consecutive positive integers.

### 8.2. Input

The first line contains the number of test cases T. Each of the next T lines contains a number n.

### 8.3. Output

Output T lines, one for each test case, containing the required answer for the corresponding test case.

### 8.4. Constraints

1 ≤ T ≤ 10000
