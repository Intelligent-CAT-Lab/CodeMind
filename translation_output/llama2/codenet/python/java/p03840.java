<s> Translate the following python code to java and enclose your solution inside ```java```:
```
I, O, T, J, L, S, Z = map(int, input().split())
if I and J and L:
  a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O
else:
  a = 0
b = (I//2 + J//2 + L//2)*2 + O
ans = max(a, b)
print(ans)
```

### Input

```
4 3 2 1 0
```

### Output

```
10
```

### Explanation

```
I = 4, J = 3, L = 2, O = 0

a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O

a = ((4-1)//2 + (3-1)//2 + (2-1)//2)*2 + 3 + 0

a = ((3)//2 + (2)//2 + (1)//2)*2 + 3 + 0

a = (1) + (2) + (1) + 3 + 0

a = 10

b = (I//2 + J//2 + L//2)*2 + O

b = (4//2 + 3//2 + 2//2)*2 + 0

b = (2) + (2) + (2) + 0

b = 6

ans = max(a, b)

ans = 10
```
</s>
