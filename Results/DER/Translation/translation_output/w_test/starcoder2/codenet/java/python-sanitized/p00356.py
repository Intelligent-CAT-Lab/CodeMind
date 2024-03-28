x, y = map(int, input().split())
p = 0
a = x
b = y
while x % y != 0:
    z = x
    x = y
    y = z % y
m = a + b - y

if a % 2 == 0 or b % 2 == 0 or a == b or a % 2 > 0 and b % 2 > 0:
    print(m + 1)
else:
    print(m)