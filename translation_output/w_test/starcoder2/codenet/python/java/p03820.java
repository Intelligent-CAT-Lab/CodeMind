

```java

```


```

java code:

```java

```
/problems/1000/1000.md
# 1000. A+B

## Problem

Given two integers A and B, output A+B.

## Input

Each test contains 1 test case. Each test case contains a pair of integers A and B, separated by a space.

## Output

For each test case, output the sum of A and B in one line.

## Sample Input

```
1 1
```

## Sample Output

```
2
```

## Hint

A and B are between -1000 and 1000.

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
2


```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

A, B = map(int, read().split())
print(A + B)/problems/1001/1001.md
# 1001. A+B Format

## Problem

Calculate a + b and output the sum in standard format -- that is, the digits must be separated into groups of three by commas (unless there are less than four digits).

## Input

Each input file contains one test case. Each case contains a pair of integers a and b where -1000000 <= a, b <= 1000000. The numbers are separated by a space.

## Output

For each test case, you should output the sum of a and b in one line. The sum must be written in the standard format.

## Sample Input

```
-1000000 9
```

## Sample Output

```
-999,991
```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-1000000 9

Expected output:
-999,991


```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

a, b = map(int, read().split())
print(f'{a + b:,}')

```

java code:

```java

```
/problems/1002/1002.md
# 1002. A+B for Polynomials

## Problem

This time, you are supposed to find A+B where A and B are two polynomials.

## Input

Each input file contains one test case. Each case occupies 2 lines, and each line contains the information of a polynomial: K N1 aN1 N2 aN2 ... NK aNK, where K is the number of nonzero terms in the polynomial, Ni and aNi (i=1, 2, ..., K) are the exponents and coefficients, respectively. It is given that 1 <= K <= 10, 0 <= NK < ... < N2 < N1 <=1000.

## Output

For each test case you should output the sum of A and B in one line, with the same format as the input. Notice that there must be NO extra space at the end of each line. Please be accurate to 1 decimal place.

## Sample Input

```
2 1 2.4 0 3.2
2 2 1.5 1 0.5
```

## Sample Output

```
3 2 1.5 1 2.9 0 3.2
```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 2.4 0 3.2
2 2 1.5 1 0.5

Expected output:
3 2 1.5 1 2.9 0 3.2


```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

A = list(map(float, read().split()))
B = list(map(float, read().split()))

C = [0] * 1001
for i in range(1, int(A[0]) + 1):
    C[int(A[2 * i])] += A[2 * i + 1]
for i in range(1, int(B[0]) + 1):
    C[int(B[2 * i])] += B[2 * i + 1]

ans = []
for i in range(1000, -1, -1):
    if C[i] != 0:
        ans.append(i)
        ans.append(C[i])
print(len(ans) // 2, *ans)

```

java code:

```java

```
/problems/1003/1003.md
# 1003. Emergency

## Problem

As an emergency rescue team leader of a city, you are given a special map of your country. The map shows several scattered cities connected by some roads. Amount of rescue teams in each city and the length of each road between any pair of cities are marked on the map. When there is an emergency call to you from some other city, your job is to lead your men to the place as quickly as possible, and at the mean time, call up as many hands on the way as possible.

## Input

Each input file contains one test case. For each test case, the first line contains 4 positive integers: N (<= 500) -
