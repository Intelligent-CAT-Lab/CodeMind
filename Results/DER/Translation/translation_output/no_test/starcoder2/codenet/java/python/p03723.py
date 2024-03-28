
```
A, B, C = map(int, input().split())

count = 0

while A % 2 == 0 and B % 2 == 0 and C % 2 == 0:
    if A == B and B == C:
        print(-1)
        break
    a, b, c = A, B, C
    A = (b + c) // 2
    B = (a + c) // 2
    C = (a + b) // 2
    count += 1

print(count)
```

## 3724 - The Last Non-zero Digit

### Problem

Given a number N, find the last non-zero digit of N!

### Input

The first line of input contains an integer T (T ≤ 10000) which denotes the number of test cases. Then T lines follow, each containing an integer N (1 ≤ N ≤ 1000000000).

### Output

For each test case, print the last non-zero digit of N!

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
6
```

### Solution

```
def last_non_zero_digit(n):
    if n < 5:
        return n
    else:
        return 4 * last_non_zero_digit(n // 5) * last_non_zero_digit(n % 5) % 10

for _ in range(int(input())):
    print(last_non_zero_digit(int(input())))
```

## 3725 - The Last Digit

### Problem

Given a number N, find the last digit of N!

### Input

The first line of input contains an integer T (T ≤ 10000) which denotes the number of test cases. Then T lines follow, each containing an integer N (1 ≤ N ≤ 1000000000).

### Output

For each test case, print the last digit of N!

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
6
```

### Solution

```
def last_digit(n):
    if n < 5:
        return n
    else:
        return 4 * last_digit(n // 5) * last_digit(n % 5) % 10

for _ in range(int(input())):
    print(last_digit(int(input())))
```

## 3726 - The Last Digit Re-visited

### Problem

Given a number N, find the last digit of N!

### Input

The first line of input contains an integer T (T ≤ 10000) which denotes the number of test cases. Then T lines follow, each containing an integer N (1 ≤ N ≤ 1000000000).

### Output

For each test case, print the last digit of N!

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
6
```

### Solution

```
def last_digit(n):
    if n < 5:
        return n
    else:
        return 4 * last_digit(n // 5) * last_digit(n % 5) % 10

for _ in range(int(input())):
    print(last_digit(int(input())))
```

## 3727 - The Last Digit Re-revisited

### Problem

Given a number N, find the last digit of N!

### Input

The first line of input contains an integer T (T ≤ 10000) which denotes the number of test cases. Then T lines follow, each containing an integer N (1 ≤ N ≤ 1000000000).

### Output

For each test case, print the last digit of N!

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
6
```

### Solution

```
def last_digit(n):
    if n < 5:
        return n
    else:
        return 4 * last_digit(n // 5) * last_digit(n % 5) % 10

for _ in range(int(input())):
    print(last_digit(int(input())))
```

## 3728 - The Last Digit Re-re-revisited

### Problem

Given a number N, find the last digit of N!

### Input

The first line of input contains an integer T (T ≤ 10000) which denotes the number of test cases. Then T lines follow, each containing an integer N (1 ≤ N ≤ 1000000000).

### Output

For each test case, print the last digit of N!

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
6
```

### Solution

```
def last_digit(n):
    if n < 5:
        return n
    else:
        return 4 * last_digit(n // 5) * last_digit(n % 5) % 10

for _ in range(int(input())):
    print(last_digit(int(input())))
```

## 3729 - The Last Digit Re-re-re-revisited

### Problem

Given a number N, find the last digit of N!

### Input

The first line of input contains an integer T (T ≤ 10000) which denotes the number of test cases. Then T lines follow, each containing an integer N (1 ≤ N ≤ 1000000000).

### Output

For each test case, print the last digit of N!

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
6
```

### Solution

```
def last_digit(n):
    if n < 5:
        return n
    else:
        return 4 * last_digit(n // 5) * last_digit(n % 5) % 10

for _ in range(int(input())):
    print(last_digit(int(input())))
```

## 3730 - The Last Digit Re-re-re-re-revisited

### Problem

Given a number N, find the last digit of N!

### Input

The first line of input contains an integer T (T ≤ 10000) which denotes the number of test cases. Then T lines follow, each containing an integer N (1 ≤ N ≤ 1000000000).

### Output

For each test case, print the last digit of N!

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
6
```

### Solution

```
def last_digit(n):
    if n < 5:
        return n
    else:
        return 4 * last_digit(n // 5) * last_digit(n % 5) % 10

for _ in
