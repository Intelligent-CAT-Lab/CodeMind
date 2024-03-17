x, y = map(int, input().split())
crane = -(y/2) + 2*x
turtle = x - crane
if turtle < 0 or crane < 0 or turtle % 1 != 0 or crane % 1 != 0:
    print("No")
else:
    print("Yes")