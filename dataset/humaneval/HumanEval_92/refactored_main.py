x = 2
y = 3
z = 1

if isinstance(x,int) and isinstance(y,int) and isinstance(z,int):
    if (x+y==z) or (x+z==y) or (y+z==x):
        result = True
    else:
        result = False
else:
    result = False
print(result)