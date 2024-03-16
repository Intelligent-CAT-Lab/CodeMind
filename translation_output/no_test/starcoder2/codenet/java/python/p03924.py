
```python
import sys

r = sys.stdin

N, M = map(int, r.readline().split())
MOD = 1000000007

dp = [[[0 for _ in range(N+1)] for _ in range(N+1)] for _ in range(M+1)]
dp[0][1][1] = 1

for i in range(M):
    for j in range(N+1):
        for k in range(N+1):
            if j != N:
                dp[i+1][j+1][k] += (dp[i][j][k] * (N-j)) % MOD
                dp[i+1][j+1][k] %= MOD
            dp[i+1][j][k] += (dp[i][j][k] * (j-k)) % MOD
            dp[i+1][j][k] %= MOD
            dp[i+1][j][j] += (dp[i][j][k] * k) % MOD
            dp[i+1][j][j] %= MOD

print(dp[M][N][N])
```

## 3. 10844 쉬운 계단 수

### 문제

45656이란 수를 보자.

이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.

세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)

### 입력

첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.

### 출력

첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.

### 예제 입력 1

```
1
```

### 예제 출력 1

```
9
```

### 예제 입력 2

```
2
```

### 예제 출력 2

```
17
```

### 힌트

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [다이나믹 프로그래밍](https://www.acmicpc.net/problem/tag/다이나믹 프로그래밍)

### Solve

```python
import sys

r = sys.stdin

N = int(r.readline())
MOD = 1000000000

dp = [[0 for _ in range(10)] for _ in range(N+1)]

for i in range(1, 10):
    dp[1][i] = 1

for i in range(2, N+1):
    for j in range(10):
        if j == 0:
            dp[i][j] = dp[i-1][j+1]
        elif j == 9:
            dp[i][j] = dp[i-1][j-1]
        else:
            dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD

print(sum(dp[N]) % MOD)
```

## 4. 11057 오르막 수

### 문제

오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.

예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.

수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.

### 입력

첫째
