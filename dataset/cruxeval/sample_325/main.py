def f(s):
    l = list(s)
    for i in range(len(l)):
        l[i] = l[i].lower()
        if not l[i].isdigit():
            return False
    return True