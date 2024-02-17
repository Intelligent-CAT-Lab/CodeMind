string = '    jcmfxv     '
l = list(string)
for i in reversed(range(len(l))):
    if l[i] != ' ':
        break
    l.pop(i)
print(''.join(l))