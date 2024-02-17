A,B = (int(i) for i in "4 5".split())
if A % 3 == 0 or B % 3 == 0 or (A + B) % 3 == 0:
    print('Possible')
else:
    print('Impossible')