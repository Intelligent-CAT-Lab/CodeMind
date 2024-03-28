

```python
import math

def pow(base, n):
    retVal = 1
    while n > 0:
        if n & 1 == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal

def solve():
    x = int(input())
    powMap = {}
    powMap[0] = 0
    powMap[1] = 1
    beforePow = 1
    base = 2
    while True:
        powVal = pow(base, 5)
        powMap[powVal] = base
        if powVal - beforePow > x:
            break
        base += 1
        beforePow = powVal

    for powVal in powMap:
        diff = abs(x - powVal)
        if diff in powMap:
            print(powMap[powVal], end='')
            if powVal - x < 0:
                print(" -" + str(powMap[diff]), end='')
            else:
                print(" " + str(powMap[diff]), end='')
            print()
            return

solve()
```

## 2691. [중등2-2] 2의 거듭제곱

### 문제

2의 거듭제곱을 이용하여 1000000000 이하의 자연수 N을 표현하려고 한다.

예를 들어, 1000000000은 2^30으로 표현할 수 있다.

자연수 N이 주어질 때, 2의 거듭제곱을 이용하여 N을 표현하는 방법의 개수를 출력하는 프로그램을 작성하시오.

### 입력

첫 번째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 1000000000)

### 출력

첫 번째 줄에 2의 거듭제곱을 이용하여 N을 표현하는 방법의 개수를 출력한다.

### 예제 입력 1

```
1000000000
```

### 예제 출력 1

```
1
```

### 예제 입력 2

```
100000000
```

### 예제 출력 2

```
2
```

### 예제 입력 3

```
10000000
```

### 예제 출력 3

```
3
```

### 예제 입력 4

```
1000000
```

### 예제 출력 4

```
4
```

### 예제 입력 5

```
100000
```

### 예제 출력 5

```
5
```

### 예제 입력 6

```
10000
```

### 예제 출력 6

```
6
```

### 예제 입력 7

```
1000
```

### 예제 출력 7

```
7
```

### 예제 입력 8

```
100
```

### 예제 출력 8

```
8
```

### 예제 입력 9

```
10
```

### 예제 출력 9

```
9
```

### 예제 입력 10

```
1
```

### 예제 출력 10

```
10
```

### 힌트

### 출처

[Olympiad ](https://www.acmicpc.net/category/2)> [한국정보올림피아드 ](https://www.acmicpc.net/category/55)> [한국정보올림피아드시․도지역본선 ](https://www.acmicpc.net/category/57)> [지역본선 2018 ](https://www.acmicpc.net/category/71)> [중등2 ](https://www.acmicpc.net/category/detail/2001) 1번

- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)
- 문제를 만든 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

### 알고리즘 분류

- [구현](https://www.acmicpc.net/problem/tag/1044)
- [수학](https://www.acmicpc.net/problem/tag/1085)
- [수학](https://www.acmicpc.net/problem/tag
