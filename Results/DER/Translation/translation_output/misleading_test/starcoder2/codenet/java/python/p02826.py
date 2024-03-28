

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

## 3. 10844번 쉬운 계단 수

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

1

### 예제 출력 1

9

### 예제 입력 2

2

### 예제 출력 2

17

### 힌트

출처: ACM-ICPC > Regionals > Asia > Korea > Nationwide Internet Competition > Asia Regional - Daejeon Nationalwide Internet Competition 2013 B번

문제의 저작권은 저작권법 제10조제2항에 의거하여 OJ에 등록되는 문제의 저작권은 문제를 만든 사람에게 있습니다.

### 풀이

```python
import sys

N = int(sys.stdin.readline())

table = [[0 for _ in range(10)] for _ in range(N + 1)]

for i in range(1, 10):
    table[1][i] = 1

for i in range(2, N + 1):
    for j in range(10):
        if j == 0:
            table[i][j] = table[i - 1][j + 1]
        elif j == 9:
            table[i][j] = table[i - 1][j - 1]
        else:
            table[i][j] = table[i - 1][j - 1] + table[i - 1][j + 1]

print(sum(table[N]) % 1000000000)
```

## 4. 11057번 오르막 수

### 문제

오르막 수는 수의 자리가 오름차순
