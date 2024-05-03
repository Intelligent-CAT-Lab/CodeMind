def f(lst):
    new = list()	## new = []
    i = len(lst)-1	## i = [] | lst = []
    for _ in range(len(lst)):	## _ = [] | lst = []
        if i%2 == 0:	## i = []
            new.append(-lst[i])	## new = [] | lst = [] | i = []
        else:
            new.append(lst[i])	## new = [] | lst = [] | i = []
        i -= 1	## i = []
    return new	## new = []
