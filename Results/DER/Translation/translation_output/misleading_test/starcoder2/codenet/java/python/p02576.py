
```python
n, x, t = map(int, input().split())
ans = 0
tako = 0
while n > tako:
    ans += t
    tako += x
print(ans)
```

## 2.2.2.2. 1000번

[1000번](https://www.acmicpc.net/problem/1000)

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A+B를 출력한다.

예제 입력 1 
1 2
예제 출력 1 
3

```python
a, b = map(int, input().split())
print(a+b)
```

## 2.2.2.3. 1001번

[1001번](https://www.acmicpc.net/problem/1001)

두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A-B를 출력한다.

예제 입력 1 
3 2
예제 출력 1 
1

```python
a, b = map(int, input().split())
print(a-b)
```

## 2.2.2.4. 10998번

[10998번](https://www.acmicpc.net/problem/10998)

두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A×B를 출력한다.

예제 입력 1 
1 2
예제 출력 1 
2

```python
a, b = map(int, input().split())
print(a*b)
```

## 2.2.2.5. 1008번

[1008번](https://www.acmicpc.net/problem/1008)

두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

출력
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

예제 입력 1 
1 3
예제 출력 1 
0.33333333333333333333333333333333

```python
a, b = map(int, input().split())
print(a/b)
```

## 2.2.2.6. 10869번

[10869번](https://www.acmicpc.net/problem/10869)

두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. 

입력
두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

출력
첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

예제 입력 1 
7 3
예제 출력 1 
10
4
21
2
1

```python
a, b = map(int, input().split())
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)
```

## 2.2.2.7. 10430번

[10430번](https://www.acmicpc.net/problem/10430)

(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

출력
첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.

예제 입력 1 
5 8 4
예제 출력 1 
1
1
0
0

```python
a, b, c = map(int, input().split())
print((a+b)%c)
print((a%c + b%c)%c)
print((a*b)%c)
print((a%c * b%c)%c)
```

## 2.2.2.8. 2588번

[2588번](https://www.acmicpc.net/problem/2588)

(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

![2588](https://www.acmicpc.net/upload/images/f5NhGHVLM4Ix74DtJrwfC97KepPl27s%20(1).png)

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

예제 입력 1 
472
385
예제 출력 1 
2360
3776
1416
181720

```python
a = int(input())
b = int(input())
print(a*(b%10))
print(a*((b//10)%10))
print(a*(b//100))
print(a*b)
```

## 2.2.2.9. 10871번

[10871번](https
