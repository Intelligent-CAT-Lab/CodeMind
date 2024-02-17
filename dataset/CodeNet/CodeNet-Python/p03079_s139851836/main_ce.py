A, B, C = (int(i) for i in "2 2 2".strip().split(' '))
if A == B and B == C:
    print("Yes")
else:
    print("No")
