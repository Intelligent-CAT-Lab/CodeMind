H,A = map(int,"10 4".split())
if A == 0:
    print(0)
b = H/A//1
if H/A > b:
    print(int(b+1))
else:
    print(int(b))