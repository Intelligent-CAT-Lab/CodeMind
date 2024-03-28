

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

Takahashi has N balls, numbered 1, 2, ..., N.
He wants to divide the balls into two groups so that the following conditions are satisfied:

- The number of balls in Group 1 is A.
- The number of balls in Group 2 is B.
- There is no ball that belongs to both Group 1 and Group 2.

Find the number of ways to divide the balls into two groups that satisfy the conditions.

### Constraints

- 1 ≤ N ≤ 100
- 1 ≤ A, B ≤ N

### Input

Input is given from Standard Input in the following format:

```
N A B
```

### Output

Print the number of ways to divide the balls into two groups that satisfy the conditions.

### Sample Input 1

```
5 2 3
```

### Sample Output 1

```
4
```

### Sample Input 2

```
10 3 7
```

### Sample Output 2

```
0
```

### Sample Input 3

```
100 10 90
```

### Sample Output 3

```
1
```

### Note

In the first sample, there are 4 ways to divide the balls into two groups that satisfy the conditions:

- Group 1: Balls 1 and 2. Group 2: Balls 3, 4, and 5.
- Group 1: Balls 1 and 3. Group 2: Balls 2, 4, and 5.
- Group 1: Balls 1 and 4. Group 2: Balls 2, 3, and 5.
- Group 1: Balls 1 and 5. Group 2: Balls 2, 3, and 4.

In the second sample, there is no way to divide the balls into two groups that satisfy the conditions.

In the third sample, there is only one way to divide the balls into two groups that satisfy the conditions:

- Group 1: Balls 1, 2, ..., 10. Group 2: Balls 11, 12, ..., 100.

## D - String Formation

### Problem

Takahashi has a string S of length N.
He will perform the following operation zero or more times:

- Choose two integers l and r (1 ≤ l ≤ r ≤ N) and reverse the substring S[l], S[l+1], ..., S[r].

Find the lexicographically smallest string that can be obtained by performing the operation zero or more times.

### Constraints

- 1 ≤ N ≤ 200000
- S consists of lowercase English letters.

### Input

Input is given from Standard Input in the following format:

```
N
S
```

### Output

Print the lexicographically smallest string that can be obtained by performing the operation zero or more times.

### Sample Input 1

```
5
atcoder
```

### Sample Output 1

```
atcode
```

### Sample Input 2

```
10
codeforces
```

### Sample Output 2

```
codeforces
```

### Sample Input 3

```
10
redcoderes
```

### Sample Output 3

```
coderesred
```

### Note

In the first sample, the following operations are performed in this order:

- Choose l = 1 and r = 5. S becomes "tacoder".
- Choose l = 3 and r = 5. S becomes "tcodea".
- Choose l = 1 and r = 2. S becomes "atcode".

In the second sample, no operation is performed.

In the third sample, the following operations are performed in this order:

- Choose l = 1 and r = 10. S becomes "escodered".
- Choose l = 1 and r = 9. S becomes "coderesre".
- Choose l = 1 and r = 8. S becomes "coderesred".

## E - To Infinity

### Problem

Takahashi has a string S of length N.
He will perform the following operation zero or more times:

- Choose two integers l and r (1 ≤ l ≤ r ≤ N) and reverse the substring S[l], S[l+1], ..., S[r].

Find the lexicographically smallest string that can be obtained by performing the operation zero or more times.

### Constraints

- 1 ≤ N ≤ 200000
- S consists of lowercase English letters.

### Input

Input is given from Standard Input in the following format:

```
N
S
```

### Output

Print the lexicographically smallest string that can be obtained by performing the operation zero or more times.

### Sample Input 1

```
5
atcoder
```

### Sample Output 1

```
atcode
```

### Sample Input 2

```
10
codeforces
```

### Sample Output 2

```
codeforces
```

### Sample Input 3

```
10
redcoderes
```

### Sample Output 3

```
coderesred
```

### Note

In the first sample, the following operations are performed in this order:

- Choose l = 1 and r = 5. S becomes "tacoder".
- Choose l = 3 and r = 5. S becomes "tcodea".
- Choose l = 1 and r = 2. S becomes "atcode".

In the second sample, no operation is performed.

In the third sample, the following operations are performed in this order:

- Choose l = 1 and r = 10. S becomes "escodered".
- Choose l = 1 and r = 9. S becomes "coderesre".
- Choose l = 1 and r = 8. S becomes "coderesred".

## F - To Infinity

### Problem

Takahashi has a string S of length N.
He will perform the following operation zero or more times:

- Choose two integers l and r (1 ≤ l ≤ r ≤ N) and reverse the substring S[l], S[l+1], ..., S[r].

Find the lexicographically smallest string that can be obtained by performing the operation zero or more times.

### Constraints

- 1 ≤ N ≤ 200000
- S consists of lowercase English letters.

### Input

Input is given from Standard Input in the following format:

```
N
S
```

### Output

Print the lexicographically smallest string that can be obtained by performing the operation zero or more times.

### Sample Input 1

```
5
atcoder
```

### Sample Output 1

```
atcode
```

### Sample Input 2

```
10
codeforces
```

### Sample Output 2

```
codeforces
```

### Sample Input 3

```
10
red
