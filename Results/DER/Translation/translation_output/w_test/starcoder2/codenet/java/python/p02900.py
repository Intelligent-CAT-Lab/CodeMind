

```python
def gcd(n, m):
    if m == 0:
        return n
    return gcd(m, n % m)

def factors(n):
    fact = set()
    fact.add(1)
    for i in range(2, int(n**0.5)+1):
        while n % i == 0:
            fact.add(i)
            n //= i
    if n > 1:
        fact.add(n)
    return fact

a, b = map(int, input().split())
print(len(factors(gcd(a, b))))
```


```

python code:

```python
n = int(input())
print(n//2 + 1)
```
/BeginnerContest142/p02901.md
# Problem 02901

## Problem Statement

You are given an integer n. Find the number of integers x such that 1 ≤ x ≤ n and x is divisible by 2.

## Input

The first line contains a single integer n (1 ≤ n ≤ 1000).

## Output

Print a single integer — the number of integers x such that 1 ≤ x ≤ n and x is divisible by 2.

## Sample Input 1

```
10
```

## Sample Output 1

```
6
```

## Sample Input 2

```
1
```

## Sample Output 2

```
1
```

## Sample Input 3

```
2
```

## Sample Output 3

```
2
```

## Sample Input 4

```
3
```

## Sample Output 4

```
2
```

## Sample Input 5

```
4
```

## Sample Output 5

```
3
```

## Sample Input 6

```
5
```

## Sample Output 6

```
3
```

## Sample Input 7

```
6
```

## Sample Output 7

```
4
```

## Sample Input 8

```
7
```

## Sample Output 8

```
4
```

## Sample Input 9

```
8
```

## Sample Output 9

```
5
```

## Sample Input 10

```
9
```

## Sample Output 10

```
5
```

## Sample Input 11

```
10
```

## Sample Output 11

```
6
```

## Sample Input 12

```
1000
```

## Sample Output 12

```
501
```

## Sample Input 13

```
1000000000
```

## Sample Output 13

```
500000001
```

## Sample Input 14

```
1000000000000000000
```

## Sample Output 14

```
500000000000000001
```

## Sample Input 15

```
1000000000000000000
```

## Sample Output 15

```
500000000000000001
```

## Sample Input 16

```
1000000000000000000
```

## Sample Output 16

```
500000000000000001
```

## Sample Input 17

```
1000000000000000000
```

## Sample Output 17

```
500000000000000001
```

## Sample Input 18

```
1000000000000000000
```

## Sample Output 18

```
500000000000000001
```

## Sample Input 19

```
1000000000000000000
```

## Sample Output 19

```
500000000000000001
```

## Sample Input 20

```
1000000000000000000
```

## Sample Output 20

```
500000000000000001
```

## Sample Input 21

```
1000000000000000000
```

## Sample Output 21

```
500000000000000001
```

## Sample Input 22

```
1000000000000000000
```

## Sample Output 22

```
500000000000000001
```

## Sample Input 23

```
1000000000000000000
```

## Sample Output 23

```
500000000000000001
```

## Sample Input 24

```
1000000000000000000
```

## Sample Output 24

```
500000000000000001
```

## Sample Input 25

```
1000000000000000000
```

## Sample Output 25

```
500000000000000001
```

## Sample Input 26

```
100000000000000000
