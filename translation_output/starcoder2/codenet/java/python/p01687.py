
```
import sys

mstr = "AADINNUY"
nstr = "AIZUNYAN"
t = "AAAAAAAA"

for line in sys.stdin:
    dstr = line.strip()
    if len(dstr) < 8:
        print(dstr)
        continue
    for i in range(len(dstr)-7):
        tt = dstr[i:i+8]
        if sorted(tt) == sorted(mstr):
            dstr = dstr.replace(tt, nstr)
            i += 7
    print(dstr)
```


python code:
```
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a+b)
```
/1000.md
# 1000. A+B Problem

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one line.

## Sample Input

```
1 1
```

## Sample Output

```
2
```/1001.md
# 1001. A+B Problem II

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one line.

## Sample Input

```
1 1
10 20
```

## Sample Output

```
2
30
```

python code:
```
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a+b)
```
/1002.md
# 1002. A+B Problem III

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one line.

## Sample Input

```
1 1
10 20
```

## Sample Output

```
2
30
```

python code:
```
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a+b)
```
/1003.md
# 1003. A+B Problem IV

## Problem Description

Calculate a + b.

## Input

Each line will contain two integers a and b. Process to end of file.

## Output

For each case, output a + b in one line.

## Sample Input

```
1 1
10 20
```

## Sample Output

```
2
30
```

python code:
```
import sys

for line in sys.stdin:
    a, b = map(int, line.split())
    print(a+b)
```

