<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
for i in range(n+1):
    for j in range(i+1,n):
      x = i^j
      ct = 0
      while (x>0):
        x //= 2
        ct += 1
      print(ct,end=" ")
    print("")

```

### Input

The first line of input contains a single integer $n$ denoting the number of test cases.

The next $n$ lines contain a single integer each denoting the number of operations to be performed.

### Output

For each test case, print the number of operations required to perform the given operation.

### Constraints

$1 \leq n \leq 10^5$

### Example Input

```
3
1
2
3
```

### Example Output

```
1
2
3
```

### Explanation

The first test case has a single operation.

The second test case has two operations.

The third test case has three operations.
</s>
