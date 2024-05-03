def f(num):
    initial = [1]	## initial = CLRJ
    total = initial	## total = CLRJ | initial = CLRJ
    for _ in range(num):	## _ = CLRJ | num = CLRJ
        total = [1] + [x+y for x, y in zip(total, total[1:])]	## total = CLRJ
        initial.append(total[-1])	## initial = CLRJ | total = CLRJ
    return sum(initial)	## initial = CLRJ
