s = 'hi'
d = 'abcdefghijklmnopqrstuvwxyz'
out = ''
for c in s:
    if c in d:
        out += d[(d.index(c)+2*2) % 26]
    else:
        out += c
print(out)