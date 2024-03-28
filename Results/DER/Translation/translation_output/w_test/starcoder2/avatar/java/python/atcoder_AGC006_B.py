

```python
import sys

def main():
    N, x = map(int, sys.stdin.readline().split())
    if x == 1 or x == 2 * N - 1:
        print("No")
        return
    print("Yes")
    low = x - 1
    high = x + 1
    deq = []
    deq.append(x)
    while low != 0 or high != 2 * N:
        if low == 0:
            deq.insert(0, high)
            deq.append(high + 1)
            high += 2
        elif high == 2 * N:
            deq.append(low)
            deq.insert(0, low - 1)
            low -= 2
        else:
            deq.insert(0, low)
            low -= 1
            deq.append(high)
            high += 1
    for s in deq:
        print(s)

if __name__ == "__main__":
    main()
```

## 2. 1000000007

### 2.1. Description

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 2.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The only line of each test case contains a single integer N.

### 2.3. Output

For each test case, output a single line containing one integer - the number of positive integers less than or equal to N that are divisible by 2 or 3 but not both.

### 2.4. Constraints

1 ≤ T ≤ 100000

1 ≤ N ≤ 1000000000

### 2.5. Example

#### 2.5.1. Input:

```
2
1
10
```

#### 2.5.2. Output:

```
0
8
```

### 2.6. Explanation

#### 2.6.1. Example case 1.

There are no such integers.

#### 2.6.2. Example case 2.

The integers are 1, 5, 7, 11, 13, 17, 19, 23.

### 2.7. Solution

```python
import sys

def main():
    T = int(sys.stdin.readline())
    for _ in range(T):
        N = int(sys.stdin.readline())
        print(N - N // 2 - N // 3 + N // 6)

if __name__ == "__main__":
    main()
```

## 3. 1000000009

### 3.1. Description

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 3.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The only line of each test case contains a single integer N.

### 3.3. Output

For each test case, output a single line containing one integer - the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5.

### 3.4. Constraints

1 ≤ T ≤ 100000

1 ≤ N ≤ 1000000000

### 3.5. Example

#### 3.5.1. Input:

```
2
1
10
```

#### 3.5.2. Output:

```
0
7
```

### 3.6. Explanation

#### 3.6.1. Example case 1.

There are no such integers.

#### 3.6.2. Example case 2.

The integers are 1, 2, 3, 4, 5, 6, 10.

### 3.7. Solution

```python
import sys

def main():
    T = int(sys.stdin.readline())
    for _ in range(T):
        N = int(sys.stdin.readline())
        print(N - N // 2 - N // 3 - N // 5 + N // 6 + N // 10 + N // 15 - N // 30)

if __name__ == "__main__":
    main()
```

## 4. 1000000021

### 4.1. Description

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5 or 7.

### 4.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The only line of each test case contains a single integer N.

### 4.3. Output

For each test case, output a single line containing one integer - the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5 or 7.

### 4.4. Constraints

1 ≤ T ≤ 100000

1 ≤ N ≤ 1000000000

### 4.5. Example

#### 4.5.1. Input:

```
2
1
10
```

#### 4.5.2. Output:

```
0
5
```

### 4.6. Explanation

#### 4.6.1. Example case 1.

There are no such integers.

#### 4.6.2. Example case 2.

The integers are 1, 2, 3, 5, 6.

### 4.7. Solution

```python
import sys

def main():
    T = int(sys.stdin.readline())
    for _ in range(T):
        N = int(sys.stdin.readline())
        print(N - N // 2 - N // 3 - N // 5 - N // 7 + N // 6 + N // 10 + N // 15 + N // 21 - N // 30 - N // 35 - N // 105 + N // 210)

if __name__ == "__main__":
    main()
```

## 5. 1000000033

### 5.1. Description

Given a positive integer N, find the number of positive integers less than or equal to N that are divisible by 2 or 3 or 5 or 7 or 11.

### 5.2. Input

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

The only line of each test case contains a single integer N.

### 5.
