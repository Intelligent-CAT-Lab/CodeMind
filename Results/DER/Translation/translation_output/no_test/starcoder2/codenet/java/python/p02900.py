
```
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
```
n = int(input())
print(n//2 + 1)
```
/BeginnerContest142/p02900.md
# Problem 02900

## Problem Statement

You are given an integer n. Find the number of positive integers x such that 1 ≤ x ≤ n and x divides n.

## Input

The first line contains a single integer n (1 ≤ n ≤ 1000).

## Output

Print a single integer — the number of positive integers x such that 1 ≤ x ≤ n and x divides n.

## Examples

input
```
1
```
output
```
1
```

input
```
2
```
output
```
2
```

input
```
3
```
output
```
2
```

input
```
4
```
output
```
3
```

input
```
5
```
output
```
2
```

input
```
6
```
output
```
4
```

input
```
7
```
output
```
2
```

input
```
8
```
output
```
4
```

input
```
9
```
output
```
3
```

input
```
10
```
output
```
4
```

input
```
11
```
output
```
2
```

input
```
12
```
output
```
6
```

input
```
13
```
output
```
2
```

input
```
14
```
output
```
4
```

input
```
15
```
output
```
4
```

input
```
16
```
output
```
5
```

input
```
17
```
output
```
2
```

input
```
18
```
output
```
6
```

input
```
19
```
output
```
2
```

input
```
20
```
output
```
5
```

input
```
21
```
output
```
4
```

input
```
22
```
output
```
4
```

input
```
23
```
output
```
2
```

input
```
24
```
output
```
8
```

input
```
25
```
output
```
3
```

input
```
26
```
output
```
4
```

input
```
27
```
output
```
5
```

input
```
28
```
output
```
6
```

input
```
29
```
output
```
2
```

input
```
30
```
output
```
8
```

input
```
31
```
output
```
2
```

input
```
32
```
output
```
6
```

input
```
33
```
output
```
4
```

input
```
34
```
output
```
4
```

input
```
35
```
output
```
4
```

input
```
36
```
output
```
9
```

input
```
37
```
output
```
2
```

input
```
38
```
output
```
4
```

input
```
39
```
output
```
4
```

input
```
40
```
output
```
7
```

input
```
41
```
output
```
2
```

input
```
42
```
output
```
8
```

input
```
43
```
output
```
2
```

input
```
44
```
output
```
6
```

input
```
45
```
output
```
6
```

input
```
46
```
output
```
4
```

input
```
47
```
output
```
2
```

input
```
48
```
output
```
10
```

input
```
49
```
output
```
4
```

input
```
50
```
output
```
7
```

input
```
51
```
output
```
4
```

input
```
52
```
output
```
6
```

input
```
53
```
output
```
2
```

input
```
54
```
output
```
9
```

input
```
55
```
output
```
4
```

input
```
56
```
output
```
8
```

input
```
57
```
output
```
4
```

input
```
58
```
output
```
4
```

input
```
59
```
output
```
2
```

input
```
60
```
output
```
10
```

input
```
61
```
output
```
2
```

input
```
62
```
output
```
4
```

input
```
63
```
output
```
6
```

input
```
64
```
output
```
7
```

input
```
65
```
output
```
4
```

input
```
66
```
output
```
8
```

input
```
67
```
output
```
2
```

input
```
68
```
output
```
6
```

input
```
69
```
output
```
4
```

input
