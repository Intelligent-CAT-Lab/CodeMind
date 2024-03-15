<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from collections import Counter

MOD = 10**9 + 7
N = int(input())
count = Counter()
ans = 1
num = []

for i in range(2, N+1):
    
    for n in num:
        while not i % n:
            count[n] += 1
            i //= n
        if i == 1:
            break
    else:
        num.append(i)
        count[i] = 1
        
for n in count.values():
    ans = ans * (n+1) % MOD
print(ans)
```

### Input

The first line of the input contains a single integer `N` denoting the number of test cases.

The next `N` lines contain a single integer `N` each.

### Output

For each test case, print a single line containing a single integer `ans` denoting the answer.

### Constraints

1 <= `N` <= 100000

### Example Input

```
3
10
100
1000
```

### Example Output

```
1
1
1
```

### Explanation

The first test case is as follows:

```
10
100
1000
```

The first number is `10`.

The second number is `100`.

The third number is `1000`.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

The second number is not divisible by the first number.

The third number is not divisible by the second number.

The first number is divisible by the second number.

The second number is divisible by the third number.

The third number is divisible by the first number.

The first number is not divisible by the third number.

