import math
A, B = list(map(int, input().split()))
if A <= 5:
    print((0))
elif 6 <= A and A <= 12:
    print((math.floor(B/2)))
else:
    print(B)
