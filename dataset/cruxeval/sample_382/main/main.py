def f(a):
    s = dict(list(a.items())
    [::-1])
    return " ".join([str(i) for i in list(s.items())])