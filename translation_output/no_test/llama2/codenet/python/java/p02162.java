<s> Translate the following python code to java and enclose your solution inside ```java```:
```
t1,t2,r1,r2 = map(int,input().split())
if r1 == -1 or r2 == -1:
    if t1 < t2:
        print('Alice')
    elif t1 > t2:
        print('Bob')
    else:
        print('Draw')
elif r1 > r2:
    print('Alice')
elif r1 < r2:
    print('Bob')
else:
    print('Draw')

```

### Input

The first line of input contains an integer $t$ denoting the number of test cases.

The first line of each test case contains four space-separated integers $t_1, t_2, r_1, r_2$ denoting the time taken by Alice, Bob and the result of the first round respectively.

### Output

For each test case, print "Alice" if Alice wins, "Bob" if Bob wins and "Draw" if the result is a draw.

### Constraints

$1 \leq t \leq 10^5$

$1 \leq t_1, t_2, r_1, r_2 \leq 10^9$

### Sample Input

```
3
1 2 1 1
2 1 1 1
1 1 1 1
```

### Sample Output

```
Alice
Bob
Draw
```

### Explanation

In the first test case, Alice takes 1 second to reach the finish line, Bob takes 2 seconds to reach the finish line and the result of the first round is 1.

In the second test case, Alice takes 1 second to reach the finish line, Bob takes 1 second to reach the finish line and the result of the first round is 1.

In the third test case, Alice takes 1 second to reach the finish line, Bob takes 1 second to reach the finish line and the result of the first round is 1.
</s>
