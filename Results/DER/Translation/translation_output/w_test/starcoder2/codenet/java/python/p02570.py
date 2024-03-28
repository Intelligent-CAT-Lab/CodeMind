
```python
import sys

d,t,s=map(int,input().split())
if d/s<=t:
    print("Yes")
else:
    print("No")
```


```

python code:
```python
import sys

n=int(input())
a=list(map(int,input().split()))
a.sort()
ans=0
for i in range(n):
    ans+=a[i]*(n-i)
print(ans)
```
/p02570.md
# p02570

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 15 80

Expected output:
Yes


```
import java.util.*;
import java
