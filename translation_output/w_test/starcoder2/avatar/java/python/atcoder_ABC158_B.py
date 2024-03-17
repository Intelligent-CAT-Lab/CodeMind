

```python
N, A, B = map(int, input().split())
base = N // (A + B)
mod = N % (A + B)
if mod >= A:
    mod = A
print(base * A + mod)
```

## C - Count Balls

### Problem

Takahashi has N balls, numbered 1,2,…,N. The i-th ball has a color C_i.

He wants to divide the balls into two groups so that the following conditions are satisfied:

The number of balls in the first group is A.
The number of balls in the second group is B.
The number of balls with color 1 in the first group is A_1.
The number of balls with color 2 in the first group is A_2.
The number of balls with color 3 in the first group is A_3.
The number of balls with color 1 in the second group is B_1.
The number of balls with color 2 in the second group is B_2.
The number of balls with color 3 in the second group is B_3.
Find the number of ways to divide the balls into two groups that satisfy the conditions. Find the answer modulo 10^9+7.

### Constraints

All values in input are integers.
1≤N≤10^5
1≤A,B≤N
1≤C_i≤3
1≤A_1,A_2,A_3≤A
1≤B_1,B_2,B_3≤B
A_1+A_2+A_3=A
B_1+B_2+B_3=B

### Input

Input is given from Standard Input in the following format:

N A B
A_1 A_2 A_3
B_1 B_2 B_3

### Output

Print the number of ways to divide the balls into two groups that satisfy the conditions. Find the answer modulo 10^9+7.

### Sample Input 1

```
3 2 1
1 1 1
1 1 0
```

### Sample Output 1

```
3
```

### Sample Input 2

```
10 5 5
2 3 5
2 3 5
```

### Sample Output 2

```
1
```

### Sample Input 3

```
100000 10000 10000
10000 10000 10000
10000 10000 10000
```

### Sample Output 3

```
1000000006
```

### Note

In the first sample, there are three ways to divide the balls into two groups that satisfy the conditions:

- Group 1: Balls 1 and 2. Group 2: Ball 3.
- Group 1: Ball 1. Group 2: Balls 2 and 3.
- Group 1: Balls 2 and 3. Group 2: Ball 1.

In the second sample, there is only one way to divide the balls into two groups that satisfy the conditions:

- Group 1: Balls 1,2,3,4,5. Group 2: Balls 6,7,8,9,10.

In the third sample, there are 10^5 ways to divide the balls into two groups that satisfy the conditions.

## D - String Formation

### Problem

Takahashi has a string S of length N. He wants to make a new string T by repeating the following operation some number of times:

Choose a character in S and insert it at the beginning or end of T.
Find the lexicographically smallest string T that can be obtained in this way.

### Constraints

All values in input are integers.
1≤N≤10^5
S consists of lowercase English letters.

### Input

Input is given from Standard Input in the following format:

N
S

### Output

Print the lexicographically smallest string T that can be obtained in this way.

### Sample Input 1

```
3
cba
```

### Sample Output 1

```
abc
```

### Sample Input 2

```
5
abcde
```

### Sample Output 2

```
abcde
```

### Sample Input 3

```
10
codeforces
```

### Sample Output 3

```
codeforces
```

### Note

In the first sample, T can be obtained in the following way:

- Choose the character c and insert it at the beginning of T. T becomes c.
- Choose the character b and insert it at the end of T. T becomes cb.
- Choose the character a and insert it at the beginning of T. T becomes abc.

In the second sample, T can be obtained in the following way:

- Choose the character a and insert it at the beginning of T. T becomes a.
- Choose the character b and insert it at the end of T. T becomes ab.
- Choose the character c and insert it at the end of T. T becomes abc.
- Choose the character d and insert it at the end of T. T becomes abcd.
- Choose the character e and insert it at the end of T. T becomes abcde.

In the third sample, T can be obtained in the following way:

- Choose the character c and insert it at the beginning of T. T becomes c.
- Choose the character o and insert it at the end of T. T becomes co.
- Choose the character d and insert it at the end of T. T becomes cod.
- Choose the character e and insert it at the end of T. T becomes code.
- Choose the character f and insert it at the end of T. T becomes codef.
- Choose the character o and insert it at the end of T. T becomes codefo.
- Choose the character r and insert it at the end of T. T becomes codefor.
- Choose the character c and insert it at the end of T. T becomes codeforces.

## E - To Infinity

### Problem

Takahashi has a string S of length N. He wants to make a new string T by repeating the following operation some number of times:

Choose a character in S and insert it at the beginning or end of T.
Find the lexicographically smallest string T that can be obtained in this way.

### Constraints

All values in input are integers.
1≤N≤10^5
S consists of lowercase English letters.

### Input

Input is given from Standard Input in the following format:

N
S

### Output

Print the lexicographically smallest string T that can be obtained in this way.

### Sample Input 1

```
3
cba
```

### Sample Output 1

```
abc
```

### Sample Input 2

```
5
abcde
```

### Sample Output 2

```
abcde
```

### Sample Input 3

```
10
codeforces
```

### Sample Output 3

```
codeforces
```

### Note

In the first sample, T can be obtained in the following way:

- Choose the character c and insert it at the beginning of T. T becomes c.
- Choose the character b and insert it at the end of
