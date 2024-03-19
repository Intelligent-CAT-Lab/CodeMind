# Sample test case
m, f, b = map(int, input().split())

if b > m + f:
    print("NA")
elif b > m:
    print(b - m)
else:
    print("0")