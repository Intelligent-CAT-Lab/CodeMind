x = 10
y = 20
if y < 0:
    result = -multiply_int(x, -y)
elif y == 0:
    result = 0
elif y == 1:
    result = x
else:
    result = x + multiply_int(x, y - 1)
print(result)