<s> Translate the following python code to java and enclose your solution inside ```java```:
```
w,h,x,y = map(float,input().split())
mx,my = w/2,h/2
res= []
res.append(w*h/2)
if x==mx and y==my:
    res.append(1)
else:
    res.append(0)
print(res[0],res[1])
```

### Input

The first line contains 4 space separated integers `w,h,x,y` where `w,h` are the width and height of the rectangle and `x,y` are the coordinates of the rectangle.

### Output

Print the output in the format `res[0] res[1]` where `res[0]` is the area of the rectangle and `res[1]` is the value of the expression `x==mx and y==my`.

### Constraints

`1 <= w,h <= 100000`

`0 <= x,y <= w-1`

### Sample Input

```
10 10 5 5
```

### Sample Output

```
5 1
```

### Explanation

The rectangle has width `w=10` and height `h=10`. The coordinates of the rectangle are `(x=5,y=5)`. The area of the rectangle is `w*h/2=50`. The expression `x==mx and y==my` is `False`.

### Hint

You can use the `Math.sqrt()` method to find the square root of a number.
</s>
