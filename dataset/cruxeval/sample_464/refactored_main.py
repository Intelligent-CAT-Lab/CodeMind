ans = '0'
if ans.isdecimal():
    total = int(ans) * 4 - 50
    total -= len([c for c in list(ans) if c not in '02468']) * 100
    print(total)
else:
    print('NAN')