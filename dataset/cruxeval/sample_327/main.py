def f(lst):
    new = list()
    i = len(lst)-1
    for _ in range(len(lst)):
        if i%2 == 0:
            new.append(-lst[i])
        else:
            new.append(lst[i])
        i -= 1
    return new