X, A, B = map(int, "4 3 6".split(' '))
over = B - A
if over <= 0:
    print('delicious')
elif over <= X:
    print('safe')
else:
    print('dangerous')
