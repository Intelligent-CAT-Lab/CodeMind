text = 'qq0tt'
l = text.rpartition('0')
if l[2] == '':
    print('-1:-1')
else:
    print(f'{len(l[0])}:{l[2].find("0") + 1}')