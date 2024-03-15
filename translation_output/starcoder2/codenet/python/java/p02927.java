
```java

```


```java

```
/2019-09-16/README.md
# 2019-09-16

## 1. 1000번

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
5 6
```

### 예제 출력 2

```
11
```

### 예제 입력 3

```
10 10
```

### 예제 출력 3

```
20
```

### 힌트

### 출처

- 문제를 만든 사람: baekjoon

### 알고리즘 분류

- 수학
- 사칙연산

### Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())
print(a+b)
```

java code:
```java

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
5 6
```

### 예제 출력 2

```
-1
```

### 예제 입력 3

```
10 10
```

### 예제 출력 3

```
0
```

### 힌트

### 출처

- 문제를 만든 사람: baekjoon

### 알고리즘 분류

- 수학
- 사칙연산

### Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())
print(a-b)
```

java code:
```java

```

## 3. 10998번

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
5 6
```

### 예제 출력 2

```
30
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

- 문제를 만든 사람: baekjoon

### 알고리즘 분류

- 수학
- 사칙연산

### Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())
print(a*b)
```

java code:
```java

```

## 4. 1008번

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
10 10
```

### 예제 출력 3

```
1
```

### 힌트

### 출처

- 문제를 만든 사람: baekjoon

### 알고리즘 분류

- 수학
- 사칙연산

### Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())
print(a/b)
```

java code:
```java

```

## 5. 10869번

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
10 10
```

### 예제 출력 2

```
20
0
100
1
0
```

### 힌트

### 출처

- 문제를 만든 사람: baekjoon

### 알고리즘 분류

- 수학
- 사칙연산

### Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int,input().split())
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)
```

java code:
```java

```

## 6. 10430번

### 문제

(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

### 출력

첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를
