<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```

### Input

The first line of input contains a single integer $T$ denoting the number of test cases.

The first line of each test case contains a single integer $N$ denoting the number of elements in the list.

The second line of each test case contains $N$ space-separated integers denoting the elements of the list.

### Output

For each test case, print a single line containing the string "YES" if the list is sorted and "NO" otherwise.

### Constraints

$1 \leq T \leq 10^5$

$1 \leq N \leq 10^5$

### Sample Input

```
2
4
1 2 3 4
5
1 2 3 4 5
```

### Sample Output

```
YES
NO
```

### Explanation

In the first test case, the list is sorted.

In the second test case, the list is not sorted.
</s>
