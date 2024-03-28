<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
c = (a+b)/2
d = int(c)
if c-d>0:
  print(d+1)
else:
  print(d)
```

### Input

The first line of input contains two integers, `a` and `b`.

### Output

Print the integer `d` on a single line.

### Constraints

- `1 <= a,b <= 10^9`
- `a+b <= 10^9`

### Sample Input

```
2 3
```

### Sample Output

```
2
```

### Explanation

```
a = 2
b = 3

c = (a+b)/2 = 2.5
d = int(c) = 2

if c-d > 0:
  print(d+1) = 3
else:
  print(d) = 2
```
</s>
