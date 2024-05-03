h = int(input())
w = int(input())
a = int(input())
b = int(input())

s1 = "0" * a + "1" * (w - a)
s2 = "1" * a + "0" * (w - a)

for i in range(h):
    if i < b:
        print(s1)
    else:
        print(s2)