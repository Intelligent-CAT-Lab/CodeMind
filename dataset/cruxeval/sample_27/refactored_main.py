w = 'flak'
ls = list(w)
omw = ''
while len(ls) > 0:
    omw += ls.pop(0)
    if len(ls) * 2 > len(w):
        print(w[len(ls):] == omw)
        break
print(False)