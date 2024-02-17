strs = 'K zBK'
strs = strs.split()
for i in range(1, len(strs), 2):
    strs[i] = ''.join(reversed(strs[i]))
print(' '.join(strs))