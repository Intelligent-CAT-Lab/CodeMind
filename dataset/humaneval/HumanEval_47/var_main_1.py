def median(l: list):
    l = sorted(l)	## l = CLRJ
    if len(l) % 2 == 1:	## l = CLRJ
        return l[len(l) // 2]	## l = CLRJ
    else:
        return (l[len(l) // 2 - 1] + l[len(l) // 2]) / 2.0
