x, a, b = list(map(int,input().split()))
p = abs(x-a)
q = abs(x-b)
if p < q:
    print("A")
else:
    print("B")