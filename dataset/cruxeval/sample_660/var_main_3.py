def f(num):
    initial = [1]	## <state>initial = CLRJ</state>
    total = initial	## <state>total = CLRJ | initial = CLRJ</state>
    for _ in range(num):	## <state>_ = CLRJ | num = CLRJ</state>
        total = [1] + [x+y for x, y in zip(total, total[1:])]	## <state>total = CLRJ</state>
        initial.append(total[-1])	## <state>initial = CLRJ | total = CLRJ</state>
    return sum(initial)	## <state>initial = CLRJ</state>
