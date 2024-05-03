def f(a):
    s = dict(list(a.items())	## s = CLRJ | a = CLRJ
    [::-1])
    return " ".join([str(i) for i in s.items()])	## i = CLRJ | s = CLRJ
