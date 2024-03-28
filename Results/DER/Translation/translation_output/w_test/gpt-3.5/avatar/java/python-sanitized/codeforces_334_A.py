def codeforces_334_A():
    n = int(input())
    square = n * n
    odd = []
    even = []

    for i in range(1, square + 1):
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)

    loop = square // n
    div = loop // 2

    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                print(odd.pop(0), even.pop())
            else:
                print(even.pop(0), odd.pop())
        print()

codeforces_334_A()