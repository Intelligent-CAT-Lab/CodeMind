a,b = [int(i) for i in input().split()]

if a>0:
    print('Positive')

elif a<0 and b>0:
    print('Zero')

elif (b-a)%2 == 0:
    print('Negative')
else:
    print('Positive')
