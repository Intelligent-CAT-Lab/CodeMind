h = int(input())
w = int(input())
s = int(input())
t = int(input())

if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")