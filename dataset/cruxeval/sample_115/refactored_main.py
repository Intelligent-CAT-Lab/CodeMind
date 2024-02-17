text = 'os||agx5'
res = []
for ch in text.encode('utf-8'):
    if ch == 61:
        break
    if ch == 0:
        pass
    res.append(f'{ch}; '.encode('utf-8'))
print(b''.join(res))