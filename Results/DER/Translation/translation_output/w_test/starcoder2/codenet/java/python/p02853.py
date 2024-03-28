

```python
import sys

X, Y = map(int, sys.stdin.readline().split())
ans = 0
if X == 1 and Y == 1:
    ans = 1000000
else:
    if X == 1:
        ans += 300000
    if Y == 1:
        ans += 300000
    if X == 2:
        ans += 200000
    if Y == 2:
        ans += 200000
    if X == 3:
        ans += 100000
    if Y == 3:
        ans += 100000
print(ans)
```

## 2. 10817번

### 문제

세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 

### 입력

첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

### 출력

두 번째로 큰 정수를 출력한다.

### 예제 입력 1 

```
20 30 10
```

### 예제 출력 1 

```
20
```

### 예제 입력 2 

```
30 30 10
```

### 예제 출력 2 

```
30
```

### 예제 입력 3 

```
40 40 40
```

### 예제 출력 3 

```
40
```

### 예제 입력 4 

```
20 10 10
```

### 예제 출력 4 

```
10
```

### 힌트

세 정수가 같은 경우가 있다.

### 출처

- 문제를 만든 사람: [baekjoon](https://www.acmicpc.net/user/baekjoon)

### 알고리즘 분류

- [정렬](https://www.acmicpc.net/problem/tag/정렬)

### python code

```python
import sys

A, B, C = map(int, sys.stdin.readline().split())

if A > B:
    A, B = B, A
if B > C:
    B, C = C, B
if A > B:
    A, B = B, A
print(B)
```

## 3. 10871번

### 문제

정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)

둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

### 출력

X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

### 예제 입력 1 

```
10 5
1 10 4 9 2 3 8 5 7 6
```

### 예제 출력 1 

```
1 4 2 3
```

### python code

```python
import sys

N, X = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))

for i in range(N):
    if A[i] < X:
        print(A[i], end=' ')
```

## 4. 10950번

### 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

각 테스트 케이스마다 A+B를 출력한다.

### 예제 입력 1 

```
5
1 1
2 3
3 4
9 8
5 2
```

### 예제 출력 1 

```
2
5
7
17
7
```

### python code

```python
import sys

T = int(sys.stdin.readline())

for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print(A + B)
```

## 5. 10951번

### 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

각 테스트 케이스마다 A+B를 출력한다.

### 예제 입력 1 

```
1 1
2 3
3 4
9 8
5 2
```

### 예제 출력 1 

```
2
5
7
17
7
```

### python code

```python
import sys

while True:
    try:
        A, B = map(int, sys.stdin.readline().split())
        print(A + B)
    except:
        break
```

## 6. 10952번

### 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

### 출력

각 테스트 케이스마다 A+B를 출력한다.

### 예제 입력 1 

```
1 1
2 3
3 4
9 8
5 2
0 0
```

### 예제 출력 1 

```
2
5
7
17
7
```

### python code

```python
import sys

while True:
    A, B = map(int, sys.stdin.readline().split())
    if A ==
