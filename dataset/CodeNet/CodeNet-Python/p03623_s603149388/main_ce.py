x, a, b = map(int,"5 2 7".split())
p = abs(x-a)
q = abs(x-b)
if p < q:
    print("A")
else:
    print("B")