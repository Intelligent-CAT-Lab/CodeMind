E, Y = map(int, "0 2015".split())
if E == 0 :
    if 1868 <= Y <= 1911 :
        print('M', Y-1867, sep='')
    elif 1912 <= Y <= 1925 :
        print('T', Y-1911, sep='')
    elif 1926 <= Y <= 1988 :
        print('S', Y-1925, sep='')
    else :
        print('H', Y-1988, sep='')
elif E == 1 :
    print(Y+1867)
elif E == 2 :
    print(Y+1911)
elif E == 3 :
    print(Y+1925)
else :
    print(Y+1988)
