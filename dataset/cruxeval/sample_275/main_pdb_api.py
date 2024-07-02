def f(dic):
    dic2 = dict(zip(dic.values(), dic.keys()))
    return dic2
f({-1: "a", 0: "b", 1: "c"})