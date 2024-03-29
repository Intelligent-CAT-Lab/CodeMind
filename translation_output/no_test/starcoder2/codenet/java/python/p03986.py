
```
x = input()
c = 0
len = 0
for i in range(len(x)):
    if x[i] == 'T':
        c -= 1
    else:
        if c < 0:
            len -= c
            c = 1
        else:
            c += 1
len += abs(c)
print(len)
```

## 4. 10828번 스택

### 문제
정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.

- push X: 정수 X를 스택에 넣는 연산이다.
- pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
- size: 스택에 들어있는 정수의 개수를 출력한다.
- empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
- top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

### 입력
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

### 출력
출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.

### 예제 입력 1 
```
14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top
```

### 예제 출력 1 
```
2
2
0
2
1
-1
0
1
-1
0
3
```

### 예제 입력 2 
```
7
pop
top
push 123
top
pop
top
pop
```

### 예제 출력 2 
```
-1
-1
123
123
-1
-1
```

### 예제 입력 3 
```
18
push 1
push 2
push 3
push 4
push 5
push 6
push 7
push 8
push 9
push 10
pop
pop
pop
pop
pop
pop
pop
pop
pop
```

### 예제 출력 3 
```
10
9
8
7
6
5
4
3
2
1
-1
```

### 예제 입력 4 
```
4
push 1
push 2
pop
top
```

### 예제 출력 4 
```
2
1
```

### 예제 입력 5 
```
1
empty
```

### 예제 출력 5 
```
1
```

### 예제 입력 6 
```
1
size
```

### 예제 출력 6 
```
0
```

### 예제 입력 7 
```
1
top
```

### 예제 출력 7 
```
-1
```

### 예제 입력 8 
```
1
pop
```

### 예제 출력 8 
```
-1
```

### 예제 입력 9 
```
1
push 1
```

### 예제 출력 9 
```
1
```

### 예제 입력 10 
```
1
push 1
```

### 예제 출력 10 
```
1
```

### 예제 입력 11 
```
1
push 1
```

### 예제 출력 11 
```
1
```

### 예제 입력 12 
```
1
push 1
```

### 예제 출력 12 
```
1
```

### 예제 입력 13 
```
1
push 1
```

### 예제 출력 13 
```
1
```

### 예제 입력 14 
```
1
push 1
```

### 예제 출력 14 
```
1
```

### 예제 입력 15 
```
1
push 1
```

### 예제 출력 15 
```
1
```

### 예제 입력 16 
```
1
push 1
```

### 예제 출력 16 
```
1
```

### 예제 입력 17 
```
1
push 1
```

### 예제 출력 17 
```
1
```

### 예제 입력 18 
```
1
push 1
```

### 예제 출력 18 
```
1
```

### 예제 입력 19 
```
1
push 1
```

### 예제 출력 19 
```
1
```

### 예제 입력 20 
```
1
push 1
```

### 예제 출력 20 
```
1
```

### 예제 입력 21 
```
1
push 1
```

### 예제 출력 21 
```
1
```

### 예제 입력 22 
```
1
push 1
```

### 예제 출력 22 
```
1
```

### 예제 입력 23 
```
1
push 1
```

### 예제 출력 23 
```
1
```

### 예제 입력 24 
```
1
push 1
```

### 예제 출력 24 
```
1
```

### 예제 입력 25 
```
1
push 1
```

### 예제 출력 25 
```
1
```

### 예제 입력 26 
```
1
push 1
```

### 예제 출력 26 
```
1
```

### 예제 입력 27 
```
1
push 1
```

### 예제 출력 27 
```
1
```

### 예제 입력 28 
```
1
push 1
```

### 예제 출력 28 
```
1
```

### 예제 입력 29 
```
1
push 1
```

### 예제 출력 29 
```
1
```

### 예제 입력 30 
```
1
push 1
```

### 예제 출력 30 
```
1
```

### 예제 입력 31 
```
1
push 1
```

### 예제 출력 31 
```
1
```

### 예제 입력 32 
```
1
push 1
```

### 예제 출력 32 
```
1
```

### 예제 입력 33 
```
1
push 1
```

### 예제 출력 33 
```
1
```

### 예제 입력 34 
```
1
push 1
```

### 예제 출력 34 
```
1
```

### 예제 입력 35 
