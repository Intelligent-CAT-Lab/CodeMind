<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])
```

### Input

The first line of input contains a single integer $T$ denoting the number of test cases.

The first line of each test case contains four space-separated integers $a,b,c,d$ denoting the values of the four variables.

### Output

For each test case, print the string "YNeos" or "Neos" depending on the value of the expression.

### Constraints

$1 \leq T \leq 100$

$0 \leq a,b,c,d \leq 10^9$

### Sample Input

```
3
1 2 3 4
1 2 3 4
1 2 3 4
```

### Sample Output

```
YNeos
Neos
Neos
```

### Explanation

In the first test case, the expression is true, so the output is "YNeos".

In the second test case, the expression is false, so the output is "Neos".

In the third test case, the expression is false, so the output is "Neos".
</s>
