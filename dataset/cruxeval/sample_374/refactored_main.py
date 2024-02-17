seq = [ 'oH', 'ee', 'mb', 'deft', 'n', 'zz', 'f', 'abA' ]
v = 'zz'
a = []
for i in seq:
    if i.endswith(v):
        a.append(i*2)
print(a)