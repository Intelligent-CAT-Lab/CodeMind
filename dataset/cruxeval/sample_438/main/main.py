def f(string):
    bigTab = 100
    for i in range(10, 30):
        if 0 < string.count('\t') < 20:
            bigTab = i
            break
    return string.expandtabs(bigTab)