txt = '#[)[]>[^e>\n 8'
marker = -5
a = []
lines = txt.split('\n')
for line in lines:
    a.append(line.center(marker))
print('\n'.join(a))