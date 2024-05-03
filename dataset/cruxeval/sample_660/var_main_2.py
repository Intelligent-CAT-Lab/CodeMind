def f(num):
    initial = [1]	## initial = []
    total = initial	## total = [] | initial = []
    for _ in range(num):	## _ = [] | num = []
        total = [1] + [x+y for x, y in zip(total, total[1:])]	## total = []
        initial.append(total[-1])	## initial = [] | total = []
    return sum(initial)	## initial = []
