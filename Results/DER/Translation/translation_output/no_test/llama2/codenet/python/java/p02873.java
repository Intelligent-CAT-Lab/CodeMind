<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from sys import stdin
S = str(stdin.readline().rstrip())
#l = list(map(int, stdin.readline().rstrip().split()))
#A, B, C = map(int, stdin.readline().rstrip().split())
#S = [list(map(int, stdin.readline().rstrip().split())) for _ in range(h)]#hã®å®ç¾©ãå¿ããã«

n = len(S)+1
sho = [0]*n
dai = [0]*n

for i,s in enumerate(S):
    i += 1
    if s ==">":
        sho[i] = 0
    else:
        sho[i] = sho[i-1] + 1

for i,s in enumerate(S[::-1]):
    i = n-i-2
    if s == "<":
        dai[i]=0
    else:
        dai[i] = dai[i+1] +1

seq = [max(x,y) for x,y in zip(sho,dai)]

print(sum(seq))

```
</s>
