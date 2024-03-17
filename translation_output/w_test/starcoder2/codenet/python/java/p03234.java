

```java

```


```

java code:

```java

```
/atcoder/abc/abc028/README.md
# AtCoder Beginner Contest 028

## A

```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
ABC028 A
"""

n = int(input())

if n <= 59:
    print("Bad")
elif n <= 89:
    print("Good")
elif n <= 99:
    print("Great")
else:
    print("Perfect")

```

java code:

```java

```

## B

```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
ABC028 B
"""

s = input()

print(s.count("A"), s.count("B"), s.count("C"), s.count("D"), s.count("E"), s.count("F"))

```

java code:

```java

```

## C

```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
ABC028 C
"""

import itertools

a, b, c, d, e = map(int, input().split())

li = [a, b, c, d, e]

ans = 0
for i in itertools.combinations(li, 5):
    ans = max(ans, sum(i))

print(ans)

```

java code:

```java

```

## D

```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
ABC028 D
"""

n, k = map(int, input().split())

ans = 0

ans += 6*(k-1)*(n-k)
ans += 3*(n-1)
ans += 1

print(ans/n**3)

```

java code:

```java

```

## E

```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
ABC028 E
"""

n, m = map(int, input().split())

xli = []
yli = []
for i in range(n):
    x, y = map(int, input().split())
    xli.append(x)
    yli.append(y)

xli.sort()
yli.sort()

ans = 0
for i in range(n):
    for j in range(m):
        ans += (xli[i]-xli[0])*(yli[j]-yli[0])

print(ans)

```

java code:

```java

```

## D

```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
ABC026 D
"""

import math

a, b, c = map(int, input().split())

def f(t):
    return a*t + b*math.sin(c*t*math.pi)

def bisection(f, a, b, eps=1e-10):
    if f(a)*f(b) > 0:
        return None
    while abs(b-a) > eps:
        c = (a+b)/2
        if f(c) == 0:
            return c
        elif f(a)*f(c) < 0:
            b = c
        else:
            a = c
    return (a+b)/2

print(bisection(f, 0, 100))

```

java code:

```java

```

## E

```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
# vim:fenc=utf-8
#

"""
ABC026 E
"""

import bisect

n = int(input())

xyli = []
for i in range(n):
    x, y = map(int, input().split())
    xyli.append((x, y))

xyli.sort()

ans = 0

yli = []
for x, y in xyli:
    i = bisect.bisect_left(yli, y)
    if i == len(yli):
        yli.append(y)
    else:
        yli[i]
