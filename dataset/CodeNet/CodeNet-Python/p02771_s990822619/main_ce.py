A,B,C = "5 7 5".split()
if A == B and B == C:
    print("No")
elif A != B and B != C and C != A:
    print("No")
else:
    print("Yes")