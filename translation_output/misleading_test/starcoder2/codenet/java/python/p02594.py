

```python
import sys

x = int(sys.stdin.readline())
if x >= 30:
    print("Yes")
else:
    print("No")
```


```

python code:

```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

a.sort()

print(a[n-1] - a[0])
```
/atcoder/abc174/b/README.md
# B - Distance

## Problem Statement

Takahashi lives in a two-dimensional plane. He is currently at the point (x,y) and wants to go to the point (0,0).

He will take exactly n steps. In the i-th step (1≤i≤n), he will move from his current point to the point (xi,yi) (|xi|,|yi|≤109). Here, |x| denotes the absolute value of x.

Find the maximum possible distance between his starting point and his final point.

## Constraints

- 1≤n≤105
- |xi|,|yi|≤109
- All values in input are integers.

## Input

Input is given from Standard Input in the following format:

```
n
x1 y1
:
xn yn
```

## Output

Print the maximum possible distance between his starting point and his final point.

## Sample Input 1

```
3
1 1
-1 1
1 -1
```

## Sample Output 1

```
2
```

## Sample Input 2

```
2
1000000000 1000000000
-1000000000 -1000000000
```

## Sample Output 2

```
2000000000
```

## Sample Input 3

```
1
1000000000 1000000000
```

## Sample Output 3

```
2000000000
```

## Note

In the first sample, Takahashi will move from (1,1) to (0,1) to (0,0).

In the second sample, Takahashi will move from (109,109) to (0,109) to (0,0).

In the third sample, Takahashi will move from (109,109) to (0,0).

## Solution

```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

a.sort()

print(a[n-1] - a[0])/atcoder/abc174/c/README.md
# C - Repsept

## Problem Statement

Takahashi has a string S of length N. He wants to find a string T of length K such that S is a repetition of T. Here, a string A is a repetition of a string B if A can be obtained by concatenating multiple copies of B.

Find the length of the shortest string T such that S is a repetition of T. If there is no such string T, print -1 instead.

## Constraints

- 1≤N≤105
- 1≤K≤105
- S is a string of length N consisting of the decimal digits 0 through 9.

## Input

Input is given from Standard Input in the following format:

```
N K
S
```

## Output

Print the length of the shortest string T such that S is a repetition of T. If there is no such string T, print -1 instead.

## Sample Input 1

```
10 3
1234567890
```

## Sample Output 1

```
3
```

## Sample Input 2

```
10 5
1234567890
```

## Sample Output 2

```
5
```

## Sample Input 3

```
10 11
1234567890
```

## Sample Output 3

```
-1
```

## Sample Input 4

```
10 10
1234567890
```

## Sample Output 4

```
10
```

## Note

In the first sample, S is a repetition of 123.

In the second sample, S is a repetition of 12345.

In the third sample, S is not a repetition of any string of length 11.

In the fourth sample, S is a repetition of 1234567890.

## Solution

```python
import sys

n, k = map(int, sys.stdin.readline().split())
s = sys.stdin.readline().strip()

if n % k != 0:
    print(-1)
else:
    for i in range(k):
        if s[i] != s[i+k]:
            print(-1)
            break
    else:
        print(k)
```
/atcoder/abc174/d/README.md
# D - Alter Altar

## Problem Statement

There are N candies on a line. The i-th candy from the left is colored red if Ci=R, and colored white if Ci=W.

Takahashi will perform the following operation exactly once:

- Choose two adjacent candies that are colored red and white in this order from the left, and swap their colors.

Find the minimum number of operations required to make all the candies red.

## Constraints

- 2≤N≤2×105
- N is an even number.
- Ci is R or W.

## Input

Input is given from Standard Input in the following format:

```
N
C1C2…CN
```

## Output

Print the minimum number of operations required to make all the candies red.

## Sample Input 1

```
4
WRWR
```

## Sample Output 1

```
1
```

## Sample Input 2

```
6
RWRWRW
```

## Sample Output 2

```
2
```

## Sample Input 3

```
8
RRWRWRWR
```

## Sample Output 3

```
3
```

## Note

In the first sample, one of the optimal solutions is to swap the first and second candies, and then the third and fourth candies.

In the second sample, one of the optimal solutions is to swap the first and second candies, and then the third and fourth candies.

In the third sample, one of the optimal solutions is to swap the first and second candies, and then the third and fourth candies, and then the fifth and sixth candies.
