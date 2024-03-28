# Test input from user
a, b = map(int, input().split())

d = a // b
r = a % b
f = "{:.5f}".format(a/b)

print(f"{d} {r} {f}")