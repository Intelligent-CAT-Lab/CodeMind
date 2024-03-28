
```
import sys

N, X, M = map(int, sys.stdin.readline().split())

used = set()
A = []
A.append(X)
used.add(X)

K = 0
L = 0
ans = 0
breakflag = False

for i in range(M-1):
    prev = A[i]
    now = (prev*prev) % M
    if now == 0:
        for j in range(i+1):
            ans += A[j]
        breakflag = True
        break
    elif now in used:
        L = i+1
        for j in range(i+1):
            if A[j] == now:
                K = j
                break
        sub = 0
        for j in range(K, L):
            sub += A[j]
        m = (N-K) % (L-K)
        left = 0
        for j in range(m):
            left += A[K+j]
        ans += ((N-K)//(L-K))*sub + left
        breakflag = True
        break
    else:
        used.add(now)
        A.append(now)

if not breakflag:
    ans = 0
    for a in A:
        ans += a

print(ans)
```

## 2551. 2016년

### 문제

2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

### 제한 조건

- 2016년은 윤년입니다.
- 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

### 입출력 예

| a    | b    | result |
| ---- | ---- | ------ |
| 5    | 24   | TUE    |

### 입출력 예 설명

- 2016년 5월 24일은 화요일입니다.

### 풀이

```python
def solution(a, b):
    answer = ''
    days = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    total = 0
    for i in range(a-1):
        total += days[i]
    total += b
    answer = day[total%7]
    return answer
```

## 2552. 2016년

### 문제

2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 TUE를 반환하세요.

### 제한 조건

- 2016년은 윤년입니다.
- 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

### 입출력 예

| a    | b    | result |
| ---- | ---- | ------ |
| 5    | 24   | TUE    |

### 입출력 예 설명

- 2016년 5월 24일은 화요일입니다.

### 풀이

```python
def solution(a, b):
    answer = ''
    days = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    day = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    total = 0
    for i in range(a-1):
        total += days[i]
    total += b
    answer = day[total%7]
    return answer
```

## 2553. N번째 큰 수

### 문제

함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

### 제한 조건

- n은 1이상 8000000000 이하인 자연수입니다.

### 입출력 예

| n       | return |
| ------- | ------ |
| 118372  | 873211 |
| 873211  | 873211 |
| 1000000 | 100000 |

### 풀이

```python
def solution(n):
    answer = 0
    n = list(str(n))
    n.sort(reverse=True)
    answer = int(''.join(n))
    return answer
```

## 2554. N번째 큰 수

### 문제

함수 solution은 정수 n을 매
