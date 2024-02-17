text = "\t\t\ttab tab tabulates"
a = text.split('\n')
b = []
for i in range(len(a)):
    c = a[i].replace('\t', '    ')
    b.append(c)
print('\n'.join(b))