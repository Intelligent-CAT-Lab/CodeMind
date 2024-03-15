<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,C,X,Y = map(int,input().split())

mi = min(X,Y)
a = A*X+B*Y
b = mi*C*2+A*(X-mi)+B*(Y-mi)
c = max(X,Y)*C*2

print(min(a,b,c))
```

### Input

The first line contains an integer T, the number of test cases.

Each test case contains 5 integers A,B,C,X,Y.

### Output

For each test case, print the minimum of a,b,c.

### Constraints

1 <= T <= 100

1 <= A,B,C <= 1000

1 <= X,Y <= 1000

### Sample Input

```
2
1 2 3 10 20
1 2 3 10 20
```

### Sample Output

```
10
10
```

### Explanation

In the first test case,

```
a = 10*10+2*20 = 120
b = 10*3*2+1*10+2*20 = 120
c = 10*3*2+1*10+2*20 = 120
```

So, the minimum of a,b,c is 10.

In the second test case,

```
a = 10*10+2*20 = 120
b = 10*3*2+1*10+2*20 = 120
c = 10*3*2+1*10+2*20 = 120
```

So, the minimum of a,b,c is 10.

### Hint

You can use the following functions to solve this problem:

- ```min()```
- ```max()```
- ```map()```
- ```split()```
- ```int()```
</s>
