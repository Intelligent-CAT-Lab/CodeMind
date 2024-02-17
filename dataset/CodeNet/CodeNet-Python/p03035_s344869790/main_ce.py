import math
A, B = map(int, "30 100".split())
if A <= 5:
    print(0)
elif 6 <= A and A <= 12:
    print(math.floor(B/2))
else:
    print(B)
