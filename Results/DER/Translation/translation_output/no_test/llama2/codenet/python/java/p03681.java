<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
MAX = 10**9+7
N, M = map(int, input().split())
diff = N-M
if abs(diff)>1:
    print(0)
elif diff == 0:
    print(factorial(N)*factorial(M)*2%MAX)
else:
    print(factorial(N)*factorial(M)%MAX)
```

### Input

The first line contains two integers N and M.

### Output

Print the answer modulo MAX.

### Constraints

1 <= N, M <= 10^9+7

### Example

```
Input:
N = 5
M = 3

Output:
120
```

### Explanation

```
N = 5
M = 3

diff = N-M = 5-3 = 2

factorial(N) = 5! = 1*2*3*4*5 = 120
factorial(M) = 3! = 1*2*3 = 6

factorial(N)*factorial(M) = 120*6 = 720

720%MAX = 720%10^9+7 = 720%10^9 = 720%1000000007 = 720%100000000 = 720%1000000 = 720%100000 = 720%10000 = 720%1000 = 720%100 = 720%10 = 720%1 = 720

```
</s>
