x1 = int(input())
y1 = int(input())
x2 = int(input())
y2 = int(input())

a = x2 - x1
b = y2 - y1
x3 = x2 - b
y3 = y2 + a
x4 = x3 - a
y4 = y3 - b

print(f"{x3} {y3} {x4} {y4}")