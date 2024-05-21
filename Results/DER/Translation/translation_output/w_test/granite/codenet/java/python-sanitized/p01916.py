s = input()

a = [0] * 26
b = [0] * 10001

for c in s:
    a[ord(c) - ord('a')] += 1

for i in range(26):
    b[a[i]] += 1

for i in range(9999, 0, -2):
    if b[i] > 0:
        b[i] -= 1
        break

m = 0

for i in range(1, 10000, 2):
    m += b[i]

if m % 2 == 0:
    print(m // 2)
else:
    print(m // 2 + 1)