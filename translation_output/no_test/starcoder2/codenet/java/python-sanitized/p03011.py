P = int(input())
Q = int(input())
R = int(input())

if P >= Q:
    if P >= R:
        max = Q + R
    else:
        max = P + Q
elif Q >= R:
    if Q >= P:
        max = P + R
    else:
        max = Q + R
elif R >= P:
    if R >= Q:
        max = P + Q
    else:
        max = P + R

print(max)