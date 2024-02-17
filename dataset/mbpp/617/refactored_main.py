steps = (3,4)
d = 11

(a, b) = steps
temp = a 
a = min(a, b) 
b = max(temp, b) 
if (d >= b): 
    print((d + b - 1) / b)
elif (d == 0): 
    print(0)
elif (d == a): 
    print(1)
else:
    print(2)