w = int(input())
h = int(input())
x = int(input())
y = int(input())
ans = (w * h) / 2
a = 1 if x + x == w and y + y == h else 0
print(ans, a)