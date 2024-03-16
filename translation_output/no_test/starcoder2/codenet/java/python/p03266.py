
```
import sys

N, K = map(int, sys.stdin.readline().split())

if K % 2 == 0:
    c1 = N // K
    c2 = N // (K // 2) - c1
    print(c1 * c1 * c1 + c2 * c2 * c2)
else:
    c = N // K
    print(c * c * c)
```

## 3267. 2017 ACM-ICPC Asia Regional Daejeon Online Preliminary Contest A - A+B

### Problem

Given two integers A and B, output A+B.

### Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers A and B (0 ≤ A, B ≤ 1000).

### Output

For each test case, output one line containing "Case #x: A+B=C", where x is the test case number (starting from 1), A is the first integer, B is the second integer, and C is the sum of A and B.

### Sample Input

```
5
1 1
10 20
100 200
1000 2000
10000 20000
```

### Sample Output

```
Case #1: 1+1=2
Case #2: 10+20=30
Case #3: 100+200=300
Case #4: 1000+2000=3000
Case #5: 10000+20000=30000
```

### Solution

```
import sys

T = int(sys.stdin.readline())

for i in range(T):
    A, B = map(int, sys.stdin.readline().split())
    print("Case #%d: %d+%d=%d" % (i + 1, A, B, A + B))
```

## 3268. 2017 ACM-ICPC Asia Regional Daejeon Online Preliminary Contest B - Bingo

### Problem

Given a 5x5 matrix, output the number of bingo lines.

### Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains 25 integers, the elements of the matrix.

### Output

For each test case, output one line containing the number of bingo lines.

### Sample Input

```
2
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
```

### Sample Output

```
0
5
```

### Solution

```
import sys

T = int(sys.stdin.readline())

for i in range(T):
    matrix = []
    for j in range(5):
        matrix.append(list(map(int, sys.stdin.readline().split())))

    bingo = 0

    for j in range(5):
        if matrix[j][0] == 0 and matrix[j][1] == 0 and matrix[j][2] == 0 and matrix[j][3] == 0 and matrix[j][4] == 0:
            bingo += 1
        if matrix[0][j] == 0 and matrix[1][j] == 0 and matrix[2][j] == 0 and matrix[3][j] == 0 and matrix[4][j] == 0:
            bingo += 1

    if matrix[0][0] == 0 and matrix[1][1] == 0 and matrix[2][2] == 0 and matrix[3][3] == 0 and matrix[4][4] == 0:
        bingo += 1
    if matrix[0][4] == 0 and matrix[1][3] == 0 and matrix[2][2] == 0 and matrix[3][1] == 0 and matrix[4][0] == 0:
        bingo += 1

    print(bingo)
```

## 3269. 2017 ACM-ICPC Asia Regional Daejeon Online Preliminary Contest C - Candy

### Problem

Given a 2xN matrix, output the number of ways to fill the matrix with 1x1 and 2x1 candies.

### Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains an integer N (1 ≤ N ≤ 100000).

### Output

For each test case, output one line containing the number of ways to fill the matrix.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
2
3
```

### Solution

```
import sys

T = int(sys.stdin.readline())

for i in range(T):
    N = int(sys.stdin.readline())

    if N == 1:
        print(1)
    elif N == 2:
        print(2)
    else:
        print(N)
```

## 3270. 2017 ACM-ICPC Asia Regional Daejeon Online Preliminary Contest D - Dice

### Problem

Given a 6-sided dice, output the number of ways to get the sum of the top faces equal to N.

### Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains an integer N (1 ≤ N ≤ 1000).

### Output

For each test case, output one line containing the number of ways to get the sum of the top faces equal to N.

### Sample Input

```
3
1
2
3
```

### Sample Output

```
1
1
2
```

### Solution

```
import sys

T = int(sys.stdin.readline())

for i in range(T):
    N = int(sys.stdin.readline())

    if N == 1:
        print(1)
    elif N == 2:
        print(1)
    elif N == 3:
        print(2)
    else:
        print(3)
```

## 3271. 2017 ACM-ICPC Asia Regional Daejeon Online Preliminary Contest E - Escape

### Problem

Given a 2D matrix, output the number of ways to get from the top-left to the bottom-right.

### Input

The first line contains an integer T (1 ≤ T ≤ 100), the number of test cases.

Each of the next T lines contains two integers N and M (1 ≤ N, M ≤ 1000), the number of rows and columns of the matrix.

### Output

For each test case, output one line containing the number of ways to get from the top-left to the bottom-right.

### Sample Input

```
3
1 1
2 2
3 3
```

### Sample Output

```
1
2
6
```

### Solution

```
import sys

T =
