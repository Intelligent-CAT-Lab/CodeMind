a = 'sierizam'
b = 'iz'
if b in a:
    print(b.join(a.partition(a[a.index(b) + 1])))
else:
    print(a)