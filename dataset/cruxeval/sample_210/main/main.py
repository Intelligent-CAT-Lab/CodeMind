def f(n, m, num):
    x_list = list(range(n, m+1))
    j = 0
    while True:
        j = (j + num) % len(x_list)
        if x_list[j] % 2 == 0:
            return x_list[j]