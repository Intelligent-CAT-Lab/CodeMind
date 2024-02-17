s = "A??C"
count = 0
a, c, q = 0, 0, 0
n = len(s)
for i in range(n):
    if s[i] == 'C':
        c += 1
    elif s[i] == '?':
        q += 1
    else:
        continue
c = 3 * c + q
p = pow(3, q-3)
for i in range(n):
    if s[i] == 'A':
        a += 3
    elif s[i] == 'C':
        c -= 3
    elif s[i] == 'B':
        count += 3*a*c
    else:
        c -= 1
        count += a*c
        a += 1
print(int(count*p) % 1000000007)