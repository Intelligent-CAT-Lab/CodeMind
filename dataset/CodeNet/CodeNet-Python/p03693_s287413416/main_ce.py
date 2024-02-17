r, g, b = map(int,"4 3 2".split())
answer = r*100 + g*10 + b
if answer % 4 == 0:
    print("YES")
else:
    print("NO")
