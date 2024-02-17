n =7
x = 34
y = 12
if n == 1:
    print(y)
for i in range(2, n):
    if n % i == 0:
        print(y)
        break
else:
    print(x)