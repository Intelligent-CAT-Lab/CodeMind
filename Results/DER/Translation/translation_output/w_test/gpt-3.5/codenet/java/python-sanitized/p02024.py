h, w, s, t = map(int, input().split())
if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")