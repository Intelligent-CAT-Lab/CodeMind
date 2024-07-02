def f(dic):
    for k,v in sorted(dic.items(), key=lambda x: len(str(x)))[:-1]:
        dic.pop(k)
    return list(dic.items())
f({'11': 52, '65': 34, 'a': 12, '4': 52, '74': 31})