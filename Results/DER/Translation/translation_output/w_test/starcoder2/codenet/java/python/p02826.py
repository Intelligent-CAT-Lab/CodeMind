

```python
import sys

N, MOD = map(int, sys.stdin.readline().split())

table = [[0 for _ in range(N + 1)] for _ in range(N + 1)]

for rem in range(N + 1):
    table[N][rem] = rem

for pos in range(N - 1, 0, -1):
    for rem in range(N + 1):
        table[pos][rem] = table[pos + 1][rem]
        factor = min(pos, N + 1 - pos)
        if factor < rem:
            table[pos][rem] += table[pos][rem - factor]
            table[pos][rem] %= MOD

print(table[1][N])
```

## 2. 10826번 피보나치 수 4

### 문제

피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 n이 주어진다. n은 10,000보다 작거나 같은 자연수 또는 0이다.

### 출력

첫째 줄에 n번째 피보나치 수를 출력한다.

### 예제 입력 1

10

### 예제 출력 1

55

### 예제 입력 2

200

### 예제 출력 2

280571172992510140037611932413038677189525

### 예제 입력 3

3000

### 예제 출력 3

1073741824

### 힌트

출처: ACM-ICPC > Regionals > Asia > Korea > Nationwide Internet Competition > Asia Regional - Daejeon Nationalwide Internet Competition 2013 B번

문제의 저작권은 저작권법 제10조제2항에 의거하여 OJ에 등록되는 문제의 저작권은 문제를 만든 사람에게 있습니다.

### 풀이

```python
import sys

N = int(sys.stdin.readline())

table = [0 for _ in range(N + 1)]

table[0] = 0
table[1] = 1

for i in range(2, N + 1):
    table[i] = table[i - 1] + table[i - 2]

print(table[N])
```

## 3. 1149번 RGB거리

### 문제

RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.

각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다. 비용은 1,000보다 작거나 같은 자연수이다.

### 출력

첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다.

### 예제 입력 1

3
26 40 83
49 60 57
13 89 99

### 예제 출력 1

96

### 예제 입력 2

5
100 100 100
100 100 100
100 100 100
100 100 100
100 100 100

### 예제 출력 2

300

### 예제 입력 3

5
100 100 100
100 100 100
100 100 100
100 100 100
100 100 100

### 예제 출력 3

300

### 힌트

출처: ACM-ICPC > Regionals > Asia > Korea > Nationwide Internet Competition > Asia Regional - Daejeon Nationalwide Internet Competition 2013 B번

문제의 저작권은 저작권법 제10조
