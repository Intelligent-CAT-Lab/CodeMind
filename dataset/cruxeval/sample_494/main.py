def f(num, l):
    t = ""
    while l > len(num):
        t += '0'
        l -= 1
    return t + num