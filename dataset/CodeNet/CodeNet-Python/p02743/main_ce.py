a,b,c = map(int,"2 3 9".split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')