<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
N=int(input())
for h in range(1,3501):
    for n in range(h,3501):
        if 4*n*h-N*h-N*n >0:
            if (N*h*n)%(4*n*h-N*h-N*n)==0:
                w=int((N*h*n)/(4*n*h-N*h-N*n))
                print(h,n,w)
                sys.exit()
```

### Input

The first line of input contains a single integer $N$ denoting the number of test cases.

The next $N$ lines contain a single integer $h$ each.

### Output

For each test case, print the output as specified in the sample output.

### Constraints

$1 \leq N \leq 100$

$1 \leq h \leq 3500$

### Sample Input
```
3
1
2
3
```

### Sample Output
```
1 2 1
2 3 1
```

### Explanation

The first test case is $N=3$ and $h=1$.

The second test case is $N=3$ and $h=2$.

The third test case is $N=3$ and $h=3$.

### Hint

You can use the `System.exit()` method to terminate the program.
</s>
