

```python
n = int(input())
mod = 1000000007
dp = [0] * (n + 1)
dp[0] = 1
for i in range(3, n + 1):
    for j in range(3, i + 1):
        dp[i] = (dp[i] + dp[i - j]) % mod
print(dp[n])
```

## 2. 1003번 피보나치 함수

### 문제

다음 소스는 N번째 피보나치 함수를 구하는 함수이다.

```
int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}
```

fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.

- fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
- fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
- 두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
- fibonacci(0)은 0을 출력하고, 0을 리턴한다.
- fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
- 첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
- fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.

1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

### 출력

각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.

### 예제 입력 1

```
3
0
1
3
```

### 예제 출력 1

```
1 0
0 1
1 2
```

### 힌트

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [다이나믹 프로그래밍](https://www.acmicpc.net/problem/tag/다이나믹 프로그래밍)

### python code

```python
t = int(input())
for _ in range(t):
    n = int(input())
    dp = [[0, 0] for _ in range(n + 1)]
    dp[0] = [1, 0]
    dp[1] = [0, 1]
    for i in range(2, n + 1):
        dp[i][0] = dp[i - 1][0] + dp[i - 2][0]
        dp[i][1] = dp[i - 1][1] + dp[i - 2][1]
    print(dp[n][0], dp[n][1])
```

## 3. 11726번 2×n 타일링

### 문제

2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

![img](https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11726/1.png)

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
2
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
8037601
```

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [다이나믹 프로그래밍](https://www.acmicpc.net/problem/tag/다이나믹 프로그래밍)

### python code

```python
n = int(input())
dp = [0] * (n + 1)
dp[1] = 1
dp[2] = 2
for i in range(3, n + 1):
    dp[i] = (dp[i - 1] + dp[i - 2]) % 10007
print(dp[n])
```

## 4. 11727번 2×n 타일링 2

### 문제

2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.

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
6744407
```

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [다이나믹 프로그래밍](https://www.acmicpc.net/problem
