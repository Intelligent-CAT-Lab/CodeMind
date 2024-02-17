text = 'hzcw'
ls = list(text)
length = len(ls)
for i in range(length):
    ls.insert(i, ls[i])
print(''.join(ls).ljust(length * 2))