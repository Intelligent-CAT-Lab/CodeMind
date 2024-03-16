
```
import sys

MOD = 1000000007
N = int(sys.stdin.readline())
cnt = [0] * (N+1)
for i in range(2, N+1):
    temp = i
    for j in range(2, int(temp**0.5)+1):
        while temp % j == 0:
            cnt[j] += 1
            temp //= j
    if temp > 1:
        cnt[temp] += 1

ans = 1
for i in range(2, N+1):
    ans = (ans * (cnt[i]+1)) % MOD

print(ans)
```

## 3831. [기초-배열연습] 2차원 배열 순서대로 채우기 1-1

### 문제

다음과 같이 2차원 배열을 출력하는 프로그램을 작성하시오.

```
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
```

### 입력

없음

### 출력

2차원 배열을 출력한다.

### 예제 입력 1

```

```

### 예제 출력 1

```
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
```

### 힌트

### 출처

[Olympiad ](https://www.acmicpc.net/category/2)> [한국정보올림피아드 ](https://www.acmicpc.net/category/55)> [한국정보올림피아드시․도지역본선 ](https://www.acmicpc.net/category/57)> [지역본선 2012 ](https://www.acmicpc.net/category/70)> [중등부](https://www.acmicpc.net/category/detail/1303) 1번

- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013) [kks227](https://www.acmicpc.net/user/kks227)

### 알고리즘 분류

- [구현](https://www.acmicpc.net/problem/tag/구현)

## 3832. [기초-배열연습] 2차원 배열 순서대로 채우기 1-2

### 문제

다음과 같이 2차원 배열을 출력하는 프로그램을 작성하시오.

```
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
```

### 입력

없음

### 출력

2차원 배열을 출력한다.

### 예제 입력 1

```

```

### 예제 출력 1

```
1 2 3 4 5
10 9 8 7 6
11 12 13 14 15
20 19 18 17 16
21 22 23 24 25
```

### 힌트

### 출처

[Olympiad ](https://www.acmicpc.net/category/2)> [한국정보올림피아드 ](https://www.acmicpc.net/category/55)> [한국정보올림피아드시․도지역본선 ](https://www.acmicpc.net/category/57)> [지역본선 2012 ](https://www.acmicpc.net/category/70)> [중등부](https://www.acmicpc.net/category/detail/1303) 2번

- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013) [kks227](https://www.acmicpc.net/user/kks227)

### 알고리즘 분류

- [구현](https://www.acmicpc.net/problem/tag/구현)

## 3833. [기초-배열연습] 2차원 배열 순서대로 채우기 2-1

### 문제

다음과 같이 2차원 배열을 출력하는 프로그램을 작성하시오.

```
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
```

### 입력

없음

### 출력

2차원 배열을 출력한다.

### 예제 입력 1

```

```

### 예제 출력 1

```
1 2 3 4 5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
```

### 힌트

### 출처

[Olympiad ](https://www.acmicpc.net/category/2)> [한국정보올림피아드 ](https://www.acmicpc.net/category/55)> [한국정보올림피아드시․도지역본선 ](https://www.acmicpc.net/category/57)> [지역본선 2012 ](https://www.acmicpc.net/category/70)> [중등부](https://www.acmicpc.net/category/detail/1303) 3번

- 문제의 오타를 찾은 사람: [jh05013](https://www.acmicpc.net/user/jh05013) [kks227](https://www.acmicpc.net/user/kks227)

### 알고리즘 분류

- [구현](https://www.acmicpc.net/problem/tag/구현)

## 3834. [기초-배열연습] 2차원 배열 순서대로 채우기 2-2

### 문제

다음과 같이 2차원 배열을 출력하는 프로그램을 작성하시오.

```
1 2 3 4 5
12 13 14 15 6
11 20 21 
