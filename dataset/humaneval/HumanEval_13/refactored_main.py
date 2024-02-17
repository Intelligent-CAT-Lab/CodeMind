a = 3
b = 7
while b:
    a, b = b, a % b
print(a)