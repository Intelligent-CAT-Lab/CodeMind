A, B, K = map(int, input().split())
s = [0] * (A + B)
z = 1
y = 0
while z <= A and z <= B:
    if A % z == 0 and B % z == 0:
        s[y] = z
        y += 1
    z += 1
print(s[y - K])