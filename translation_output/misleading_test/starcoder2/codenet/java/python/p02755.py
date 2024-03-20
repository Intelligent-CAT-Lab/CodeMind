

```python
A, B = map(int, input().split())

if A > B:
    print(-1)
else:
    for i in range(1, 99999999):
        if int(i * 0.08) == A and int(i * 0.10) == B:
            print(i)
            break
    else:
        print(-1)
```

## 2. 1000번

[1000번](https://www.acmicpc.net/problem/1000)

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
-7 4
```

### 예제 출력 2

```
-3
```

### 예제 입력 3

```
0 0
```

### 예제 출력 3

```
0
```

### 예제 입력 4

```
1 -2
```

### 예제 출력 4

```
-1
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)
- 데이터를 추가한 사람: [jh05013](https://www.acmicpc.net/user/jh05013)
- 잘못된 데이터를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

### 알고리즘 분류

- [사칙연산](https://www.acmicpc.net/problem/tag/사칙연산)

### python code

```python
A, B = map(int, input().split())
print(A + B)
```

## 3. 1001번

[1001번](https://www.acmicpc.net/problem/1001)

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
-7 4
```

### 예제 출력 2

```
-11
```

### 예제 입력 3

```
0 0
```

### 예제 출력 3

```
0
```

### 예제 입력 4

```
1 -2
```

### 예제 출력 4

```
3
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)
- 데이터를 추가한 사람: [jh05013](https://www.acmicpc.net/user/jh05013)
- 잘못된 데이터를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

### 알고리즘 분류

- [사칙연산](https://www.acmicpc.net/problem/tag/사칙연산)

### python code

```python
A, B = map(int, input().split())
print(A - B)
```

## 4. 10998번

[10998번](https://www.acmicpc.net/problem/10998)

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
-1 0
```

### 예제 출력 3

```
0
```

### 예제 입력 4

```
-7 -3
```

### 예제 출력 4

```
21
```

### 힌트

### 출처

- 문제를 만든 사람: [author5](https://www.acmicpc.net/user/author5)
- 데이터를 추가한 사람: [jh05013](https://www.acmicpc.net/user/jh05013)
- 잘못된 데이터를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013)

### 알고리즘 분류

- [사칙연산](https://www.acmicpc.net/problem/tag/사칙연산)

### python code

```python
A, B = map(int, input().split())
print(A * B)
```

## 5. 1008번

[1008번](https://www.acmicpc.net/problem/1008)

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
-1 -3
```

### 예제 출력 3

```
0.33333333333333333333333333333333
```

### 예제 입력 4

```
-1 0
```

### 예제 출력 4

```
inf
```

### 힌트

### 출처

- 문제를 만든 사람:
