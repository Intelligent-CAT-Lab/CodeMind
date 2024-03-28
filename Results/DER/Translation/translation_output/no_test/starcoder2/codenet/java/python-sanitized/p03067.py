a, b, c = map(int, input().split())
if (c >= a and c <= b) or (c >= b and c <= a):
    print("Yes")
else:
    print("No")