
```
import sys

def pow(base, n):
    retVal = 1
    while n > 0:
        if n & 1 == 1:
            retVal *= base
        n >>= 1
        base *= base
    return retVal

def solve():
    x = int(sys.stdin.readline())
    powMap = {}
    powMap[0] = 0
    powMap[1] = 1
    beforePow = 1
    base = 2
    while True:
        powVal = pow(base, 5)
        powMap[powVal] = base
        if powVal - beforePow > x:
            break
        base += 1
        beforePow = powVal

    for powVal, base in powMap.items():
        diff = abs(x - powVal)
        if diff in powMap:
            print(base, end=' ')
            if powVal - x < 0:
                print('-'+str(powMap[diff]))
            else:
                print(powMap[diff])
            return

solve()
```

## 2691. [모의 SW 역량테스트] 숫자 게임

### 문제

N개의 숫자가 주어지면, 이 중에서 3개의 숫자를 골라 합이 가장 큰 값을 구하려고 한다. 단, 3개의 숫자는 모두 달라야 한다.

예를 들어, 5개의 숫자가 다음과 같이 주어질 경우,

1 2 3 4 5

가능한 모든 경우를 나열해 보면,

1 2 3
1 2 4
1 2 5
1 3 4
1 3 5
1 4 5
2 3 4
2 3 5
2 4 5
3 4 5

이 중 합이 가장 큰 경우는 1 4 5이다. 따라서 답은 1+4+5 = 10이 된다.

N개의 숫자가 주어질 때, 가능한 모든 경우에서 합이 가장 큰 값을 출력하는 프로그램을 작성하시오.

### 입력

첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

각 테스트 케이스의 첫 번째 줄에는 하나의 정수 N (3 ≤ N ≤ 100) 이 주어진다.

다음 줄에는 N개의 서로 다른 정수가 공백으로 구분되어 주어진다. 각 정수는 1이상 100,000이하이다.

### 출력

각 테스트 케이스마다 ‘#x’(x는 테스트케이스 번호를 의미하며 1부터 시작한다)를 출력하고,

각 테스트 케이스마다 가능한 모든 경우에서 합이 가장 큰 값을 출력한다.

### 예제 입력 1

```
3
5
1 2 3 4 5
6
1 2 3 4 5 6
7
1 2 3 4 5 6 7
```

### 예제 출력 1

```
#1 10
#2 15
#3 21
```

### 풀이

```python
import sys

def solve():
    n = int(sys.stdin.readline())
    nums = list(map(int, sys.stdin.readline().split()))
    nums.sort(reverse=True)
    print(nums[0] + nums[1] + nums[2])

t = int(sys.stdin.readline())
for i in range(t):
    print('#'+str(i+1), end=' ')
    solve()
```

## 2692. [모의 SW 역량테스트] 숫자 카드

### 문제

숫자 카드는 정수를 표현하기 위해 사용하는 카드이다. 숫자 카드는 0부터 9까지의 숫자가 하나씩 적혀있는 카드로, 각 숫자 카드는 1장씩만 존재한다. 이 숫자 카드들을 이용해 숫자를 표현하려고 한다. 예를 들어, 123을 표현하기 위해 1장의 1, 1장의 2, 1장의 3을 사용한다.

숫자 카드들이 주어질 때, 숫자를 표현하는데 필요한 숫자 카드의 최소 개수를 구하는 프로그램을 작성하시오.

### 입력

첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

각 테스트 케이스
