n = int(input())

if n == 1:
    print('a')
elif n == 2:
    print("ab")
elif n == 3:
    print("abc")
else:
    for i in range(n // 4):
        print("abcd", end='')
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print("ab")
    elif t == 3:
        print("abc")