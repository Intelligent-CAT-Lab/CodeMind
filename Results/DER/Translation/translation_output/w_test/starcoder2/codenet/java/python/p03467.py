

```python
import sys

P = 998244353

def go(s):
    if s == '':
        return 1
    if s in map:
        return map[s]
    ret = (1 + int(s[0])) * go(s[1:]) % P
    for x in range(1, len(s) // 2 + 1):
        buf = list(s[:x])
        for k in range(2, len(s) // x + 1):
            for i in range(x):
                if s[x * (k - 1) + i] == '0':
                    buf[i] = '0'
            ret += go(''.join(buf)) * go(s[x * k:]) % P
    map[s] = ret
    return ret

map = {}
s = sys.stdin.readline().strip()
print(go(s))
```


```

python code:

```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

a.sort()

ans = 0
for i in range(n):
    ans += a[i] * (n - i - 1)

print(ans)
```
/p03466.md
# p03466

[https://www.acmicpc.net/problem/3466](https://www.acmicpc.net/problem/3466)

## Problem

| 시간 제한 | 메모리 제한 | 제출  | 정답  | 맞은 사람 | 정답 비율 |
| :-------: | :---------: | :---: | :---: | :-------: | :-------: |
|   1 초    |   128 MB    | 1000  |  480  |   398     |   48.000  |

## 문제

N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

## 입력

첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

## 출력

첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

## 예제 입력 1

```
10
5
2
3
1
4
2
3
5
1
7
```

## 예제 출력 1

```
1
1
2
2
3
3
4
5
5
7
```

## 힌트

## 출처

[ACM-ICPC ](https://www.acmicpc.net/category/1)> [Regionals ](https://www.acmicpc.net/category/7)> [Asia ](https://www.acmicpc.net/category/42)> [Korea ](https://www.acmicpc.net/category/211)> [Nationwide Internet Competition ](https://www.acmicpc.net/category/256)> [Asia Regional - Daejeon Nationalwide Internet Competition 2014](https://www.acmicpc.net/category/detail/1209) B번

- 문제를 번역한 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)/p03465.md
# p03465

[https://www.acmicpc.net/problem/3465](https://www.acmicpc.net/problem/3465)

## Problem

| 시간 제한 | 메모리 제한 | 제출  | 정답  | 맞은 사람 | 정답 비율 |
| :-------: | :---------: | :---: | :---: | :-------: | :-------: |
|   1 초    |   128 MB    | 1000  |  480  |   398     |   48.000  |

## 문제

N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

## 입력

첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

## 출력

첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

## 예제 입력 1

```
10
5
2
3
1
4
2
3
5
1
7
```

## 예제 출력 1

```
1
1
2
2
3
3
4
5
5
7
```

## 힌트
