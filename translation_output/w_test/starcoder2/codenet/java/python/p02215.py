

```
import sys

N, X = map(int, sys.stdin.readline().split())
MOD = 998244353
dp = [[[0 for _ in range(X + 1)] for _ in range(512)] for _ in range(2)]
for i in range(X + 1):
    dp[0][i][i] = 1
t = 1
for i in range(1, N):
    t = 1 - t
    for j in range(512):
        dp[t][j] = [0 for _ in range(X + 1)]
    for j in range(512):
        sum = 0
        for k in range(X + 1):
            sum += dp[1 - t][j][k]
            dp[t][j ^ k][k] += sum
            dp[t][j ^ k][k] %= MOD
ans = 0
for i in range(X + 1):
    ans += dp[1 - t][X][i]
print(ans % MOD)
```

## 2216. 2×n 타일링 2

[문제 링크](https://www.acmicpc.net/problem/11727)

### 문제

2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×17 직사각형을 채운 한가지 예이다.

![img](https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11727/1.png)

### 입력

첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)

### 출력

첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.

### 예제 입력 1

```
2
```

### 예제 출력 1

```
3
```

### 예제 입력 2

```
9
```

### 예제 출력 2

```
55
```

### 예제 입력 3

```
1000
```

### 예제 출력 3

```
10007
```

### 힌트

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [다이나믹 프로그래밍](https://www.acmicpc.net/problem/tag/다이나믹 프로그래밍)

### Solve

```python
import sys

N = int(sys.stdin.readline())
dp = [0 for _ in range(N + 1)]
dp[1] = 1
dp[2] = 3
for i in range(3, N + 1):
    dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007
print(dp[N])
```

## 2217. 로프

[문제 링크](https://www.acmicpc.net/problem/2217)

### 문제

N(1≤N≤100,000)개의 로프가 있다. 이 로프를 이용하여 이런 저런 물체를 들어올릴 수 있다. 각각의 로프는 그 굵기나 길이가 다르기 때문에 들 수 있는 물체의 중량이 서로 다를 수도 있다.

하지만 여러 개의 로프를 병렬로 연결하면 각각의 로프에 걸리는 중량을 나눌 수 있다. k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때, 각각의 로프에는 모두 고르게 w/k 만큼의 중량이 걸리게 된다.

각 로프들에 대한 정보가 주어졌을 때, 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량을 구해내는 프로그램을 작성하시오. 모든 로프를 사용해야 할 필요는 없으며, 임의로 몇 개의 로프를 골라서 사용해도 된다. 단, 각각의 로프는 한 개씩만 존재한다.

### 입력

첫째 줄에 정수 N이 주어진다. 다음 N개의 줄에는 각 로프가 버틸 수 있는 최대 중량이 주어진다. 이 값은 10,000을 넘지 않는 자연수이다.

### 출력

첫째 줄에 답을 출력한다.

### 예제 입력 1

```
2
10
15
```

### 예제 출력 1

```
20
```

### 예제 입력 2

```
3
10
15
20
```

### 예제 출력 2

```
20
```

### 예제 입력 3

```
5
10
9
8
7
6
```

### 예제 출력 3

```
55
```

### 예제 입력 4

```
5
10
9
8
7
6
```

### 예제 출력 4

```
55
```

### 예제 입력 5

```
5
10
9
8
7
6
```

### 예제 출력 5

```
55
```

### 힌트

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [그리디 알고리즘](https://www.acmicpc.net/problem/tag/그리디 알고리즘)

### Solve

```python
import sys

N = int(sys.stdin.readline())
rope = []
for _ in range(N):
    rope.append(int(sys.stdin.readline()))
rope.sort()
max_weight = 0
for i in range(N):
    max_weight = max(max_weight, rope[i] * (N - i))
print(max_weight)
```

## 2218. 벽 부수
