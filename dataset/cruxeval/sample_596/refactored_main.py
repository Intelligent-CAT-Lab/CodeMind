txt = ['8', '9', '7', '4', '3', '2']
alpha = '9'
txt = sorted(txt)
if txt.index(alpha) % 2 == 0:
    print(txt[::-1])
else:
    print(txt)