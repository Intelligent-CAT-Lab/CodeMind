def f(list_, num):
    temp = []
    for i in list_:
        i = num // 2 * ('%s,' % i)
        temp.append(i)
    return temp