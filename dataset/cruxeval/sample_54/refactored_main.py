text = 'happy'
s = 0
e = 3
sublist = text[s:e]
if not sublist:
    print(-1)
else:
    print(sublist.index(min(sublist)))