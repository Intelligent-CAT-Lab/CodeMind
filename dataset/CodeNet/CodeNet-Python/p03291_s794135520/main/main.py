s = eval(input())
count = 0
a = 0
q = s.count('?')
c = 3 * s.count('C') + q
p = pow(3, q-3)
for i in range(len(s)):
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
print((int(count*p) % 1000000007))