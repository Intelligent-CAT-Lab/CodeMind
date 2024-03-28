<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import math
def readinput():
    a,b,c,d=map(int,input().split())
    return a,b,c,d

def main(a,b,c,d):
    lcm=c*d//math.gcd(c,d)
    #print(lcm)
    return b-a+1 - ( b//c-(a-1)//c + b//d-(a-1)//d - ( b//lcm - (a-1)//lcm ) )


if __name__=='__main__':
    a,b,c,d=readinput()
    ans=main(a,b,c,d)
    print(ans)

```

### Input

The first line of input contains an integer $T$ denoting the number of test cases.

The first line of each test case contains four space-separated integers $a,b,c,d$ denoting the number of apples, bananas, coconuts and dates respectively.

### Output

For each test case, print the number of days required to finish the task.

### Constraints

$1 \leq T \leq 100$

$1 \leq a,b,c,d \leq 10^5$

### Sample Input

```
3
1 2 3 4
1 2 3 4
1 2 3 4
```

### Sample Output

```
1
1
1
```

### Explanation

In the first test case, the number of days required to finish the task is 1.

In the second test case, the number of days required to finish the task is 1.

In the third test case, the number of days required to finish the task is 1.
</s>
