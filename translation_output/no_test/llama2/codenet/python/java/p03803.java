<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = [int(x) for x in input().split()]
j = [2,3,4,5,6,7,8,9,10,11,12,13,1]
if j.index(a) > j.index(b):
  print('Alice')
elif j.index(a) < j.index(b):
  print('Bob')
else:
  print('Draw')

```

### Input

The first line of input contains two integers, $a$ and $b$, separated by a space.

### Output

Print "Alice" if $a$ is greater than $b$, "Bob" if $a$ is less than $b$, and "Draw" if $a$ and $b$ are equal.

### Constraints

$1 \leq a,b \leq 10^5$

### Hint

Use the `java.util.Arrays` class to find the index of an element in an array.

### Example

```
Input:
2 3

Output:
Alice
```
</s>
