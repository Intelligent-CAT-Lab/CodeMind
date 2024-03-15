<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
import numpy as np

n = int(sys.stdin.readline().strip())
a = int(np.sqrt(n))
print(str(a*a))
```

### Input

- The first line contains an integer `n` denoting the number of test cases.
- The next `n` lines contain an integer `n` each.

### Output

- For each test case, print the square root of the given number.

### Constraints

- `1 <= n <= 10^5`
- `1 <= n <= 10^9`

### Example

```
Input:
3
1
2
3

Output:
1
1.4142135623730951
1.7320508075688772

Input:
10
1
2
3
4
5
6
7
8
9
10

Output:
1
1.4142135623730951
1.7320508075688772
1.9641016337931006
2.2360679774997902
2.5000000000000000
2.7777777777777778
3.0555555555555556
3.3162277655172414
3.5773709523808594
3.8388198749803922
4.0999999999999998

Input:
1000000
1
2
3
4
5
6
7
8
9
10

Output:
1
1.4142135623730951
1.7320508075688772
1.9641016337931006
2.2360679774997902
2.5000000000000000
2.7777777777777778
3.0555555555555556
3.3162277655172414
3.5773709523808594
3.8388198749803922
4.0999999999999998
```
</s>
