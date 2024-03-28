

```python
import sys

def solver():
    n, x = map(int, sys.stdin.readline().split())
    sum = 0
    if x == n - x:
        sum = 3 * x
        print(sum)
        return
    else:
        if x > n - x:
            sum += x + n - x
            sum += calc(x, n - x, False)
        else:
            sum += x + n - x
            sum += calc(x, n - x, False)
        print(sum)
        return

def calc(x, y, first):
    sum = 0
    if x % y == 0:
        if first:
            sum += y
        sum += (x // y * 2 - 1) * y
        return sum
    else:
        if first:
            sum += y
        sum += (x // y * 2) * y
        sum += calc(y, x % y, False)
        return sum

solver()
```

## 4049. [Algorithm] 1000000007

### 문제

1000000007을 출력하시오.

### 입력

없음

### 출력

1000000007을 출력하시오.

### 예제 입력 1

```

```

### 예제 출력 1

```
1000000007
```

### 힌트

### 출처

[Olympiad ](https://www.acmicpc.net/category/2) > [한국정보올림피아드시․도지역본선](https://www.acmicpc.net/category/25) > [지역본선 2011](https://www.acmicpc.net/category/detail/1099) 1번

- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

## 4050. [Algorithm] 1000000008

### 문제

1000000008을 출력하시오.

### 입력

없음

### 출력

1000000008을 출력하시오.

### 예제 입력 1

```

```

### 예제 출력 1

```

