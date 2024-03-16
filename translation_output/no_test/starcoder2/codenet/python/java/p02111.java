
```java

```


```

java code:
```java

```
/python/001_print_function.md
# Print Function

## Problem

Read an integer $N$.

Without using any string methods, try to print the following:
$123...N$

Note that "..." represents the values in between.

## Input Format

The first line contains an integer $N$.

## Output Format

Output the answer as explained in the task.

## Sample Input

```
3
```

## Sample Output

```
123
```

## Solution

python code:
```python
print(*range(1,int(input())+1),sep='')/python/002_division.md
# Division

## Problem

Read two integers and print two lines. The first line should contain integer division, $a//b$. The second line should contain float division, $a/b$.

You don't need to perform any rounding or formatting operations.

## Input Format

The first line contains the first integer, $a$. The second line contains the second integer, $b$.

## Output Format

Print the two lines as described above.

## Sample Input

```
4
3
```

## Sample Output

```
1
1.33333333333
```

## Solution

python code:
```python
a = int(input())
b = int(input())
print(a//b)
print(a/b)
```

java code:
```java

```
/python/003_loops.md
# Loops

## Problem

Read an integer $N$. For all non-negative integers $i<N$, print $i^{2}$. See the sample for details.

## Input Format

The first and only line contains the integer, $N$.

## Constraints

$1 \leq N \leq 20$

## Output Format

Print $N$ lines, one corresponding to each $i$.

## Sample Input

```
5
```

## Sample Output

```
0
1
4
9
16
```

## Solution

python code:
```python
n = int(input())
for i in range(n):
    print(i**2)
```

java code:
```java

```

