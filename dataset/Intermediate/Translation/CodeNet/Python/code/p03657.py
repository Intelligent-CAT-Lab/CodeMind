# ABC067 A - Sharing Cookies
a,b = map(int,input().split())

if a%3 == 0:
    print('Possible')
elif b%3 == 0:
    print('Possible')
elif (a+b)%3 == 0:
    print('Possible')
else:
    print('Impossible')