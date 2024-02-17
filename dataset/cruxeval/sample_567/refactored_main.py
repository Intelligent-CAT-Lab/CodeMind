s = 'one two three four five'
n = 3
ls = s.rsplit()
out = []
while len(ls) >= n:
    out += ls[-n:]
    ls = ls[:-n]
print(ls + ['_'.join(out)])