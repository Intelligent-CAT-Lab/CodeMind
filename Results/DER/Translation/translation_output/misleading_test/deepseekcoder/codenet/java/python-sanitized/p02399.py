a, b = map(int, input().split())

d = a//b
r = a%b
f = "{:.5f}".format(a/b)

print(d, r, f)