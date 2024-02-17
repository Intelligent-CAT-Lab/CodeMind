s = 'crew'
r = []
for i in range(len(s) - 1, 0 - 1, -1):
    r += s[i]
print(''.join(r))