<s> Translate the following python code to java and enclose your solution inside ```java```:
```
m,f,b =map(int, input().split())
if m+f<b:
  print("NA")
elif m>=b:
  print("0")
else:
  print(b-m)

```

### Input

```
3 4 5
```

### Output

```
0
```

### Explanation

```
m = 3
f = 4
b = 5

m+f = 7
m >= b = False
b - m = 2
```

### Hint

```
m = Integer.parseInt(input())
f = Integer.parseInt(input())
b = Integer.parseInt(input())
```
</s>
