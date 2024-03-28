def read_ints():
    return map(int, input().strip().split())

a, b, c = read_ints()

i = (a + b == c)
j = (a + c == b)
k = (b + c == a)

if i or j or k:
    print("Yes")
else:
    print("No")