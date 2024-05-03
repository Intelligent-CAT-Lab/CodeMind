def fib4(n: int):
    results = [0, 0, 2, 0]	## results = CLRJ
    if n < 4:	## n = CLRJ
        return results[n]

    for _ in range(4, n + 1):	## _ = CLRJ|n = CLRJ
        results.append(results[-1] + results[-2] + results[-3] + results[-4])	## results = CLRJ
        results.pop(0)	## results = CLRJ

    return results[-1]	## results = CLRJ
