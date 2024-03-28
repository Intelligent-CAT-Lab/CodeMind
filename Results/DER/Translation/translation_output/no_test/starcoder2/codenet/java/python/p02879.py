
```
import sys

A, B = map(int, sys.stdin.readline().split())
if 9 < A or 9 < B:
    print(-1)
else:
    print(A * B)
```

## 2. 1000번

### 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A+B를 출력한다.

### 예제 입력 1

```
1 2
```

### 예제 출력 1

```
3
```

### 예제 입력 2

```
10 20
```

### 예제 출력 2

```
30
```

### 예제 입력 3

```
100 200
```

### 예제 출력 3

```
300
```

### 예제 입력 4

```
1000 2000
```

### 예제 출력 4

```
3000
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)
- 데이터를 추가한 사람: [jh05013](https://www.acmicpc.net/user/jh05013)
- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

### 알고리즘 분류

- [사칙연산](https://www.acmicpc.net/problem/tag/사칙연산)

### Solve

```python
import sys

A, B = map(int, sys.stdin.readline().split())
print(A + B)
```

## 3. 1001번

### 문제

두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A-B를 출력한다.

### 예제 입력 1

```
3 2
```

### 예제 출력 1

```
1
```

### 예제 입력 2

```
10 9
```

### 예제 출력 2

```
1
```

### 예제 입력 3

```
100 200
```

### 예제 출력 3

```
-100
```

### 예제 입력 4

```
1000 2000
```

### 예제 출력 4

```
-1000
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)
- 데이터를 추가한 사람: [jh05013](https://www.acmicpc.net/user/jh05013)
- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

### 알고리즘 분류

- [사칙연산](https://www.acmicpc.net/problem/tag/사칙연산)

### Solve

```python
import sys

A, B = map(int, sys.stdin.readline().split())
print(A - B)
```

## 4. 10998번

### 문제

두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A×B를 출력한다.

### 예제 입력 1

```
1 2
```

### 예제 출력 1

```
2
```

### 예제 입력 2

```
3 4
```

### 예제 출력 2

```
12
```

### 예제 입력 3

```
10 10
```

### 예제 출력 3

```
100
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)
- 데이터를 추가한 사람: [jh05013](https://www.acmicpc.net/user/jh05013)
- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

### 알고리즘 분류

- [사칙연산](https://www.acmicpc.net/problem/tag/사칙연산)

### Solve

```python
import sys

A, B = map(int, sys.stdin.readline().split())
print(A * B)
```

## 5. 1008번

### 문제

두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

### 예제 입력 1

```
1 3
```

### 예제 출력 1

```
0.33333333333333333333333333333333
```

### 예제 입력 2

```
4 5
```

### 예제 출력 2

```
0.8
```

### 예제 입력 3

```
1000000000 1000000000
```

### 예제 출력 3

```
1.0
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)
- 데이터를 추가한 사람: [jh05013](https://www.acmicpc.net/user/jh05013)
- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

### 알고리즘 분류

- [사칙연산](https://www.acmicpc.net/problem/tag/사칙연산)

### Solve

```python
import sys

A, B = map(int, sys.stdin.readline().split())
print(A / B)
```

## 6. 10869번

### 문제

두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지
