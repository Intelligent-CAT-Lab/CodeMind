def p03243():
    n = int(input())
    for i in range(n, 1000):
        if i % 111 == 0:
            print(i)
            return

p03243()