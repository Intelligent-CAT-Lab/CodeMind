
```
import sys

a, b = map(int, sys.stdin.readline().split())
print(a*b, 2*a+2*b)
```

## 2. 1001번

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
100 100
```

### 예제 출력 3

```
0
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)

### 알고리즘 분류

- [수학](https://www.acmicpc.net/problem/tag/수학)

### 보기

- [제출](https://www.acmicpc.net/problem/1001/submit)
- [정답](https://www.acmicpc.net/problem/1001/correct)
- [풀이](https://www.acmicpc.net/problem/1001/file/statement/1440186/1440186)

### 메모

- [1001번 문제](https://www.acmicpc.net/problem/1001)

### 풀이

```python
a, b = map(int, input().split())
print(a-b)
```

## 3. 1008번

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

### 알고리즘 분류

- [수학](https://www.acmicpc.net/problem/tag/수학)

### 보기

- [제출](https://www.acmicpc.net/problem/1008/submit)
- [정답](https://www.acmicpc.net/problem/1008/correct)
- [풀이](https://www.acmicpc.net/problem/1008/file/statement/1440186/1440186)

### 메모

- [1008번 문제](https://www.acmicpc.net/problem/1008)

### 풀이

```python
a, b = map(int, input().split())
print(a/b)
```

## 4. 10869번

### 문제

두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

### 입력

두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

### 출력

첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

### 예제 입력 1

```
7 3
```

### 예제 출력 1

```
10
4
21
2
1
```

### 예제 입력 2

```
10 11
```

### 예제 출력 2

```
21
-1
110
0
10
```

### 예제 입력 3

```
1 1
```

### 예제 출력 3

```
2
0
1
1
0
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)

### 알고리즘 분류

- [수학](https://www.acmicpc.net/problem/tag/수학)

### 보기

- [제출](https://www.acmicpc.net/problem/10869/submit)
- [정답](https://www.acmicpc.net/problem/10869/correct)
- [풀이](https://www.acmicpc.net/problem/10869/file/statement/1440186/1440186)

### 메모

- [10869번 문제](https://www.acmicpc.net/problem/10869)

### 풀이

```python
a, b = map(int, input().split
