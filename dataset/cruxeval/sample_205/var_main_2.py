def f(a):
    for _ in range(10):	## _ = []
        for j in range(len(a)):	## j = [] | a = []
            if a[j] != '#':	## a = [] | j = []
                a = a[j:]	## a = [] | j = []
                break
        else:
            a = ""
            break
    while a[-1] == '#':	## a = []
        a = a[:-1]	## a = []
    return a	## a = []
