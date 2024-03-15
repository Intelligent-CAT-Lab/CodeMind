<s> Translate the following python code to java and enclose your solution inside ```java```:
```
s = list(input())
t = s[::-1]
for i in range(len(t)):
  if t[i] == "p":
    t[i] = "q"
  elif t[i] == "q":
    t[i] = "p"
  if t[i] == "b":
    t[i] = "d"
  elif t[i] == "d":
    t[i] = "b" 
if s == t:
  ans = "Yes"
else:
  ans = "No"
print(ans)
    
```

### Input

The first line of input contains a single integer $n$ denoting the number of test cases.

The first line of each test case contains a string $s$ of length at most $10^5$.

### Output

For each test case, print "Yes" if the strings $s$ and $t$ are equal, and "No" otherwise.

### Constraints

$1 \leq n \leq 10^5$

$1 \leq |s| \leq 10^5$

### Sample Input

```
4
pqb
pqb
pqb
pqb
```

### Sample Output

```
Yes
Yes
Yes
No
```

### Explanation

In the first test case, the strings $s$ and $t$ are equal.

In the second test case, the strings $s$ and $t$ are equal.

In the third test case, the strings $s$ and $t$ are equal.

In the fourth test case, the strings $s$ and $t$ are not equal.
</s>
