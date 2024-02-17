a,b,c,d=map(int,"1 1 3 4".split())
if a==b and c==d:
    print('yes')
elif a==c and b==d:
    print('yes')
elif a==d and b==c:
    print('yes')
else:
    print('no')
