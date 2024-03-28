<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial as f
S = raw_input()
lS = len(S)
d = [S.count(i) for i in set(list(S))]
dd = sum([i%2 for i in d])
if (lS%2 == 0 and dd != 0 ) or (lS%2 == 1 and dd != 1): 
		print 0
else:
	dnm = 1
	for i in d:
		dnm *= f(i/2)
	print f(lS/2)/dnm
```

### Input

The first line contains a single integer `T` denoting the number of test cases.

The first line of each test case contains a single integer `N` denoting the length of the string.

The second line contains the string `S`.

### Output

For each test case, print a single line containing the answer to the problem.

### Constraints

1 <= T <= 100

1 <= N <= 1000

### Sample Input

```
2
10
01010010
```

### Sample Output

```
0
1
```

### Explanation

In the first test case, the string `S` is `01010010`.

The string `S` has an even length, so the answer is `0`.

In the second test case, the string `S` is `1010010`.

The string `S` has an odd length, so the answer is `1`.
</s>
