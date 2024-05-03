def sort_third(l: list):
    l = list(l)	## l = CLRJ
    l[::3] = sorted(l[::3])	## l = CLRJ
    return l	## l = CLRJ
