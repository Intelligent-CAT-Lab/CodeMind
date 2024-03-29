<s> Translate the following python code to java and enclose your solution inside ```java```:
```
sx,sy,tx,ty = map(int,input().split())
x = (tx-sx)
y = (ty-sy)

order = "L"

order += "U"*(y+1)
order += "R"*(x+1)
order += "D"

order += "R"
order += "D"*(y+1)
order += "L"*(x+1)
order += "U"

order += "U"*y
order += "R"*x
order += "D"*y
order += "L"*x
print(order)

```

### Input

```
10 10 10 10
```

### Output

```
LURDLURDLURDLURD
```

### Explanation

```
LURDLURDLURDLURD
```

### Hint

```
LURDLURDLURDLURD
```
</s>
