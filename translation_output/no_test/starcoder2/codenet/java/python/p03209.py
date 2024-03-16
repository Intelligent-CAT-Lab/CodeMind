
```
import sys

def calc(n, x):
    if n == 0:
        return 1
    sum = 0
    x -= 1
    length = length(n-1)
    p = p(n-1)
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n-1, x)
        x -= length
    if x > 0:
        x -= 1
        sum += 1
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n-1, x)
    return sum

def length(n):
    return 1 + 4 * ((2**n) -1)

def p(n):
    return 1 + 2 * ((2**n) -1)

n = int(sys.stdin.readline())
x = int(sys.stdin.readline())
print(calc(n, x))
```

## 03210 - 1, 2, 3 더하기 10

### 문제

정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

### 출력

각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.

### 예제 입력

```
3
4
7
10
```

### 예제 출력

```
7
44
274
```

### 풀이

```python
import sys

def calc(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 4
    return calc(n-1) + calc(n-2) + calc(n-3)

t = int(sys.stdin.readline())
for i in range(t):
    n = int(sys.stdin.readline())
    print(calc(n))
```

## 03211 - 1, 2, 3 더하기 11

### 문제

정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

1+1+1+1
1+1+2
1+2+1
2+1+1
2+2
1+3
3+1
정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.

### 출력

각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.

### 예제 입력

```
3
4
7
10
```

### 예제 출력

```
7
44
274
```

### 풀이

```python
import sys

def calc(n):
    if n == 1:
        return 1
    if n == 2:
        return 2
    if n == 3:
        return 4
    return calc(n-1) + calc(n-2) + calc(n-3)

t = int(sys.stdin.readline())
for i in range(t):
    n = int(sys.stdin.readline())
