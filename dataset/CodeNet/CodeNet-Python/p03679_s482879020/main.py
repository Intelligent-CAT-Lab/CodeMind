X, A, B = map(int, input().split(' '))

over = B - A

if over <= 0:
    print('delicious')
elif over <= X:
    print('safe')
else:
    print('dangerous')
