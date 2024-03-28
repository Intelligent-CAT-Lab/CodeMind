

```python
MOD = 1000000007

first_N, first_M = map(int, input().split())

if first_N == 1:
    print((first_M+1)%MOD)
else:
    if (first_M+1)%(first_N-1) == 0:
        first_limit = (first_M+1)//(first_N-1)-1
    else:
        first_limit = (first_M+1)//(first_N-1)

    if first_limit <= 0:
        print((first_M+1)%MOD)
    else:
        A = (first_M+1) + 2*(first_M+1)*first_limit - (first_N-1)*first_limit*(first_limit+1)
        print(A%MOD)
```

## 2. 1000000007

### 2.1. Description

Given a number N, find the sum of all the numbers from 1 to N.

### 2.2. Input

The first line of the input contains an integer T, denoting the number of test cases.

The next T lines contain a single integer N.

### 2.3. Output

For each test case, print the sum of all the numbers from 1 to N.

### 2.4. Constraints

1 <= T <= 100000

1 <= N <= 1000000000

### 2.5. Sample Input

```
2
3
4
```

### 2.6. Sample Output

```
6
10
```

### 2.7. Explanation

For the first test case, the sum of all the numbers from 1 to 3 is 6.

For the second test case, the sum of all the numbers from 1 to 4 is 10.

### 2.8. Solution

```python
MOD = 1000000007

T = int(input())

for i in range(T):
    N = int(input())
    print((N*(N+1))//2%MOD)
```

## 3. 1000000008

### 3.1. Description

Given a number N, find the sum of all the numbers from 1 to N.

### 3.2. Input

The first line of the input contains an integer T, denoting the number of test cases.

The next T lines contain a single integer N.

### 3.3. Output

For each test case, print the sum of all the numbers from 1 to N.

### 3.4. Constraints

1 <= T <= 100000

1 <= N <= 1000000000000000000

### 3.5. Sample Input

```
2
3
4
```

### 3.6. Sample Output

```
6
10
```

### 3.7. Explanation

For the first test case, the sum of all the numbers from 1 to 3 is 6.

For the second test case, the sum of all the numbers from 1 to 4 is 10.

### 3.8. Solution

```python
MOD = 1000000007

T = int(input())

for i in range(T):
    N = int(input())
    print((N*(N+1))//2%MOD)
```

## 4. 1000000009

### 4.1. Description

Given a number N, find the sum of all the numbers from 1 to N.

### 4.2. Input

The first line of the input contains an integer T, denoting the number of test cases.

The next T lines contain a single integer N.

### 4.3. Output

For each test case, print the sum of all the numbers from 1 to N.

### 4.4. Constraints

1 <= T <= 100000

1 <= N <= 10000000000000000000000000000

### 4.5. Sample Input

```
2
3
4
```

### 4.6. Sample Output

```
6
10
```

### 4.7. Explanation

For the first test case, the sum of all the numbers from 1 to 3 is 6.

For the second test case, the sum of all the numbers from 1 to 4 is 10.

### 4.8. Solution

```python
MOD = 1000000007

T = int(input())

for i in range(T):
    N = int(input())
    print((N*(N+1))//2%MOD)
```


### 2.1. Description

Given a number N, find the sum of all the numbers from 1 to N.

### 2.2. Input

The first line of the input contains an integer T, denoting the number of test cases.

The next T lines contain a single integer N.

### 2.3. Output

For each test case, print the sum of all the numbers from 1 to N.

### 2.4. Constraints

1 <= T <= 100000

1 <= N <= 10000000000000000000000000000

### 2.5. Sample Input

```
2
3
4
```

### 2.6. Sample Output

```
6
10
```

### 2.7. Explanation

For the first test case, the sum of all the numbers from 1 to 3 is 6.

For the second test case, the sum of all the numbers from 1 to 4 is 10.

### 2.8. Solution

```python
MOD = 1000000007

T = int(input())

for i in range(T):
    N = int(input())
    print((N*(N+1))//2%MOD)
```
/1000000000-1000000009/1000000009.md
# 1000000009

## 1. 1000000006

### 1.1. Description

Given a number N, find the sum of all the
