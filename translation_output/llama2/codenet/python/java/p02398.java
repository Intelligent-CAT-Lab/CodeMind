<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
ans=0
for i in range(a,b+1):
    if c%i==0:
        ans+=1
print(ans)

```

### Input

```
4 5 6
```

### Output

```
2
```

### Explanation

```
a=4
b=5
c=6

for i in range(a,b+1):
    if c%i==0:
        ans+=1

ans=2
```
</s>
