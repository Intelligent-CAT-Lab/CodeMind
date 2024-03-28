

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

print(max(map(sum, itertools.combinations([a, b, c, d, e], 5))))

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

print((n-k)*(k-1)*6/(n**3) + (n-k)*3/(n**3) + 1/(n**3))

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

import math

n, m = map(int, input().split())

x = [0]*n
y = [0]*n
for i in range(n):
    x[i], y[i] = map(int, input().split())

ans = 0
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            for l in range(k+1, n):
                for m in range(l+1, n):
                    ans += math.sqrt((x[i]-x[j])**2+(y[i]-y[j])**2)
                    ans += math.sqrt((x[i]-x[k])**2+(y[i]-y[k])**2)
                    ans += math.sqrt((x[i]-x[l])**2+(y[i]-y[l])**2)
                    ans += math.sqrt((x[i]-x[m])**2+(y[i]-y[m])**2)
                    ans += math.sqrt((x[j]-x[k])**2+(y[j]-y[k])**2)
                    ans += math.sqrt((x[j]-x[l])**2+(y[j]-y[l])**2)
                    ans += math.sqrt((x[j]-x[m])**2+(y[j]-y[m])**2)
                    ans += math.sqrt((x[k]-x[l])**2+(y[k]-y[l])**2)
                    ans += math.sqrt((x[k]-x[m])**2+(y[k]-y[m])**2)
                    ans += math.sqrt((x[l]-x[m])**2+(y[l]-y[m])**2)

print(ans/math.factorial(n-5))

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
ABC029 D
"""

n = input()

ans = 0
for i in range(len(n)):
    ans += int(n[i])*(9**i)

print(ans)

```

java code:

```java

```

## E

```
#! /usr/bin/env python
# -*- coding: utf-8 -*-
#
