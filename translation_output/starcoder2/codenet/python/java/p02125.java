
```java

```
/problems/0001/README.md
# Problem 1

## Description

Write a program that reads a number and prints the sum of the digits of the number.

## Input

The input is a single integer.

## Output

The output is a single integer.

## Sample Input

```
123
```

## Sample Output

```
6
```

## Solution

```python
n = int(input())
ans = 0
while n > 0:
    ans += n % 10
    n //= 10
print(ans)
```


## Sample Input

```
123
```

## Sample Output

```
321
```

## Solution

```python
n = int(input())
ans = 0
while n > 0:
    ans = ans * 10 + n % 10
    n //= 10
print(ans)
```
/problems/0002/README.md
# Problem 2

## Description

Write a program that reads a number and prints the reverse of the number.

## Input

The input is a single integer.

## Output

The output is a single integer./problems/0003/README.md
# Problem 3

## Description

Write a program that reads a number and prints the sum of the digits of the number.

## Input

The input is a single integer.

## Output

The output is a single integer.

## Sample Input

```
123
```

## Sample Output

```
6
```

## Solution

```python
n = int(input())
ans = 0
while n > 0:
    ans += n % 10
    n //= 10
print(ans)
```
/problems/0004/README.md
# Problem 4

## Description

Write a program that reads a number and prints the reverse of the number.

## Input

The input is a single integer.

## Output

The output is a single integer.

## Sample Input

```
123
```

## Sample Output

```
321
```

## Solution

```python
n = int(input())
ans = 0
while n > 0:
    ans = ans * 10 + n % 10
    n //= 10
print(ans)
```

