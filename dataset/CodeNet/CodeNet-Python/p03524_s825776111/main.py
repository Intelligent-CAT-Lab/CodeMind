S = input()
a = S.count("a")
b = S.count("b")
c = S.count("c")

if max(a, b, c)-min(a, b, c) >= 2:
    print("NO")
else:
    print("YES")