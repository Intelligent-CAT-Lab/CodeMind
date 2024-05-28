a = 3
b = 4
if b==0:
    result = 1
elif a==0:
    result = 0
elif b==1:
    result = a
else:
    for i in range(b-1):
        a *= a
    result = a
print(result)