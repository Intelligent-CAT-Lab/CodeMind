<s> Translate the following python code to java and enclose your solution inside ```java```:
```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```

### Input

The first line of input contains a single integer $n$ ($1 \leq n \leq 10^5$) denoting the number of test cases.

The first line of each test case contains a single integer $m$ ($1 \leq m \leq 10^5$) denoting the number of elements in the array.

The second line of each test case contains $m$ space-separated integers denoting the elements of the array.

### Output

For each test case, print the corresponding answer.

### Constraints

- $1 \leq n \leq 10^5$
- $1 \leq m \leq 10^5$
- $1 \leq S[i] \leq 10^9$

### Sample Input

```
3
3
1 2 3
2
1 2
2
1 2
```

### Sample Output

```
A
B
C
```

### Explanation

```
Input:
3
3
1 2 3
2
1 2
2
1 2

Output:
A
B
C
```

### Hint

- Use the ```java.util.Arrays``` class to find the index of the maximum element in the array.
- Use the ```java.util.Arrays``` class to find the index of the first element in the array.
- Use the ```java.util.Arrays``` class to find the index of the second element in the array.
- Use the ```java.util.Arrays``` class to find the index of the third element in the array.
</s>
